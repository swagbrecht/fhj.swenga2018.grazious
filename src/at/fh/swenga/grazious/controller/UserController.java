package at.fh.swenga.grazious.controller;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import at.fh.swenga.grazious.dao.UserDao;
import at.fh.swenga.grazious.model.AugenfarbeModel;
import at.fh.swenga.grazious.model.BezirkeModel;
import at.fh.swenga.grazious.model.GeschlechtModel;
import at.fh.swenga.grazious.model.HaarfarbeModel;
import at.fh.swenga.grazious.model.UserModel;

@Controller
public class UserController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = { "/", "list" })
	public String index(Model model) {
 
		List<UserModel> users = UserDao.getUsers();
		model.addAttribute("user", users);
		return "index";
	}
 
	@RequestMapping("/fillUserList")
	@Transactional
	public String fillData(Model model) {
 
 
		Date now = new Date();
		
		AugenfarbeModel au1= new AugenfarbeModel("hellblau");
		AugenfarbeModel au2= new AugenfarbeModel("dunkelblau");
		AugenfarbeModel au3= new AugenfarbeModel("grau");
		AugenfarbeModel au4= new AugenfarbeModel("grün");
		AugenfarbeModel au5= new AugenfarbeModel("hellbraun");
		AugenfarbeModel au6= new AugenfarbeModel("dunkelbraun");
		
		BezirkeModel b1= new BezirkeModel("Innere Stadt", "8010");
		BezirkeModel b2= new BezirkeModel("Sankt Leonhard", "8010");
		BezirkeModel b3= new BezirkeModel("Geidorf", "8010");
		BezirkeModel b4= new BezirkeModel("Lend", "8020");
		BezirkeModel b5= new BezirkeModel("Gries", "8020");	
		BezirkeModel b6= new BezirkeModel("Jakomini", "8010");
		BezirkeModel b7= new BezirkeModel("Liebenau", "8041");
		BezirkeModel b8= new BezirkeModel("Sankt Peter", "8042");
		BezirkeModel b9= new BezirkeModel("Waltendorf", "8010");
		BezirkeModel b10= new BezirkeModel("Ries", "8010");
		BezirkeModel b11= new BezirkeModel("Mariatrost", "8043");
		BezirkeModel b12= new BezirkeModel("Andritz", "8045");
		BezirkeModel b13= new BezirkeModel("Gösting", "8051");
		BezirkeModel b14= new BezirkeModel("Eggenberg", "8020");
		BezirkeModel b15= new BezirkeModel("Wetzelsdorf", "8052");
		BezirkeModel b16= new BezirkeModel("Straßgang", "8054");
		BezirkeModel b17= new BezirkeModel("Puntigam", "8055");
		
		GeschlechtModel g1=new GeschlechtModel ("männlich");
		GeschlechtModel g2=new GeschlechtModel ("weiblich");
		GeschlechtModel g3=new GeschlechtModel ("anderes");
		
		HaarfarbeModel haa1=new HaarfarbeModel("Platinblond");
		HaarfarbeModel haa2=new HaarfarbeModel("Mittelblond");
		HaarfarbeModel haa3=new HaarfarbeModel("Dunkelblond");
		HaarfarbeModel haa4=new HaarfarbeModel("Hellbraun");
		HaarfarbeModel haa5=new HaarfarbeModel("Mittelbraun");
		HaarfarbeModel haa6=new HaarfarbeModel("Dunkelbraun");
		HaarfarbeModel haa7=new HaarfarbeModel("Kupferrot");
		HaarfarbeModel haa8=new HaarfarbeModel("Schwarz");
		HaarfarbeModel haa9=new HaarfarbeModel("Rot");
		HaarfarbeModel haa10=new HaarfarbeModel("Blau");
		HaarfarbeModel haa11=new HaarfarbeModel("Grün");
		HaarfarbeModel haa12=new HaarfarbeModel("Weiß");
		HaarfarbeModel haa13=new HaarfarbeModel("Grau");
		HaarfarbeModel haa14=new HaarfarbeModel("Pink");
		
		
		
		
		UserModel p1 = new UserModel("adi2002", "Adalbert", "Bergmann", "123", "adalbert.bergmann@graz.at");
		userDao.persist(p1);
 
 
		return "forward:list";
	}
 
	@RequestMapping("/searchUserAllgemeins")
	public String search(Model model, @RequestParam String searchString) {
		model.addAttribute("userAllgemeins", userDao.searchUserAllgemein(searchString));
		return "index";
	}
 
	@RequestMapping("/delete")
	public String deleteData(Model model, @RequestParam int id) {
		userDao.delete(id);
 
		return "forward:list";
	}
 
	// @ExceptionHandler(Exception.class)
	public String handleAllException(Exception ex) {
 
		return "error";
 
	}
}
