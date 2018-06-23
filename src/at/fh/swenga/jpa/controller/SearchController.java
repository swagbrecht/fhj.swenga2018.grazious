package at.fh.swenga.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import at.fh.swenga.jpa.dao.GenderRepository;
import at.fh.swenga.jpa.dao.RegionRepository;
import at.fh.swenga.jpa.dao.SearchDao;
import at.fh.swenga.jpa.dao.UserRepository;
import at.fh.swenga.jpa.model.GenderModel;
import at.fh.swenga.jpa.model.RegionModel;
import at.fh.swenga.jpa.model.UserModel;

@Controller
@RequestMapping(value = { "search" })
public class SearchController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	GenderRepository genderRepository;
	
	@Autowired
	RegionRepository regionRepository;
	
	@Autowired
	SearchDao searchDao;
	
	@RequestMapping(value = { "/" })
	public String index(
			@RequestParam(value = "genders[]", required = false) GenderModel[] genders,
			@RequestParam(value = "regions[]", required = false) RegionModel[] regions,
			@RequestParam(value = "ageFrom", required = false) Integer ageFrom,
			@RequestParam(value = "ageTo", required = false) Integer ageTo,
			Model model) {
		UserModel user = getCurrentUser();
		
		List<UserModel> partners = searchDao.getUsers(genders, regions, ageFrom, ageTo);
		List<GenderModel> defaultGenders = genderRepository.findAll();
		List<RegionModel> defaultRegions = regionRepository.findAll();
		
		model.addAttribute("genders", genders);
		model.addAttribute("regions", regions);
		model.addAttribute("ageFrom", ageFrom);
		model.addAttribute("ageTo", ageTo);
		
		model.addAttribute("defaultGenders", defaultGenders);
		model.addAttribute("defaultRegions", defaultRegions);
		model.addAttribute("partners", partners);
		model.addAttribute("user", user);
		
		return "search/index";
	}
	
	private UserModel getCurrentUser() {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		UserModel user = userRepository.findByUsername(username);
		
		return user;
	}

	@ExceptionHandler(Exception.class)
	public String handleAllException(Exception ex) {
		return "error";
	}
	
}
