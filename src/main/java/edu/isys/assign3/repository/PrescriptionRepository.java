package edu.isys.assign3.repository;

import java.util.List;

import edu.isys.assign3.domain.Prescription;

/**
 * This interface represents a contract for application layer code that needs to
 * access prescription data.
 */
public interface PrescriptionRepository {

	/**
	 * Gets a list of Prescriptions for a patient from the underlying data 
	 * store, whatever it is, using the given patient id.
	 * @param id the given patient id.
	 * @return an list of Prescription objects
	 */
	List<Prescription> getForPatient(int patientId);
	
	/**
	 * Persists the given Prescription to the underlying data store, whatever it 
	 * may be. 
	 * @param prescription the given Prescription.
	 */
	void put(Prescription prescription);
	
}
