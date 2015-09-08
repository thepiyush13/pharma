package edu.isys.assign3.domain;

/**
 * This class represents the status of a prescription. Client code should not
 * attempt to instantiate new instances of this class. Instead, such code 
 * should simply reference one of the static members as required. For example,
 * <p>
 * <code>
 * Status filled = Status.FILLED;<br/>
 * prescription.setStatus(filled);
 * </code>
 *</p>
 */
public class Status {

	public static Status FILLED = new Status(1, "filled");
	public static Status DENIED = new Status(1, "denied");
	public static Status OVERRULED = new Status(1, "overruled");
	
	private int id;
	private String description;
	
	private Status(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
}
