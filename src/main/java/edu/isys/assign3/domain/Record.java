package edu.isys.assign3.domain;

import java.util.List;

/**
 * This class represents an electronic health record (EHR). Regardless of how
 * the individual clinics store their information, we will use this class to 
 * provide EHR data to the application and presentation layers of the pharmacy
 * system.
 */
public class Record {

	private String mercyId;
	private String name;
	private String gender;
	private String insurance;
	private String groupId;
	private String clinic;
	private List<Visit> visits;
	
	public Record(String mercyId,String name, String gender, String insurance,String groupId,String clinic, List<Visit> visits ){
		setClinic(clinic);
		setGender(gender);
		setGroupId(groupId);
		setInsurance(insurance);
		setMercyId(mercyId);
		setName(name);
		setVisits(visits);
	}
	
	public String getMercyId() {
		return mercyId;
	}
	
	public void setMercyId(String mercyId) {
		this.mercyId = mercyId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getInsurance() {
		return insurance;
	}
	
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	public String getGroupId() {
		return groupId;
	}
	
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	public String getClinic() {
		return clinic;
	}
	
	public void setClinic(String clinic) {
		this.clinic = clinic;
	}
	
	public List<Visit> getVisits() {
		return visits;
	}
	
	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}
	
}
