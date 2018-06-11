package at.fh.swenga.grazious.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "charakter")
public class UserCharakterModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	@Id
	@Column(name = "charakterId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer charakterId;
	private String charakterBezeichnung;
	private Boolean trifftZu;
	private UserModel user;
	public UserCharakterModel() {
		super();
	}
	public UserCharakterModel(String charakterBezeichnung, Boolean trifftZu, UserModel user) {
		super();
		this.charakterBezeichnung = charakterBezeichnung;
		this.trifftZu = trifftZu;
		this.user = user;
	}
	public Integer getCharakterId() {
		return charakterId;
	}
	public void setCharakterId(Integer charakterId) {
		this.charakterId = charakterId;
	}
	public String getCharakterBezeichnung() {
		return charakterBezeichnung;
	}
	public void setCharakterBezeichnung(String charakterBezeichnung) {
		this.charakterBezeichnung = charakterBezeichnung;
	}
	public Boolean getTrifftZu() {
		return trifftZu;
	}
	public void setTrifftZu(Boolean trifftZu) {
		this.trifftZu = trifftZu;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}

	

	}
	