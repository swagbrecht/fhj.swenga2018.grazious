package at.fh.swenga.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import at.fh.swenga.jpa.dao.PersonalCharacterRepository;
import at.fh.swenga.jpa.dao.RegionRepository;
import at.fh.swenga.jpa.dao.UserRepository;
import at.fh.swenga.jpa.model.PersonalCharacterModel;
import at.fh.swenga.jpa.model.RegionModel;
import at.fh.swenga.jpa.model.UserModel;

@Controller
@RequestMapping(value = { "user" })
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PersonalCharacterRepository characterRepository;
	
	@Autowired
	RegionRepository regionRepository;
	
	@RequestMapping(value = { "/" })
	public String index(@RequestParam(value = "id") Integer id, Model model) {
		Optional<UserModel> user = userRepository.findById(id);
		model.addAttribute("user", user.get());
		
		return "user/index";
	}
	
	@RequestMapping(value = { "/update" })
	public String update(@RequestParam(value = "id") Integer id, Model model) {
		
		Optional<UserModel> user = userRepository.findById(id);
		List<PersonalCharacterModel> characters = characterRepository.findAll();
		List<RegionModel> regions = regionRepository.findAll();
		model.addAttribute("user", user.get());
		model.addAttribute("characters", characters);
		model.addAttribute("regions", regions);
		
		return "user/update";
	}
	
	
	
	@ExceptionHandler(Exception.class)
	public String handleAllException(Exception ex) {
		return "error";
	}
	
}
