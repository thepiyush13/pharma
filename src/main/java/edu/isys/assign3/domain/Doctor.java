package edu.isys.assign3.domain;

/**
 * This class represents a doctor in the pharmacy system.
 */
public class Doctor extends Entity {

	private String deaNumber;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String degree;
	
	public Doctor(int id,String deaNumber, String firstName,String lastName,String phoneNumber,String degree) {
		setDeaNumber(deaNumber);
		setDegree(degree);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setId(id);
	}
	
	public String getDeaNumber() {
		return deaNumber;
	}
	
	public String getDegree() {
		return degree;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setDeaNumber(String deaNumber) {
		this.deaNumber = deaNumber;
	}
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
		
}
