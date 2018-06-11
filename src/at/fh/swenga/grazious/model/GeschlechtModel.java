package at.fh.swenga.grazious.model;

import java.util.Set;

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
@Table(name = "geschlecht")
public class GeschlechtModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	
	@Id
	@Column(name = "geschlechtId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer geschlechtId;
	private String geschlechtBezeichnung;
	
	@OneToMany(mappedBy="geschlecht",fetch=FetchType.LAZY)
	private Set<UserModel> user;

	
	
	public GeschlechtModel() {
		super();
	}

	public GeschlechtModel(String geschlechtBezeichnung) {
		super();
		this.geschlechtBezeichnung = geschlechtBezeichnung;
	}

	public Integer getGeschlechtId() {
		return geschlechtId;
	}

	public void setGeschlechtId(Integer geschlechtId) {
		this.geschlechtId = geschlechtId;
	}

	public String getGeschlechtBezeichnung() {
		return geschlechtBezeichnung;
	}

	public void setGeschlechtBezeichnung(String geschlechtBezeichnung) {
		this.geschlechtBezeichnung = geschlechtBezeichnung;
	}

	public Set<UserModel> getUser() {
		return user;
	}

	public void setUser(Set<UserModel> user) {
		this.user = user;
	}

	
	
	}
	