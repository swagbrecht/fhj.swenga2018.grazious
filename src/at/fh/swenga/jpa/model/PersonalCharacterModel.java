package at.fh.swenga.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "personalCharacter")
public class PersonalCharacterModel implements java.io.Serializable {
	
	private static final long serialVersionUID = 8098173157518993615L;
	
	@Id
	@Column(name = "personalCharacterId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personalCharacterId;
	
	@Column(name = "name", nullable = false, unique = true)
	private String name;
	
	public PersonalCharacterModel() {
		super();
	}

	public PersonalCharacterModel(String name) {
		super();
		this.name = name;
	}

	public Integer getPersonalCharacterId() {
		return personalCharacterId;
	}

	public void setPersonalCharacterId(Integer personalCharacterId) {
		this.personalCharacterId = personalCharacterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}