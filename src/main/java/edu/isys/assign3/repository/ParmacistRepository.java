package edu.isys.assign3.repository;

import java.util.List;

import edu.isys.assign3.domain.Pharmacist;

public interface ParmacistRepository {

	Pharmacist get(int id);
	List<Pharmacist> getAll();
	
}
