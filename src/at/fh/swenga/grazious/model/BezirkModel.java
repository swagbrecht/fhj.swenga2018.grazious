package at.fh.swenga.grazious.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class BezirkModel {
	@Id
	private int id;

	@Column(name = "name", nullable = false, length = 30)
	private String name;

	@Column(name = "plz", nullable = false, length = 4)
	private String plz;
}
