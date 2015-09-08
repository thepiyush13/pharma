package edu.isys.assign3.repository;

import java.util.List;

import edu.isys.assign3.domain.Patient;

/**
 * This interface represents a contract for application layer code that needs to
 * access patient data.
 */
public interface PatientRepository {

	/**
	 * Gets a list of Patients using the given first and last names.
	 * @param firstName the given first name.
	 * @param lastName the given last name.
	 * @return a list of Patient objects.
	 */
	List<Patient> get(String firstName, String lastName);
	
}
