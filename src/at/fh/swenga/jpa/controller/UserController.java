package at.fh.swenga.jpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import at.fh.swenga.jpa.dao.UserRepository;
import at.fh.swenga.jpa.model.UserModel;

@Controller
@RequestMapping(value = { "user" })
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = { "/" })
	public String index(@RequestParam(value = "id") Integer id, Model model) {
		
		Optional<UserModel> user = userRepository.findById(id);
		model.addAttribute("user", user.get());
		
		return "user/index";
	}
	
}
