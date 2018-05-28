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


	@Version
	long version;
	
	public UserAllgemeinModel(String vn, String nn, Date gebdat, String email) {
		super();
		this.vn = vn;
		this.nn = nn;
		this.gebdat = 	gebdat;
		this.email = email;
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
