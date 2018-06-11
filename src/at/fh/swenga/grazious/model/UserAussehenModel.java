package at.fh.swenga.grazious.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "aussehen")
public class UserAussehenModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	
	@Id
	@Column(name = "aussehenId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aussehenId;
	
	@ManyToOne (cascade = CascadeType.PERSIST)
	private HaarfarbeModel haarfarbe;
	@ManyToOne (cascade = CascadeType.PERSIST)
	private HaarlaengeModel haarlaenge;
	@ManyToOne (cascade = CascadeType.PERSIST)
	private AugenfarbeModel augenfarbe;
	@ManyToOne (cascade = CascadeType.PERSIST)
	private HautfarbeModel hautfarbe;
	@ManyToOne (cascade = CascadeType.PERSIST)
	private StaturModel statur;
	private Integer groesse;
	private Boolean tattoos;
	private Boolean piercings;
	private Boolean brille;
	private UserModel user;
	
	public UserAussehenModel() {
		super();
	}
	public UserAussehenModel(Integer aussehenId, HaarfarbeModel haarfarbe, AugenfarbeModel augenfarbe,
			HautfarbeModel hautfarbe, StaturModel statur, Integer groesse, Boolean tattoos, Boolean piercings, Boolean brille,
			UserModel user) {
		super();
		this.aussehenId = aussehenId;
		this.haarfarbe = haarfarbe;
		this.augenfarbe = augenfarbe;
		this.hautfarbe = hautfarbe;
		this.statur = statur;
		this.groesse = groesse;
		this.tattoos = tattoos;
		this.piercings = piercings;
		this.brille = brille;
		this.user = user;
	}
	public Integer getAussehenId() {
		return aussehenId;
	}
	public void setAussehenId(Integer aussehenId) {
		this.aussehenId = aussehenId;
	}
	public HaarfarbeModel getHaarfarbe() {
		return haarfarbe;
	}
	public void setHaarfarbe(HaarfarbeModel haarfarbe) {
		this.haarfarbe = haarfarbe;
	}
	public AugenfarbeModel getAugenfarbe() {
		return augenfarbe;
	}
	public void setAugenfarbe(AugenfarbeModel augenfarbe) {
		this.augenfarbe = augenfarbe;
	}
	public HautfarbeModel getHautfarbe() {
		return hautfarbe;
	}
	public void setHautfarbe(HautfarbeModel hautfarbe) {
		this.hautfarbe = hautfarbe;
	}
	public StaturModel getStatur() {
		return statur;
	}
	public void setStatur(StaturModel statur) {
		this.statur = statur;
	}
	public Integer getGroesse() {
		return groesse;
	}
	public void setGroesse(Integer groesse) {
		this.groesse = groesse;
	}
	public Boolean getTattoos() {
		return tattoos;
	}
	public void setTattoos(Boolean tattoos) {
		this.tattoos = tattoos;
	}
	public Boolean getPiercings() {
		return piercings;
	}
	public void setPiercings(Boolean piercings) {
		this.piercings = piercings;
	}
	
	public HaarlaengeModel getHaarlaenge() {
		return haarlaenge;
	}
	public void setHaarlaenge(HaarlaengeModel haarlaenge) {
		this.haarlaenge = haarlaenge;
	}
	public Boolean getBrille() {
		return brille;
	}
	public void setBrille(Boolean brille) {
		this.brille = brille;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	
	

	}
	