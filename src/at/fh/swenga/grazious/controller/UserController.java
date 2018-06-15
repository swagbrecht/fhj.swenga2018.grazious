package at.fh.swenga.grazious.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import at.fh.swenga.grazious.dao.UserDao;
import at.fh.swenga.grazious.model.AugenfarbeModel;
import at.fh.swenga.grazious.model.BezirkeModel;
import at.fh.swenga.grazious.model.GeschlechtModel;
import at.fh.swenga.grazious.model.HaarfarbeModel;
import at.fh.swenga.grazious.model.HaarlaengeModel;
import at.fh.swenga.grazious.model.UserModel;

@Controller
public class UserController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = { "/", "list" })
	public String index(Model model) {
		List<UserModel> users = userDao.getUsers();
		model.addAttribute("users", users);
		return "index";
	}
 
	@RequestMapping("/fillUserList")
	@Transactional
	public String fillData(Model model) {
 
 
		Date now = new Date();
		
		AugenfarbeModel au1_hellblau= new AugenfarbeModel("hellblau");
		AugenfarbeModel au2_dunkelblau= new AugenfarbeModel("dunkelblau");
		AugenfarbeModel au3_grau= new AugenfarbeModel("grau");
		AugenfarbeModel au4_gruen= new AugenfarbeModel("gruen");
		AugenfarbeModel au5_hellbraun= new AugenfarbeModel("hellbraun");
		AugenfarbeModel au6_dunkelbraun= new AugenfarbeModel("dunkelbraun");
		
		BezirkeModel b1_InnereStadt= new BezirkeModel("Innere Stadt", "8010");
		BezirkeModel b2_StLeonhard= new BezirkeModel("Sankt Leonhard", "8010");
		BezirkeModel b3_Geidorf= new BezirkeModel("Geidorf", "8010");
		BezirkeModel b4_Lend= new BezirkeModel("Lend", "8020");
		BezirkeModel b5_Gries= new BezirkeModel("Gries", "8020");	
		BezirkeModel b6_Jakomini= new BezirkeModel("Jakomini", "8010");
		BezirkeModel b7_Liebenau= new BezirkeModel("Liebenau", "8041");
		BezirkeModel b8_StPeter= new BezirkeModel("Sankt Peter", "8042");
		BezirkeModel b9_Waltendorf= new BezirkeModel("Waltendorf", "8010");
		BezirkeModel b10_Ries= new BezirkeModel("Ries", "8010");
		BezirkeModel b11_Mariatrost= new BezirkeModel("Mariatrost", "8043");
		BezirkeModel b12_Andritz= new BezirkeModel("Andritz", "8045");
		BezirkeModel b13_Goesting= new BezirkeModel("Goesting", "8051");
		BezirkeModel b14_Eggenberg= new BezirkeModel("Eggenberg", "8020");
		BezirkeModel b15_Wetzelsdorf= new BezirkeModel("Wetzelsdorf", "8052");
		BezirkeModel b16_Strassgang= new BezirkeModel("Strassgang", "8054");
		BezirkeModel b17_Puntigam= new BezirkeModel("Puntigam", "8055");
		
		GeschlechtModel g1_m=new GeschlechtModel ("maennlich");
		GeschlechtModel g2_w=new GeschlechtModel ("weiblich");
		GeschlechtModel g3_a=new GeschlechtModel ("anderes");
		
		HaarfarbeModel haa1_pb=new HaarfarbeModel("Platinblond");
		HaarfarbeModel haa2_mb=new HaarfarbeModel("Mittelblond");
		HaarfarbeModel haa3_db=new HaarfarbeModel("Dunkelblond");
		HaarfarbeModel haa4_hb=new HaarfarbeModel("Hellbraun");
		HaarfarbeModel haa5_mb=new HaarfarbeModel("Mittelbraun");
		HaarfarbeModel haa6_db=new HaarfarbeModel("Dunkelbraun");
		HaarfarbeModel haa7_kr=new HaarfarbeModel("Kupferrot");
		HaarfarbeModel haa8_s=new HaarfarbeModel("Schwarz");
		HaarfarbeModel haa9_r=new HaarfarbeModel("Rot");
		HaarfarbeModel haa10_b=new HaarfarbeModel("Blau");
		HaarfarbeModel haa11_gr=new HaarfarbeModel("Gruen");
		HaarfarbeModel haa12_w=new HaarfarbeModel("Weiss");
		HaarfarbeModel haa13_g=new HaarfarbeModel("Grau");
		HaarfarbeModel haa14_p=new HaarfarbeModel("Pink");
		
		HaarlaengeModel hal1_keine = new HaarlaengeModel("keine");
		HaarlaengeModel hal2_sehrKurz= new HaarlaengeModel("sehr kurz");
		HaarlaengeModel hal3_kurz= new HaarlaengeModel("kurz");
		HaarlaengeModel hal4_ohren= new HaarlaengeModel("bis zu den Ohren");
		HaarlaengeModel hal5_kinn= new HaarlaengeModel("Kinnlaenge");
		HaarlaengeModel hal6_schulter= new HaarlaengeModel("Schulterlang");
		HaarlaengeModel hal7_brust= new HaarlaengeModel("bis zur Brust");
		HaarlaengeModel hal8_bauch= new HaarlaengeModel("bis zum Bauch");
		HaarlaengeModel hal9_huefte= new HaarlaengeModel("bis zur Huefte");
		HaarlaengeModel hal9_laenger= new HaarlaengeModel("Ueber die Huefte");
		
		
		
		
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
 
	@ExceptionHandler(Exception.class)
	public String handleAllException(Exception ex) {
 
		return "error";
 
	}
}
