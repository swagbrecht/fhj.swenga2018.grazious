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
@Table(name = "haarlänge")
public class HaarlaengeModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	@Id
	@Column(name = "haarlaengeId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer haarlaengeId;
	private String haarlaenge;
	@OneToMany(mappedBy="haarlaenge",fetch=FetchType.LAZY)
	private Set<UserAussehenModel> aussehen;
	public HaarlaengeModel() {
		super();
	}
	public HaarlaengeModel(String haarlaenge) {
		super();
		this.haarlaenge = haarlaenge;
	}

	public Integer getHaarlaengeId() {
		return haarlaengeId;
	}
	public void setHaarlaengeId(Integer haarlaengeId) {
		this.haarlaengeId = haarlaengeId;
	}
	public String getHaarlaenge() {
		return haarlaenge;
	}
	public void setHaarlaenge(String haarlaenge) {
		this.haarlaenge = haarlaenge;
	}

	
	public Set<UserAussehenModel> getAussehen() {
		return aussehen;
	}
	public void setAussehen(Set<UserAussehenModel> aussehen) {
		this.aussehen = aussehen;
	}

	
	
	}
	