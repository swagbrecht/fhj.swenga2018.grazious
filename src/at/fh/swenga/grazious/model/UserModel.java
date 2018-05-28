package at.fh.swenga.grazious.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class UserModel implements java.io.Serializable{
	private static final long serialVersionUID=8198173157518983615L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false, unique=true)
	private String userName;
	private String password;
	private String vn;
	private String nn;
	private String email;
	
	private UserAussehenModel userAussehen;
	private UserCharakterModel userCharakter;
	private BezirkModel bezirk;
	

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date gebdat;
	
	private boolean enabled;
	
	private Set<UserRoleModel> userRole =new HashSet<UserRoleModel>(0);

}
