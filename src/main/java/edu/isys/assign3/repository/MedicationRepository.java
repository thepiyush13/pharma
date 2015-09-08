package edu.isys.assign3.repository;

import java.util.List;

import edu.isys.assign3.domain.Medication;

public interface MedicationRepository {

	Medication get(int id);
	List<Medication> getAll();
	
}
