package at.fh.swenga.grazious.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="userRoles")
public class UserRoleModel implements java.io.Serializable{
	private static final long serialVersionUID=8198173157518983615L;
	
	private int Id;
	private UserModel user;
	private String role;
	
	

}
