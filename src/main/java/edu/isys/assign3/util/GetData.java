package edu.isys.assign3.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.isys.assign3.domain.Doctor;
import edu.isys.assign3.domain.Medication;
import edu.isys.assign3.domain.Patient;
import edu.isys.assign3.domain.Pharmacist;
import edu.isys.assign3.domain.Prescription;

public class GetData extends DBHelper {
	
	public ResultSet getResultFromWestMercyEHR(String MercyId){
		ResultSet rs=null;
		String sql="Call sp_GetRecords(?)";
		Connection con=CreateConnection();
		CallableStatement cstmt=null;
		try {
			cstmt=con.prepareCall(sql);
			cstmt.setString("MercyId",MercyId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Getting the resultset from MercyWest Database
		rs=getResultSet(cstmt);
		return rs;
	}
	
	public ResultSet getPrescription(int patientId){
		ResultSet rs=null;
		String sql="Call sp_GetPrescription(?)";
		Connection con=getConnectionToPharmacy();
		CallableStatement cstmt=null;
		try {
			cstmt=con.prepareCall(sql);
			cstmt.setInt("PatientId",patientId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs=getResultSet(cstmt);
		return rs;
	}
	public ResultSet getPrescription(Prescription prescription){
		ResultSet rs=null;
		String sql="Call sp_GetPrescriptionBasedOnId(?)";
		Connection con=getConnectionToPharmacy();
		CallableStatement cstmt=null;
		try {
			cstmt=con.prepareCall(sql);
			cstmt.setInt("PrescriptionId",prescription.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs=getResultSet(cstmt);
		return rs;
	}
	
	public ResultSet getPrescriptionById(int prescriptionId){
		ResultSet rs=null;
		String sql="Call sp_GetPrescriptionBasedOnId(?)";
		Connection con=getConnectionToPharmacy();
		CallableStatement cstmt=null;
		try {
			cstmt=con.prepareCall(sql);
			cstmt.setInt("PrescriptionId",prescriptionId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs=getResultSet(cstmt);
		return rs;
	}
	
	public int ModifyPrescription(Prescription prescription){
		ResultSet rs=null;
		int iPresc=0;
		Doctor objDoc=prescription.getDoctor();
		Medication objMed=prescription.getMedication();
		Patient objPat=prescription.getPatient();
		Pharmacist objPharm=prescription.getPharmacist();
		int Status=prescription.getStatus().getId();
		double dose=prescription.getDose();
		java.sql.Date createDate=new Date(prescription.getCreated().getTime());
		java.sql.Date modDate=new Date(prescription.getModified().getTime());
		String notes=prescription.getNotes();
		String sql="Call sp_ModifyPrescription(?,?,?,?,?,?,?,?,?,?)";
		Connection con=getConnectionToPharmacy();
		CallableStatement cstmt=null;
		try {
			cstmt=con.prepareCall(sql);
			cstmt.setInt("PrescriptionId",objPat.getId());
			cstmt.setInt("patient_id",objPat.getId());
			cstmt.setInt("doctor_id", objDoc.getId());
			cstmt.setInt("pharmacist_id", objPharm.getId());
			cstmt.setInt("medication_id",objMed.getId());
			cstmt.setInt("status_id",Status);
			cstmt.setDouble("dose_mg", dose);
			cstmt.setDate("created_date",createDate);
			cstmt.setDate("modified_date", modDate);
			cstmt.setString("notes",notes );
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs=getResultSet(cstmt);
		try {
			iPresc= rs.getInt("PrescriptionId");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return iPresc;
	}
	public ResultSet putPrescription(Prescription prescription){
		ResultSet rs=null;
		Doctor objDoc=prescription.getDoctor();
		Medication objMed=prescription.getMedication();
		Patient objPat=prescription.getPatient();
		Pharmacist objPharm=prescription.getPharmacist();
		int Status=prescription.getStatus().getId();
		double dose=prescription.getDose();
		java.sql.Date createDate=new Date(prescription.getCreated().getTime());
		java.sql.Date modDate=new Date(prescription.getModified().getTime());
		String notes=prescription.getNotes();
		String sql="Call sp_putPrescription(?,?,?,?,?,?,?,?,?)";
		Connection con=getConnectionToPharmacy();
		CallableStatement cstmt=null;
		try {
			cstmt=con.prepareCall(sql);
			cstmt.setInt("patient_id",objPat.getId());
			cstmt.setInt("doctor_id", objDoc.getId());
			cstmt.setInt("pharmacist_id", objPharm.getId());
			cstmt.setInt("medication_id",objMed.getId());
			cstmt.setInt("status_id",Status);
			cstmt.setDouble("dose_mg", dose);
			cstmt.setDate("created_date",createDate);
			cstmt.setDate("modified_date", modDate);
			cstmt.setString("notes",notes );
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs=getResultSet(cstmt);
		return rs;
	}
	
	private ResultSet getResultSet(CallableStatement cstmt){
		ResultSet rs=null;
		try {
			rs = cstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
