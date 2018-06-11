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
@Table(name = "haarfarbe")
public class HaarfarbeModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	@Id
	@Column(name = "haarfarbeId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer haarfarbeId;
	private String haarfarbeBezeichnung;
	@OneToMany(mappedBy="haarfarbe",fetch=FetchType.LAZY)
	private Set<UserAussehenModel> aussehen;
	public HaarfarbeModel() {
		super();
	}
	public HaarfarbeModel(String haarfarbeBezeichnung) {
		super();
		this.haarfarbeBezeichnung = haarfarbeBezeichnung;
	}
	public Integer getHaarfarbeId() {
		return haarfarbeId;
	}
	public void setHaarfarbeId(Integer haarfarbeId) {
		this.haarfarbeId = haarfarbeId;
	}
	public String getHaarfarbeBezeichnung() {
		return haarfarbeBezeichnung;
	}
	public void setHaarfarbeBezeichnung(String haarfarbeBezeichnung) {
		this.haarfarbeBezeichnung = haarfarbeBezeichnung;
	}
	public Set<UserAussehenModel> getAussehen() {
		return aussehen;
	}
	public void setAussehen(Set<UserAussehenModel> aussehen) {
		this.aussehen = aussehen;
	}

	
	
	}
	