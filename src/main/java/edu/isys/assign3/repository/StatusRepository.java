package edu.isys.assign3.repository;

import java.util.List;

import edu.isys.assign3.domain.Status;

public interface StatusRepository {

	Status get(int id);
	List<Status> getAll();
	
}
