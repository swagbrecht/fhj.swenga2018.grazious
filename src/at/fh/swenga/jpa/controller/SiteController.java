package at.fh.swenga.jpa.controller;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import at.fh.swenga.jpa.dao.PersonalCharacterRepository;
import at.fh.swenga.jpa.dao.UserRepository;
import at.fh.swenga.jpa.model.GenderModel;
import at.fh.swenga.jpa.model.PersonalCharacterModel;
import at.fh.swenga.jpa.model.PhotoModel;
import at.fh.swenga.jpa.model.RegionModel;
import at.fh.swenga.jpa.model.UserModel;

@Controller
@RequestMapping(value = { "/" })
public class SiteController {
	
	@Autowired
	UserRepository userRepository;

	@Autowired
	PersonalCharacterRepository personalCharacterRepository;
	
	@RequestMapping("/fill")
	@Transactional
	public String fill(Model model) {
		
		// personal characters
		PersonalCharacterModel personalCharacterModel1 = new PersonalCharacterModel("Nett");
		PersonalCharacterModel personalCharacterModel2 = new PersonalCharacterModel("Ängstlich");
		PersonalCharacterModel personalCharacterModel3 = new PersonalCharacterModel("Liebevoll");
		personalCharacterRepository.save(personalCharacterModel1);
		personalCharacterRepository.save(personalCharacterModel2);
		personalCharacterRepository.save(personalCharacterModel3);
		
		Set<PersonalCharacterModel> set1PersonalCharacter = new HashSet<>();
		set1PersonalCharacter.add(personalCharacterModel1);
		set1PersonalCharacter.add(personalCharacterModel2);
		
		Set<PersonalCharacterModel> set2PersonalCharacter = new HashSet<>();
		set2PersonalCharacter.add(personalCharacterModel1);
		set2PersonalCharacter.add(personalCharacterModel3);
		
		// genders
		GenderModel genderMaleModel = new GenderModel("m", "Männlich");
		GenderModel genderFemaleModel = new GenderModel("f", "Weiblich");
		
		// regions
		RegionModel regionAndritzModel = new RegionModel("Andritz");
		RegionModel regionPuntigamModel = new RegionModel("Puntigam");
		
		// photos
		Set<PhotoModel> set1PhotoModel = new HashSet<>();
		set1PhotoModel.add(new PhotoModel("1.jpg"));
		set1PhotoModel.add(new PhotoModel("2.jpg"));
		set1PhotoModel.add(new PhotoModel("3.jpg"));
		
		Set<PhotoModel> set2PhotoModel = new HashSet<>();
		set2PhotoModel.add(new PhotoModel("4.jpg"));
		set2PhotoModel.add(new PhotoModel("5.jpg"));
		set2PhotoModel.add(new PhotoModel("6.jpg"));
		set2PhotoModel.add(new PhotoModel("7.jpg"));
		
		// users
		Calendar birthday1 = Calendar.getInstance();
		birthday1.set(1990, 1, 15);
		
		Calendar birthday2 = Calendar.getInstance();
		birthday2.set(1950, 10, 20);
		
		UserModel userModel1 = new UserModel(genderMaleModel, regionPuntigamModel, "mustermax", "pa$$w0rd", "Max", "Mustermann", "max@mustermann.at", birthday1, "This is a short text about my life.", "Braun", "Kurz", "Braun", "Schlank", 180, false, true, true, false);
		userModel1.setPhotos(set1PhotoModel);
		userModel1.setPersonalCharacters(set1PersonalCharacter);
		
		UserModel userModel2 = new UserModel(genderFemaleModel, regionAndritzModel, "janedoe", "pa$$w0rd", "Jane", "Doe", "jane@doe.com", birthday2, "I don't know what to write here.", "Hell", "Lang", "Grün", "Schlank", 165, true, true, true, true);
		userModel2.setPhotos(set2PhotoModel);
		userModel2.setPersonalCharacters(set2PersonalCharacter);
	
		userRepository.save(userModel1);
		userRepository.save(userModel2);
		
		return "index";
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
		return "index";
	}

	@ExceptionHandler(Exception.class)
	public String handleAllException(Exception ex) {

		return "error";

	}
}
