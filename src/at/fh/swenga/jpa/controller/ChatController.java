package at.fh.swenga.jpa.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import at.fh.swenga.jpa.dao.MessageRepository;
import at.fh.swenga.jpa.dao.UserRepository;
import at.fh.swenga.jpa.model.Conversation;
import at.fh.swenga.jpa.model.MessageModel;
import at.fh.swenga.jpa.model.UserModel;

@Controller
@RequestMapping(value = { "chat" })
public class ChatController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MessageRepository messageRepository;
	
	@RequestMapping(value = { "/" })
	public String index(Model model) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		UserModel user = userRepository.findByUsername(username);
		
		List<Conversation> conversations = conversations(user);
		
		model.addAttribute("user", user);
		model.addAttribute("conversations", conversations);
		
		return "chat/index";
	} 
	
	@RequestMapping(value = { "/with" })
	public String with(@RequestParam(value = "id") Integer id, Model model) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		UserModel user = userRepository.findByUsername(username);
		
		UserModel partner = userRepository.findById(id).get();
		
		List<Conversation> conversations = conversations(user);
		List<MessageModel> messages = messages(user, partner);
		
		model.addAttribute("user", user);
		model.addAttribute("partner", partner);
		model.addAttribute("conversations", conversations);
		model.addAttribute("messages", messages);
		
		return "chat/with";
	} 
	
	@RequestMapping(value = { "/send" })
	public String send(@RequestParam(value = "id") Integer id, @Valid MessageModel message, BindingResult bindingResult, Model model) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		UserModel user = userRepository.findByUsername(username);
		UserModel partner = userRepository.findById(id).get();
		
		message.setSender(user);
		message.setRecipient(partner);
		message.setTimestamp(Calendar.getInstance());
		
		messageRepository.save(message);
		return "forward:/chat/with?id" + id;
	}
	
	private List<MessageModel> messages(UserModel user1, UserModel user2) {
		List<MessageModel> messages = messageRepository.findAllBySenderAndRecipient(user1, user2);
		messages.addAll(messageRepository.findAllBySenderAndRecipient(user2, user1));
		return messages;
	}
	
	private List<Conversation> conversations(UserModel user) {
		List<MessageModel> partners = messageRepository.findAllBySender(user);		
		partners.addAll(messageRepository.findAllByRecipient(user));
		Collections.sort(partners, new Comparator<MessageModel>() {

			@Override
			public int compare(MessageModel o1, MessageModel o2) {
				if (o1.getTimestamp().before(o2.getTimestamp())) return -1;
				if (o1.getTimestamp().before(o2.getTimestamp())) return 1;
				return 0;
			}
			
		});

		List<Conversation> conversations = conversationsForUser(partners, user);
		conversations = uniqueConversations(conversations);
		
		return conversations;
	}
	
	private List<Conversation> conversationsForUser(List<MessageModel> messages, UserModel user) {
		List<Conversation> conversations = new ArrayList<>();
		
		for (MessageModel message : messages)
			conversations.add(new Conversation(message, user));
		
		return conversations;
	}
	
	private List<Conversation> uniqueConversations(List<Conversation> conversations) {
		List<Conversation> list = new ArrayList<>();
		
		for (Conversation conversation : conversations)
			if (!containConversation(list, conversation))
				list.add(conversation);
		
		return list;
	}
	
	private Boolean containConversation(List<Conversation> conversations, Conversation conversation) {
		for (Conversation c : conversations)
			if (c.getPartner().getUserId() == conversation.getPartner().getUserId())
				return true;
		
		return false;
	}
	
}