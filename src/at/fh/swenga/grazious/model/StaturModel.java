package at.fh.swenga.jpa.model;

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
@Table(name = "statur")
public class StaturModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	
	@Id
	@Column(name = "staturId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer staturId;
	private String staturBezeichnung;
	@OneToMany(mappedBy="statur",fetch=FetchType.LAZY)
	private Set<UserAussehenModel> aussehen;
	public StaturModel() {
		super();
	}
	public StaturModel(String staturBezeichnung, Set<UserAussehenModel> aussehen) {
		super();
		this.staturBezeichnung = staturBezeichnung;
		this.aussehen = aussehen;
	}
	public Integer getStaturId() {
		return staturId;
	}
	public void setStaturId(Integer staturId) {
		this.staturId = staturId;
	}
	public String getStaturBezeichnung() {
		return staturBezeichnung;
	}
	public void setStaturBezeichnung(String staturBezeichnung) {
		this.staturBezeichnung = staturBezeichnung;
	}
	public Set<UserAussehenModel> getAussehen() {
		return aussehen;
	}
	public void setAussehen(Set<UserAussehenModel> aussehen) {
		this.aussehen = aussehen;
	}
	


	}
	