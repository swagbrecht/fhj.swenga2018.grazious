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
@Table(name = "augenfarbe")
public class AugenfarbeModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	
	@Id
	@Column(name = "augenfarbeId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer augenfarbeId;
	private String augenfarbeBezeichnung;
	@OneToMany(mappedBy="augenfarbe",fetch=FetchType.LAZY)
	private Set<UserAussehenModel> aussehen;
	public AugenfarbeModel() {
		super();
	}
	public AugenfarbeModel(String augenfarbeBezeichnung) {
		super();
		this.augenfarbeBezeichnung = augenfarbeBezeichnung;
	}
	public Integer getAugenfarbeId() {
		return augenfarbeId;
	}
	public void setAugenfarbeId(Integer augenfarbeId) {
		this.augenfarbeId = augenfarbeId;
	}
	public String getAugenfarbeBezeichnung() {
		return augenfarbeBezeichnung;
	}
	public void setAugenfarbeBezeichnung(String augenfarbeBezeichnung) {
		this.augenfarbeBezeichnung = augenfarbeBezeichnung;
	}
	public Set<UserAussehenModel> getAussehen() {
		return aussehen;
	}
	public void setAussehen(Set<UserAussehenModel> aussehen) {
		this.aussehen = aussehen;
	}

	
	
	
	}
	