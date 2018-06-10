package at.fh.swenga.jpa.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "foto")
public class ProfilFotoModel implements java.io.Serializable {
	private static final long serialVersionUID = 8098173157518993615L;
	
	@Id
	@Column(name = "fotoId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fotoId;
	private String fileName;
	@Lob	
	@Basic(fetch=FetchType.LAZY)
	private byte[] foto;
	private Date uploaded;
	@ManyToOne (cascade = CascadeType.PERSIST)
	private UserModel user;
	
	public ProfilFotoModel() {
		super();
	}

	public ProfilFotoModel(String fileName, byte[] foto, Date uploaded) {
		super();
		this.fileName = fileName;
		this.foto = foto;
		this.uploaded = uploaded;
	}

	public Integer getFotoId() {
		return fotoId;
	}

	public void setFotoId(Integer fotoId) {
		this.fotoId = fotoId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Date getUploaded() {
		return uploaded;
	}

	public void setUploaded(Date uploaded) {
		this.uploaded = uploaded;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}
	
	

}