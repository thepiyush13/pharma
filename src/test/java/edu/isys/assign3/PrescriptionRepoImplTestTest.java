package edu.isys.assign3;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.Test;

import edu.isys.assign3.domain.Doctor;
import edu.isys.assign3.domain.Medication;
import edu.isys.assign3.domain.Patient;
import edu.isys.assign3.domain.Pharmacist;
import edu.isys.assign3.domain.Prescription;
import edu.isys.assign3.domain.Status;
import edu.isys.assign3.repository.impl.PrescriptionRepoImpl;

public class PrescriptionRepoImplTestTest {

	@Test
	public final void testTestGetForPatient() {
		PrescriptionRepoImpl presImpl=new PrescriptionRepoImpl();
		//Getting Patient Records for PatientId 1
		List<Prescription> presList= presImpl.getForPatient(2);
		System.out.println(presList.size());
		assertEquals(1,presList.size());
	}

	@Test
	public final void testTestPut() {
		PrescriptionRepoImpl presImpl=new PrescriptionRepoImpl();
		Doctor doctor=new Doctor(1,"12904587J2", "Mark","Jones","8015551231","MD");
		Medication medication=new Medication(1,"abacavir sulfate", "Ziagen", "a synthetic carbocyclic nucleoside analogue with inhibitory activity against HIV-1");
		Patient patient=new Patient(1,"W000000001", "West", "Matt", "Manley", "8018881212");
		Pharmacist pharmacist=new Pharmacist(1,"098098B321", "Robert", "Frank", "4350988900");
		java.sql.Date created=new Date(new java.util.Date().getTime());
		java.sql.Date modified=new Date(new java.util.Date().getTime());
		String notes="Testing123";
		Prescription prescription=new Prescription(0,doctor, medication, patient, pharmacist, 115, created, modified, notes);
		prescription.setStatus(Status.FILLED);
		presImpl.put(prescription);
		System.out.println(prescription.getId());
		assertEquals(notes, prescription.getNotes());
		}

	@Test
	public final void testTestModifyPrescription() {
		PrescriptionRepoImpl presImpl=new PrescriptionRepoImpl();
		Doctor doctor=new Doctor(2, "98H23T4591", "Susan", "Smith","4357996555","MD.PhD");
		Medication medication=new Medication(1,"abacavir sulfate", "Ziagen", "a synthetic carbocyclic nucleoside analogue with inhibitory activity against HIV-1");
		Patient patient=new Patient(1,"W000000001", "West", "Matt", "Manley", "8018881212");
		Pharmacist pharmacist=new Pharmacist(1,"098098B321", "Robert", "Frank", "4350988900");
		java.sql.Date created=new Date(new java.util.Date().getTime());
		java.sql.Date modified=new Date(new java.util.Date().getTime());
		String notes="Testing1234567";
		Prescription prescription=new Prescription(1,doctor, medication, patient, pharmacist, 115, created, modified, notes);
		prescription.setStatus(Status.FILLED);
		presImpl.modifyPrescription(1,prescription);
		assertEquals(notes, prescription.getNotes());
	}

}
