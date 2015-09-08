package edu.isys.assign3.domain;

import java.util.Date;

/**
 * This class represents a prescription that was processed by the pharmacy.
 */
public class Prescription extends Entity {

	private Doctor doctor;
	private Medication medication;
	private Patient patient;
	private Pharmacist pharmacist;
	private Status status;
	private double dose;
	private Date created;
	private Date modified;
	private String notes;
	
	public Prescription(int id,Doctor doctor,Medication medication, Patient patient,Pharmacist pharmacist, double dose, Date created, Date modified, String notes){
		setCreated(created);
		setDoctor(doctor);
		setDose(dose);
		setMedication(medication);
		setModified(modified);
		setNotes(notes); 
		setPatient(patient);
		setPharmacist(pharmacist);
		setStatus(status);
		//setId(id);
	}
	
	public Date getCreated() {
		return created;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	
	public double getDose() {
		return dose;
	}
	
	public Medication getMedication() {
		return medication;
	}
	
	public Date getModified() {
		return modified;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public Pharmacist getPharmacist() {
		return pharmacist;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setCreated(Date created) {
		this.created = created;
	}
	
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public void setDose(double dose) {
		this.dose = dose;
	}
	
	public void setMedication(Medication medication) {
		this.medication = medication;
	}
	
	public void setModified(Date modified) {
		this.modified = modified;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public void setPharmacist(Pharmacist pharmacist) {
		this.pharmacist = pharmacist;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
}
