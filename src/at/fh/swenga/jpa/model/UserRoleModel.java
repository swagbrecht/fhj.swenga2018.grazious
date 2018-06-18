package at.fh.swenga.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userRole")
public class UserRoleModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	@Id
	@Column(name = "userRoleId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userRoleId;
	
	@Column(name = "name", nullable = false, length = 45)
	private String name;

	public UserRoleModel() {
		super();
	}

	public UserRoleModel(String name) {
		super();
		this.name = name;
	}

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}