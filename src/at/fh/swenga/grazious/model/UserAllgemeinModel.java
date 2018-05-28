package at.fh.swenga.grazious.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="User_Allgemein")
public class UserAllgemeinModel {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "vn", nullable = false, length = 30)
	private String vn;

	@Column(name = "nn", nullable = true, length = 30)
	private String nn;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date gebdat;

	@Column(name = "email", nullable = false, length = 30)
	private String email;

	@Column(name = "groesse", nullable = true)
	private int groesse;

	@Column(name = "statur", nullable = true, length = 15)
	private String statur;

	@Column(name = "augenfarbe", nullable = true, length = 15)
	private String augenfarbe;

	@Column(name = "haarfarbe", nullable = true, length = 15)
	private String haarfarbe;

	@Column(name = "geschlecht", nullable = false, length = 9)
	private String geschlecht;

	@Column(name = "tattoos")
	private boolean tattoos;

	@Column(name = "piercings")
	private boolean piercings;

	@Version
	long version;
	
	public UserAllgemeinModel(String vn, String nn, Date gebdat, String email, int groesse, String statur,
			String augenfarbe, String haarfarbe, String geschlecht, boolean tattoos, boolean piercings) {
		super();
		this.vn = vn;
		this.nn = nn;
		this.gebdat = 	gebdat;
		this.email = email;
		this.groesse = groesse;
		this.statur = statur;
		this.augenfarbe = augenfarbe;
		this.haarfarbe = haarfarbe;
		this.geschlecht = geschlecht;
		this.tattoos = tattoos;
		this.piercings = piercings;
		}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the gebdat
	 */
	public Date getGebdat() {
		return gebdat;
	}

	/**
	 * @param gebdat the gebdat to set
	 */
	public void setGebdat(Date gebdat) {
		this.gebdat = gebdat;
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
	 * @return the groesse
	 */
	public int getGroesse() {
		return groesse;
	}

	/**
	 * @param groesse the groesse to set
	 */
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

	/**
	 * @return the statur
	 */
	public String getStatur() {
		return statur;
	}

	/**
	 * @param statur the statur to set
	 */
	public void setStatur(String statur) {
		this.statur = statur;
	}

	/**
	 * @return the augenfarbe
	 */
	public String getAugenfarbe() {
		return augenfarbe;
	}

	/**
	 * @param augenfarbe the augenfarbe to set
	 */
	public void setAugenfarbe(String augenfarbe) {
		this.augenfarbe = augenfarbe;
	}

	/**
	 * @return the haarfarbe
	 */
	public String getHaarfarbe() {
		return haarfarbe;
	}

	/**
	 * @param haarfarbe the haarfarbe to set
	 */
	public void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}

	/**
	 * @return the geschlecht
	 */
	public String getGeschlecht() {
		return geschlecht;
	}

	/**
	 * @param geschlecht the geschlecht to set
	 */
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	/**
	 * @return the tattoos
	 */
	public boolean isTattoos() {
		return tattoos;
	}

	/**
	 * @param tattoos the tattoos to set
	 */
	public void setTattoos(boolean tattoos) {
		this.tattoos = tattoos;
	}

	/**
	 * @return the piercings
	 */
	public boolean isPiercings() {
		return piercings;
	}

	/**
	 * @param piercings the piercings to set
	 */
	public void setPiercings(boolean piercings) {
		this.piercings = piercings;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAllgemeinModel other = (UserAllgemeinModel) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
