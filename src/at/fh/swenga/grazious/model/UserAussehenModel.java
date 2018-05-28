package at.fh.swenga.grazious.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserAussehen")
public class UserAussehenModel {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="haarFarbe")
	private String haarFarbe;
	
	@Column(name="augenFarbe")
	private String augenFarbe;
	
	@Column(name="hautFarbe")
	private String hautFarbe;
	
	@Column(name="statur")
	private String statur;
	
	@Column(name="groesse")
	private int groesse;
	
	@Column(name="tattoos")
	private boolean tattoos;
	
	@Column(name="piercings")
	private boolean piercings;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHaarFarbe() {
		return haarFarbe;
	}

	public void setHaarFarbe(String haarFarbe) {
		this.haarFarbe = haarFarbe;
	}

	public String getAugenFarbe() {
		return augenFarbe;
	}

	public void setAugenFarbe(String augenFarbe) {
		this.augenFarbe = augenFarbe;
	}

	public String getHautFarbe() {
		return hautFarbe;
	}

	public void setHautFarbe(String hautFarbe) {
		this.hautFarbe = hautFarbe;
	}

	public String getStatur() {
		return statur;
	}

	public void setStatur(String statur) {
		this.statur = statur;
	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

	public boolean isTattoos() {
		return tattoos;
	}

	public void setTattoos(boolean tattoos) {
		this.tattoos = tattoos;
	}

	public boolean isPiercings() {
		return piercings;
	}

	public void setPiercings(boolean piercings) {
		this.piercings = piercings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((augenFarbe == null) ? 0 : augenFarbe.hashCode());
		result = prime * result + groesse;
		result = prime * result + ((haarFarbe == null) ? 0 : haarFarbe.hashCode());
		result = prime * result + ((hautFarbe == null) ? 0 : hautFarbe.hashCode());
		result = prime * result + id;
		result = prime * result + (piercings ? 1231 : 1237);
		result = prime * result + ((statur == null) ? 0 : statur.hashCode());
		result = prime * result + (tattoos ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAussehenModel other = (UserAussehenModel) obj;
		if (augenFarbe == null) {
			if (other.augenFarbe != null)
				return false;
		} else if (!augenFarbe.equals(other.augenFarbe))
			return false;
		if (groesse != other.groesse)
			return false;
		if (haarFarbe == null) {
			if (other.haarFarbe != null)
				return false;
		} else if (!haarFarbe.equals(other.haarFarbe))
			return false;
		if (hautFarbe == null) {
			if (other.hautFarbe != null)
				return false;
		} else if (!hautFarbe.equals(other.hautFarbe))
			return false;
		if (id != other.id)
			return false;
		if (piercings != other.piercings)
			return false;
		if (statur == null) {
			if (other.statur != null)
				return false;
		} else if (!statur.equals(other.statur))
			return false;
		if (tattoos != other.tattoos)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserAussehenModel [id=" + id + ", haarFarbe=" + haarFarbe + ", augenFarbe=" + augenFarbe
				+ ", hautFarbe=" + hautFarbe + ", statur=" + statur + ", groesse=" + groesse + ", tattoos=" + tattoos
				+ ", piercings=" + piercings + "]";
	}

	public UserAussehenModel() {
		super();
	}

	public UserAussehenModel(String haarFarbe, String augenFarbe, String hautFarbe, String statur, int groesse,
			boolean tattoos, boolean piercings) {
		super();
		this.haarFarbe = haarFarbe;
		this.augenFarbe = augenFarbe;
		this.hautFarbe = hautFarbe;
		this.statur = statur;
		this.groesse = groesse;
		this.tattoos = tattoos;
		this.piercings = piercings;
	}
	
	

}
