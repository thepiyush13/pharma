package edu.isys.assign3.repository;

import edu.isys.assign3.domain.Record;

/**
 * This interface represents a contract for application layer code that needs to
 * access EHR data. Concrete implementations of this interface will retrieve EHR
 * data from Mercy West, Mercy East, Mercy South or Mercy North clinic systems.
 */
public interface RecordRepository {

	/**
	 * Retrieves an electronic health record or Record objects using the given
	 * Mercy clinic identifier.
	 * @param mercyId the given Mercy clinic identifier.
	 * @return and instance of Record
	 */
	Record get(String mercyId);
	
}
