package at.fh.swenga.grazious.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the un
	 */
	public String getUn() {
		return un;
	}

	/**
	 * @param un the un to set
	 */
	public void setUn(String un) {
		this.un = un;
	}

	/**
	 * @return the vn
	 */
	public String getVn() {
		return vn;
	}

	/**
	 * @param vn the vn to set
	 */
	public void setVn(String vn) {
		this.vn = vn;
	}

	/**
	 * @return the nn
	 */
	public String getNn() {
		return nn;
	}

	/**
	 * @param nn the nn to set
	 */
	public void setNn(String nn) {
		this.nn = nn;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the aussehen
	 */
	public UserAussehenModel getAussehen() {
		return aussehen;
	}

	/**
	 * @param aussehen the aussehen to set
	 */
	public void setAussehen(UserAussehenModel aussehen) {
		this.aussehen = aussehen;
	}

	/**
	 * @return the charakter
	 */
	public UserCharakterModel getCharakter() {
		return charakter;
	}

	/**
	 * @param charakter the charakter to set
	 */
	public void setCharakter(UserCharakterModel charakter) {
		this.charakter = charakter;
	}

	/**
	 * @return the bezirk
	 */
	public BezirkeModel getBezirk() {
		return bezirk;
	}

	/**
	 * @param bezirk the bezirk to set
	 */
	public void setBezirk(BezirkeModel bezirk) {
		this.bezirk = bezirk;
	}

	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the gd
	 */
	public Date getGd() {
		return gd;
	}

	/**
	 * @param gd the gd to set
	 */
	public void setGd(Date gd) {
		this.gd = gd;
	}

	/**
	 * @return the fotos
	 */
	public Set<ProfilFotoModel> getFotos() {
		return fotos;
	}

	/**
	 * @param fotos the fotos to set
	 */
	public void setFotos(Set<ProfilFotoModel> fotos) {
		this.fotos = fotos;
	}

	/**
	 * @return the geschlecht
	 */
	public GeschlechtModel getGeschlecht() {
		return geschlecht;
	}

	/**
	 * @param geschlecht the geschlecht to set
	 */
	public void setGeschlecht(GeschlechtModel geschlecht) {
		this.geschlecht = geschlecht;
	}

	/**
	 * @return the role
	 */
	public UserRoleModel getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(UserRoleModel role) {
		this.role = role;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(String un, String vn, String nn, String pwd, String email, UserAussehenModel aussehen,
			UserCharakterModel charakter, BezirkeModel bezirk, Boolean enabled, Date gd, Set<ProfilFotoModel> fotos,
			GeschlechtModel geschlecht, UserRoleModel role) {
		super();
		this.un = un;
		this.vn = vn;
		this.nn = nn;
		this.pwd = pwd;
		this.email = email;
		this.aussehen = aussehen;
		this.charakter = charakter;
		this.bezirk = bezirk;
		this.enabled = enabled;
		this.gd = gd;
		this.fotos = fotos;
		this.geschlecht = geschlecht;
		this.role = role;
	}

}
