package at.fh.swenga.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "gender")
public class GenderModel implements java.io.Serializable {
	
	private static final long serialVersionUID = 8098173157518993615L;
	
	@Id
	@Column(name = "genderId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer genderId;
	
	@Column(name = "genderCode", nullable = false, unique = true)
	private String genderCode;
	
	@Column(name = "name", nullable = false)
	private String name;

	public GenderModel() {
		super();
	}
	
	public GenderModel(String genderCode, String name) {
		super();
		this.genderCode = genderCode;
		this.name = name;
	}

	public Integer getGenderId() {
		return genderId;
	}

	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genderId == null) ? 0 : genderId.hashCode());
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
		GenderModel other = (GenderModel) obj;
		if (genderId == null) {
			if (other.genderId != null)
				return false;
		} else if (!genderId.equals(other.genderId))
			return false;
		return true;
	}
	
}