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
@Table(name = "hautfarbe")
public class HautfarbeModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	
	@Id
	@Column(name = "hautfarbeId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hautfarbeId;
	private String hautfarbeBezeichnung;
	@OneToMany(mappedBy="hautfarbe",fetch=FetchType.LAZY)
	private Set<UserAussehenModel> aussehen;
	public HautfarbeModel() {
		super();
	}
	public HautfarbeModel(String hautfarbeBezeichnung, Set<UserAussehenModel> aussehen) {
		super();
		this.hautfarbeBezeichnung = hautfarbeBezeichnung;
		this.aussehen = aussehen;
	}
	public Integer getHautfarbeId() {
		return hautfarbeId;
	}
	public void setHautfarbeId(Integer hautfarbeId) {
		this.hautfarbeId = hautfarbeId;
	}
	public String getHautfarbeBezeichnung() {
		return hautfarbeBezeichnung;
	}
	public void setHautfarbeBezeichnung(String hautfarbeBezeichnung) {
		this.hautfarbeBezeichnung = hautfarbeBezeichnung;
	}
	public Set<UserAussehenModel> getAussehen() {
		return aussehen;
	}
	public void setAussehen(Set<UserAussehenModel> aussehen) {
		this.aussehen = aussehen;
	}
	
	

	}
	