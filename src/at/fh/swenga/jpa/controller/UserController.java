package at.fh.swenga.jpa.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import at.fh.swenga.jpa.dao.PersonalCharacterRepository;
import at.fh.swenga.jpa.dao.RegionRepository;
import at.fh.swenga.jpa.dao.UserRepository;
import at.fh.swenga.jpa.model.PersonalCharacterModel;
import at.fh.swenga.jpa.model.PersonalCharacters;
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
	
	@RequestMapping(value = { "/{id}" })
	public String index(@PathVariable(value = "id") Integer id, Model model) {
		Optional<UserModel> user = userRepository.findById(id);
		model.addAttribute("user", user.get());
		
		return "user/index";
	}
	
	@RequestMapping(value = { "/update/{id}" })
	public String update(@PathVariable(value = "id") Integer id, Model model) {
		
		Optional<UserModel> user = userRepository.findById(id);
		List<PersonalCharacterModel> characters = characterRepository.findAll();
		List<RegionModel> regions = regionRepository.findAll();
		model.addAttribute("user", user.get());
		model.addAttribute("characters", characters);
		model.addAttribute("regions", regions);
		
		return "user/update";
	}
	
	@RequestMapping(value = { "/save/{id}" }, method = RequestMethod.POST)
	public String update(@PathVariable(value = "id") Integer id, @Valid UserModel userModel, BindingResult bindingResult, Model model) {
		UserModel user = userRepository.findById(id).get();
		
		if (bindingResult.hasErrors()) {
			model.addAttribute("bindingResult", bindingResult);
			return "forward:/user/update/" + id;
		}
		
		user.setFirstName(userModel.getFirstName());
		user.setLastName(userModel.getLastName());
		user.setEmail(userModel.getEmail());
		user.setRegion(userModel.getRegion());
		
		userRepository.save(user);
		
		return "redirect:/user/" + user.getUserId();
	}
	
	@RequestMapping(value = { "/saveLook/{id}" }, method = RequestMethod.POST)
	public String update(
			@PathVariable(value = "id") Integer id,
			@RequestParam(value = "hasPiercing") Boolean hasPiercing,
			@RequestParam(value = "hasTattoos") Boolean hasTattoos,
			@Valid UserModel userModel,
			BindingResult bindingResult, 
			Model model) {
		UserModel user = userRepository.findById(id).get();
				
		if (!bindingResult.hasFieldErrors("height"))
			user.setHeight(userModel.getHeight());
		
		user.setHairColor(userModel.getHairColor());
		user.setHairLength(userModel.getHairLength());
		user.setEyeColor(userModel.getEyeColor());
		user.setBodyType(userModel.getBodyType());
		user.setHasPiercing(hasPiercing);
		user.setHasTattoos(hasTattoos);
		
		userRepository.save(user);

		return "redirect:/user/" + user.getUserId();
	}
	
}
