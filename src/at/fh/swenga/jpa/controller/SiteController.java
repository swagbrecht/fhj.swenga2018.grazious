package at.fh.swenga.jpa.controller;

import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import at.fh.swenga.jpa.dao.GenderRepository;
import at.fh.swenga.jpa.dao.MessageRepository;
import at.fh.swenga.jpa.dao.PersonalCharacterRepository;
import at.fh.swenga.jpa.dao.PhotoRepository;
import at.fh.swenga.jpa.dao.RegionRepository;
import at.fh.swenga.jpa.dao.UserRepository;
import at.fh.swenga.jpa.dao.UserRoleRepository;
import at.fh.swenga.jpa.model.GenderModel;
import at.fh.swenga.jpa.model.MessageModel;
import at.fh.swenga.jpa.model.PersonalCharacterModel;
import at.fh.swenga.jpa.model.PhotoModel;
import at.fh.swenga.jpa.model.RegionModel;
import at.fh.swenga.jpa.model.UserModel;
import at.fh.swenga.jpa.model.UserRoleModel;

@Controller
@RequestMapping(value = { "/" })
public class SiteController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserRoleRepository userRoleRepository;
	
	@Autowired
	GenderRepository genderRepository;
	
	@Autowired
	RegionRepository regionRepository;

	@Autowired
	PersonalCharacterRepository personalCharacterRepository;
	
	@Autowired
	MessageRepository messageRepository;
	
	@Autowired
	PhotoRepository photoRepository;
	
	@RequestMapping(value = { "/" })
	public String index(Model model) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		UserModel user = userRepository.findByUsername(username);
        model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping(value = { "/about" }, method = RequestMethod.GET)
	public String about(Model model) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		UserModel user = userRepository.findByUsername(username);
        model.addAttribute("user", user);
		return "about";
	}
	
	@RequestMapping(value = { "/impr" }, method = RequestMethod.GET)
	public String impr(Model model) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		UserModel user = userRepository.findByUsername(username);
        model.addAttribute("user", user);
		return "impr";
	}
	
	@RequestMapping(value = { "/register" })
	public String register(Model model) {
		List<GenderModel> genders = genderRepository.findAll();
		List<RegionModel> regions = regionRepository.findAll();
		model.addAttribute("genders", genders);
		model.addAttribute("regions", regions);
		return "register";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null)
	    	new SecurityContextLogoutHandler().logout(request, response, auth);
	    
	    return "redirect:/login?logout";
	}
	
	@RequestMapping("/fill")
	@Transactional
	public String fill(Model model) {
		
		// personal characters
		PersonalCharacterModel personalCharacterModel1 = new PersonalCharacterModel("Nett");
		PersonalCharacterModel personalCharacterModel2 = new PersonalCharacterModel("�ngstlich");
		PersonalCharacterModel personalCharacterModel3 = new PersonalCharacterModel("Liebevoll");
		personalCharacterRepository.save(personalCharacterModel1);
		personalCharacterRepository.save(personalCharacterModel2);
		personalCharacterRepository.save(personalCharacterModel3);
		
		Set<PersonalCharacterModel> set1PersonalCharacter = new HashSet<>();
		set1PersonalCharacter.add(personalCharacterModel1);
		set1PersonalCharacter.add(personalCharacterModel2);
		
		Set<PersonalCharacterModel> set3PersonalCharacter = new HashSet<>();
		set3PersonalCharacter.add(personalCharacterModel1);
		set3PersonalCharacter.add(personalCharacterModel3);
		
		// genders
		GenderModel genderMaleModel = new GenderModel("m", "M�nnlich");
		GenderModel genderFemaleModel = new GenderModel("f", "Weiblich");
		
		// regions
		RegionModel regionAndritzModel = new RegionModel("Andritz");
		RegionModel regionPuntigamModel = new RegionModel("Puntigam");
		
		// user roles
		UserRoleModel userRoleAdmin = new UserRoleModel("ROLE_ADMIN");
		UserRoleModel userRoleUser = new UserRoleModel("ROLE_USER");
		UserRoleModel userRolePremium= new UserRoleModel("ROLE_PREMIUM");
		userRoleRepository.save(userRoleAdmin);
		userRoleRepository.save(userRoleUser);
		userRoleRepository.save(userRolePremium);
		
		// users
		Calendar birthday1 = Calendar.getInstance();
		birthday1.set(1990, 1, 15);
		
		Calendar birthday2 = Calendar.getInstance();
		birthday2.set(1950, 10, 20);
		
		UserModel userMax = new UserModel(genderMaleModel, regionPuntigamModel, "mustermax", "pa$$w0rd", "Max", "Mustermann", "max@mustermann.at", birthday1, "This is a short text about my life.", "Braun", "Kurz", "Braun", "Schlank", 180, false, true, true, false);
		userMax.encryptPassword();
		userMax.setPersonalCharacters(set1PersonalCharacter);
		userMax.addUserRole(userRoleAdmin);
		userMax.addUserRole(userRoleUser);
		userMax.addUserRole(userRolePremium);
		
		UserModel userJohn = new UserModel(genderMaleModel, regionAndritzModel, "johndoe", "pa$$w0rd", "Jahn", "Doe", "john@doe.com", birthday2, "I don't know what to write here.", "Braun", "Kurz", "Braun", "Schlank", 190, true, false, true, true);
		userJohn.encryptPassword();
		userJohn.addUserRole(userRoleUser);
		
		UserModel userJane = new UserModel(genderFemaleModel, regionAndritzModel, "janedoe", "pa$$w0rd", "Jane", "Doe", "jane@doe.com", birthday2, "I also don't know what to write here.", "Hell", "Lang", "Gr�n", "Schlank", 165, true, true, true, true);
		userJane.encryptPassword();
		userJane.setPersonalCharacters(set3PersonalCharacter);
		userJane.addUserRole(userRoleUser);
		
		userRepository.save(userMax);
		userRepository.save(userJohn);
		userRepository.save(userJane);
		
		// photos
		PhotoModel photo1 = new PhotoModel("1.jpg", userMax);
		PhotoModel photo2 = new PhotoModel("2.jpg", userMax);
		PhotoModel photo3 = new PhotoModel("3.jpg", userMax);
		PhotoModel photo4 = new PhotoModel("4.jpg", userJane);
		PhotoModel photo5 = new PhotoModel("5.jpg", userJane);
		PhotoModel photo6 = new PhotoModel("6.jpg", userJane);
		photoRepository.save(photo1);
		photoRepository.save(photo2);
		photoRepository.save(photo3);
		photoRepository.save(photo4);
		photoRepository.save(photo5);
		photoRepository.save(photo6);
		
		// messages
		MessageModel messageMaxToJane1 = new MessageModel(userMax, userJane, "Hallo Jane!");
		MessageModel messageMaxToJane2 = new MessageModel(userMax, userJane, "Wie geht es dir?");
		MessageModel messageJaneToMax = new MessageModel(userJane, userMax, "Hi! Es geht gut. Dir?");
		MessageModel messageJaneToJohn = new MessageModel(userJane, userJohn, "Hey! Schreib bitte dem Max nicht!");
		MessageModel messageJoneToJane = new MessageModel(userJohn, userJane, "Okay!");
		messageRepository.save(messageMaxToJane1);
		messageRepository.save(messageMaxToJane2);
		messageRepository.save(messageJaneToMax);
		messageRepository.save(messageJaneToJohn);
		messageRepository.save(messageJoneToJane);
		
		return "index";
	}

	@ExceptionHandler(Exception.class)
	public String handleAllException(Exception ex) {
		return "error";
	}
	
}
