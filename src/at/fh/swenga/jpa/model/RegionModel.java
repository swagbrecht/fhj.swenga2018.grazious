package at.fh.swenga.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "region")
public class RegionModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	@Id
	@Column(name = "regionId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer regionId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	public RegionModel() {
		super();
	}
	
	public RegionModel(String name) {
		super();
		this.name = name;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}