package at.fh.swenga.grazious.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "user_roles")
public class UserRoleModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	
	@Id
	@Column(name = "userRoleId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userRoleId;
	private String role;
	@OneToMany(mappedBy="user_roles",fetch=FetchType.LAZY)
	private Set<UserModel> user;
	
	
	public UserRoleModel() {
		super();
	}

	public UserRoleModel(Integer userRoleId, String role, Set<UserModel> user) {
		super();
		this.userRoleId = userRoleId;
		this.role = role;
		this.user = user;
	}


	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Set<UserModel> getUser() {
		return user;
	}

	public void setUser(Set<UserModel> user) {
		this.user = user;
	}

	

	
	}
	