package at.fh.swenga.grazious.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;

import at.fh.swenga.grazious.dao.UserDao;
import at.fh.swenga.grazious.dao.UserRoleDao;
import at.fh.swenga.grazious.model.UserModel;
import at.fh.swenga.grazious.model.UserRoleModel;

@Controller
public class SecurityController {

	@Autowired
	UserDao userDao;

	@Autowired
	UserRoleDao userRoleDao;

	@RequestMapping("/fillUsers")
	@Transactional
	public String fillData(Model model) {

		UserRoleModel adminRole = userRoleDao.getRole("ROLE_ADMIN");
		if (adminRole == null)
			adminRole = new UserRoleModel("ROLE_ADMIN");

		UserRoleModel userRole = userRoleDao.getRole("ROLE_USER");
		if (userRole == null)
			userRole = new UserRoleModel("ROLE_USER");

		UserRoleModel premiumRole = userRoleDao.getRole("ROLE_PREMIUM");
		if (userRole == null)
			userRole = new UserRoleModel("ROLE_PREMIUM");

		UserModel admin = new UserModel("admin", "password", true);
		admin.encryptPassword();
		admin.addUserRole(userRole);
		admin.addUserRole(adminRole);
		userDao.persist(admin);

		UserModel user = new UserModel("user", "password", true);
		user.encryptPassword();
		user.addUserRole(userRole);
		userDao.persist(user);

		UserModel premium = new UserModel("", "", true);
		user.encryptPassword();
		user.addUserRole(userRole);
		userDao.persist(premium);

		return "forward:login";
	}

	@ExceptionHandler(Exception.class)
	public String handleAllException(Exception ex) {

		return "error";

	}
}
