package at.fh.swenga.jpa.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import at.fh.swenga.jpa.dao.PersonalCharacterRepository;
import at.fh.swenga.jpa.dao.PhotoRepository;
import at.fh.swenga.jpa.dao.RegionRepository;
import at.fh.swenga.jpa.dao.UserRepository;
import at.fh.swenga.jpa.model.PersonalCharacterModel;
import at.fh.swenga.jpa.model.PhotoModel;
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
	
	@Autowired
	PhotoRepository photoRepository;
	
	@Autowired
	ServletContext servletContext;
	
	@RequestMapping(value = { "/" })
	public String index(Model model) {
		UserModel user = getCurrentUser();
		
		return "redirect:/user/" + user.getUserId();
	}
	
	@RequestMapping(value = { "/{id}" })
	public String index(@PathVariable(value = "id") Integer id, Model model) {
		UserModel user = userRepository.findById(id).get();
		
		List<PhotoModel> photos = photoRepository.findAllByUser(user);
		
		model.addAttribute("user", user);
		model.addAttribute("photos", photos);
		
		return "user/index";
	}
	
	@RequestMapping(value = { "/update" })
	public String update(Model model) {
		UserModel user = getCurrentUser();
		
		List<PersonalCharacterModel> characters = characterRepository.findAll();
		List<RegionModel> regions = regionRepository.findAll();
		List<PhotoModel> photos = photoRepository.findAllByUser(user);
		
		model.addAttribute("user", user);
		model.addAttribute("characters", characters);
		model.addAttribute("regions", regions);
		model.addAttribute("photos", photos);
		
		return "user/update";
	}
	
	@RequestMapping(value = { "/save" }, method = RequestMethod.POST)
	public String update(@Valid UserModel userModel, BindingResult bindingResult, Model model) {
		UserModel user = getCurrentUser();
		
		if (bindingResult.hasErrors()) {
			model.addAttribute("bindingResult", bindingResult);
			return "forward:/user/update";
		}
		
		user.setFirstName(userModel.getFirstName());
		user.setLastName(userModel.getLastName());
		user.setEmail(userModel.getEmail());
		user.setRegion(userModel.getRegion());
		
		userRepository.save(user);
		
		return "redirect:/user/" + user.getUserId();
	}
	
	@RequestMapping(value = { "/saveLook" }, method = RequestMethod.POST)
	public String update(
			@RequestParam(value = "hasPiercing") Boolean hasPiercing,
			@RequestParam(value = "hasTattoos") Boolean hasTattoos,
			@Valid UserModel userModel,
			BindingResult bindingResult, 
			Model model) {
		UserModel user = getCurrentUser();
				
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
	
	@RequestMapping(value = { "/saveAbout" }, method = RequestMethod.POST)
	public String updateAbout(@Valid UserModel userModel, BindingResult bindingResult, Model model) {
		UserModel user = getCurrentUser();
				
		user.setAbout(userModel.getAbout());
		
		userRepository.save(user);

		return "redirect:/user/" + user.getUserId();
	}
	
	@RequestMapping(value = { "/uploadPhoto" }, method = RequestMethod.POST)
	public String uploadPhoto(@RequestParam("file") MultipartFile file, @Valid PhotoModel photoModel, Model model) {
		
		UserModel user = getCurrentUser();
		
		String extension = FilenameUtils.getExtension(file.getOriginalFilename());
		String filename = UUID.randomUUID().toString() + "." + extension;
		File imageFile = new File(servletContext.getRealPath("/resources/img/photos"), filename);
		
		try {
			file.transferTo(imageFile);
			photoModel.setFilename(filename);
			photoModel.setUser(user);
			photoRepository.save(photoModel);
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		return "redirect:/user/" + user.getUserId();
	}
	
	@RequestMapping(value = { "/uploadProfilePhoto" }, method = RequestMethod.POST)
	public String uploadProfilePhoto(@RequestParam("file") MultipartFile file, @Valid PhotoModel photoModel, Model model) {		
		UserModel user = getCurrentUser();
		
		String extension = FilenameUtils.getExtension(file.getOriginalFilename());
		String filename = UUID.randomUUID().toString() + "." + extension;
		File imageFile = new File(servletContext.getRealPath("/resources/img/profile"), filename);
		
		try {
			file.transferTo(imageFile);
			user.setFilename(filename);
			userRepository.save(user);
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		return "redirect:/user/" + user.getUserId();
	}
	
	private UserModel getCurrentUser() {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		UserModel user = userRepository.findByUsername(username);
		
		return user;
	}
	
}
