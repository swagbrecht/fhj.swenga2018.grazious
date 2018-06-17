package at.fh.swenga.jpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import at.fh.swenga.jpa.dao.UserRepository;
import at.fh.swenga.jpa.model.UserModel;

@Controller
@RequestMapping(value = { "user" })
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = { "/" })
	public String index(Model model) {
		List<UserModel> users = userRepository.findAll();
		model.addAttribute("users", users);
		
		return "test";
	}
	
}
