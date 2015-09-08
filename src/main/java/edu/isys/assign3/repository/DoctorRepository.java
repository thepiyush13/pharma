package edu.isys.assign3.repository;

import java.util.List;

import edu.isys.assign3.domain.Doctor;

public interface DoctorRepository {

	Doctor get(int id);
	List<Doctor> getAll();
	
}
