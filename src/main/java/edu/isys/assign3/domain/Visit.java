package edu.isys.assign3.domain;

import java.util.Date;

/**
 * This class represents a visit to one of the Mercy clinics. Regardless of how
 * the individual clinics store their information, we will use this class to 
 * provide visit data to the application and presentation layers of our pharmacy
 * system.
 */
public class Visit {

	private int id;
	private Date date;
	private String doctor;
	private String diagnosis;
	private String notes;
	public Visit(int id,Date date,String doctor,String diagnosis,String notes){
		setDate(date);
		setDiagnosis(diagnosis);
		setDoctor(doctor);
		setId(id);
		setNotes(diagnosis);
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id2) {
		this.id = id2;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getDoctor() {
		return doctor;
	}
	
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	
	public String getDiagnosis() {
		return diagnosis;
	}
	
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
