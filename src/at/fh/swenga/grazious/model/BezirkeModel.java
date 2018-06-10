package at.fh.swenga.grazious.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "bezirk")
public class BezirkeModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	
	@Id
	@Column(name = "bezirkId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bezirkId;
	private String name;
	private String plz;
	@OneToMany(mappedBy="bezirk",fetch=FetchType.LAZY)
	private Set<UserModel> user;
	
	public BezirkeModel() {
		super();
	}

	public BezirkeModel(String name, String plz, Set<UserModel> user) {
		super();
		this.name = name;
		this.plz = plz;
		this.user = user;
	}

	public Integer getBezirkId() {
		return bezirkId;
	}

	public void setBezirkId(Integer bezirkId) {
		this.bezirkId = bezirkId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public Set<UserModel> getUser() {
		return user;
	}

	public void setUser(Set<UserModel> user) {
		this.user = user;
	}
	
	

}