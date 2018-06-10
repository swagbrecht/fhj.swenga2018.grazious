package at.fh.swenga.jpa.model;

import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "user")
public class UserModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
 
	@Id
	@Column(name = "userId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String un;
	private String vn;
	private String nn;
	private String pwd;
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	private UserAussehenModel aussehen;
	@OneToOne(cascade = CascadeType.ALL)
	private UserCharakterModel charakter;
	
	@ManyToOne (cascade = CascadeType.PERSIST)
	private BezirkeModel bezirk;
	private Boolean enabled;
	private Date gd;
	
    @OneToMany(mappedBy="user",fetch=FetchType.LAZY)
    private Set<ProfilFotoModel> fotos;
	
	private GeschlechtModel geschlecht;
	
	@ManyToOne (cascade = CascadeType.PERSIST)
    private UserRoleModel role;

}
