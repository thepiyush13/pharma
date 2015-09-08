package edu.isys.assign3.repository.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.isys.assign3.util.*;
import edu.isys.assign3.domain.*;
import edu.isys.assign3.repository.PrescriptionRepository;
import edu.isys.assign3.util.GetData;

public class PrescriptionRepoImpl implements PrescriptionRepository {

	private List<Prescription> pl;

	public List<Prescription> getForPatient(int patientId) {
		// TODO Auto-generated method stub
		GetData gd=new GetData();
		pl = new ArrayList<Prescription>();
		ResultSet rs=null;
		rs=gd.getPrescription(patientId);
		pl=getPrescriptionObject(rs);
		return pl;
	}

	public void put(Prescription prescription) {
		// TODO Auto-generated method stub
		GetData gd=new GetData();
		ResultSet rs= gd.putPrescription(prescription);
		try {
			while(rs.next()){
				System.out.println("New Prescription Id added:" + rs.getInt("InsertedId"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void modifyPrescription(int prescriptionId,Prescription modPresc){
		GetData gd=new GetData();
		//Getting PrescriptonDetails Resultset based on PrescriptionId
		ResultSet rs=gd.getPrescription(prescriptionId);
		//Constructing Prescription object with the above details
		List<Prescription> pl=new ArrayList<Prescription>();
		pl=getPrescriptionObject(rs);
		for(Prescription p:pl){
			if(p.getId()==modPresc.getId()){
				p.setCreated(modPresc.getCreated());
				p.setDoctor(modPresc.getDoctor());
				p.setDose(modPresc.getDose());
				p.setMedication(modPresc.getMedication());
				p.setModified(modPresc.getModified());
				p.setNotes(modPresc.getNotes());
				p.setPatient(modPresc.getPatient());
				p.setPharmacist(modPresc.getPharmacist());
				p.setStatus(modPresc.getStatus());
			}
			System.out.println("The Prescription no: "+gd.ModifyPrescription(p)+" has been modifed");
		}
						
	}
	
	public List<Prescription> getPrescriptionObject(ResultSet rs){
		List<Prescription> pl=new ArrayList<Prescription>();
		try {
				while(rs.next()){
				Doctor objDoc=new Doctor(rs.getInt("doctorid"),rs.getString("dea_number"),rs.getString("degree"),rs.getString("DocFirstName"),rs.getString("DocLastName"),rs.getString("phone_number"));;
				Medication objMed=new Medication(rs.getInt("medicationid"),rs.getString("medname"), rs.getString("medcomname"), rs.getString("med_desc"));
				Patient objPat=new Patient(rs.getInt("patientid"),rs.getString("mercyid"), rs.getString("mercy_clinic"), rs.getString("PatFirstName"), rs.getString("PatLastName"), rs.getString("PatPhone"));
				Pharmacist objPharm=new Pharmacist(rs.getInt("pharmacistid"),rs.getString("pharmDea"), rs.getString("pharmFirst"), rs.getString("pharmLast"), rs.getString("pharmPhone"));
				Prescription objPres=new Prescription(rs.getInt("prescriptionid"),objDoc, objMed, objPat, objPharm, rs.getDouble("dose"),rs.getDate("created_date"),rs.getDate("modified_date") ,rs.getString("notes"));
				if(rs.getString("prescStatus")=="filled"){
					objPres.setStatus(Status.FILLED);
				}
				else if (rs.getString("prescStatus")=="denied"){
					objPres.setStatus(Status.DENIED);
				}
				else{
					objPres.setStatus(Status.OVERRULED);
				}
				pl.add(objPres);
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pl;
	}

}
