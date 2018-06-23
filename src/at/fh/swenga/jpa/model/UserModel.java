package at.fh.swenga.jpa.model;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name = "user")
public class UserModel implements java.io.Serializable {
	
	private static final long serialVersionUID = 8098173157518993615L;
	
	@ManyToOne
	private GenderModel gender;
	
	@ManyToOne
	private RegionModel region;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<PersonalCharacterModel> personalCharacters;
	
	@ManyToMany
	private Set<UserRoleModel> userRoles;
	
	@Id
	@Column(name = "userId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	@NotEmpty
	@Column(name = "username", nullable = false, unique = true)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@NotEmpty
	@Column(name = "firstName", nullable = false)
	private String firstName;
	
	@NotEmpty
	@Column(name = "lastName", nullable = false)
	private String lastName;
	
	@Email
	@NotEmpty
	@Column(name = "email", nullable = false)
	private String email;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birthday", nullable = false)
	private Calendar birthday;
	
	@Lob
	@Column(name = "about", nullable = false)
	private String about;
	
	@Column(name = "hairColor")
	private String hairColor;

	@Column(name = "hairLength")
	private String hairLength;
	
	@Column(name = "eyeColor")
	private String eyeColor;
	
	@Column(name = "bodyType")
	private String bodyType;
	
	@Column(name = "height")
	private Integer height;
	
	@Column(name = "hasPiercing")
	private Boolean hasPiercing;

	@Column(name = "hasTattoos")
	private Boolean hasTattoos;
	
	@Column(name = "isEnabled", nullable = false)
	private Boolean isEnabled;
	
	@Column(name = "isPremium", nullable = false)
	private Boolean isPremium;
	
	@Column(name = "filename")
	private String filename;

	public UserModel() {
		super();
	}

	public UserModel(GenderModel gender, RegionModel region, String username,
			String password, String firstName, String lastName, String email, Calendar birthday, String about,
			String hairColor, String hairLength, String eyeColor, String bodyType, Integer height, Boolean hasPiercing,
			Boolean hasTattoos, Boolean isEnabled, Boolean isPremium, String filename) {
		super();
		this.gender = gender;
		this.region = region;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthday = birthday;
		this.about = about;
		this.hairColor = hairColor;
		this.hairLength = hairLength;
		this.eyeColor = eyeColor;
		this.bodyType = bodyType;
		this.height = height;
		this.hasPiercing = hasPiercing;
		this.hasTattoos = hasTattoos;
		this.isEnabled = isEnabled;
		this.isPremium = isPremium;
		this.filename = filename;
	}

	public GenderModel getGender() {
		return gender;
	}

	public void setGender(GenderModel gender) {
		this.gender = gender;
	}

	public RegionModel getRegion() {
		return region;
	}

	public void setRegion(RegionModel region) {
		this.region = region;
	}

	public Set<PersonalCharacterModel> getPersonalCharacters() {
		return personalCharacters;
	}

	public void setPersonalCharacters(Set<PersonalCharacterModel> personalCharacters) {
		this.personalCharacters = personalCharacters;
	}

	public Set<UserRoleModel> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRoleModel> userRoles) {
		this.userRoles = userRoles;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getBirthday() {
		return birthday;
	}

	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getHairLength() {
		return hairLength;
	}

	public void setHairLength(String hairLength) {
		this.hairLength = hairLength;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Boolean getHasPiercing() {
		return hasPiercing;
	}

	public void setHasPiercing(Boolean hasPiercing) {
		this.hasPiercing = hasPiercing;
	}

	public Boolean getHasTattoos() {
		return hasTattoos;
	}

	public void setHasTattoos(Boolean hasTattoos) {
		this.hasTattoos = hasTattoos;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Boolean getIsPremium() {
		return isPremium;
	}

	public void setIsPremium(Boolean isPremium) {
		this.isPremium = isPremium;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public String getProfilePhotoPath() {
		return "/resources/img/" + (filename == null ? "no-userpic.jpg" : "profile/" + filename);
	}
	
	public Boolean hasPersonalCharacter(PersonalCharacterModel character) {
		for (PersonalCharacterModel userCharacter : personalCharacters)
			if (userCharacter.getName().equals(character.getName()))
				return true;
		
		return false;
	}
	
	public void addUserRole(UserRoleModel userRole) {
		if (userRoles == null) 
			userRoles = new HashSet<UserRoleModel>();
		userRoles.add(userRole);
	}

	public void encryptPassword() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		password = passwordEncoder.encode(password);		
	}

	@Override
	public String toString() {
		return "UserModel [username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		UserModel other = (UserModel) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

}
