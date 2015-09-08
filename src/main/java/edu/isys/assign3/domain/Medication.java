package edu.isys.assign3.domain;

/**
 * This class represents a medication in the pharmacy system.
 */
public class Medication extends Entity {

	private String name;
	private String commonName;
	private String description;
	
	public Medication(int id,String name,String commonName, String description) {
		setCommonName(commonName);
		setName(commonName);
		setDescription(description);
		setId(id);
	}

	public String getCommonName() {
		return commonName;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

}
