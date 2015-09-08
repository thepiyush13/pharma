USE `mercy_west_ehr`$

CREATE PROCEDURE sp_GetRecords(in MercyId varchar(15))
BEGIN
SELECT p.ehr_number,p.firstname,p.lastname,p.insurance_carrier as insurance,p.insurance_group as groupId,p.gender,
v.id,v.visit_date,v.doctor,v.diagnosis,v.notes,'West' as Clinic
FROM person p inner join Visit v on p.id=v.Person_Id
where p.ehr_number=MercyId;
	
END$

USE `mercy_pharm`$

Create Procedure sp_putPrescription(in patient_id int,in doctor_id int,in pharmacist_id int,in medication_id int,in status_id int,in dose_mg int,in created_date date,in modified_date date,in notes varchar(50))
BEGIN
DECLARE InsertedId INT;
insert into Prescription
(patient_id,doctor_id,pharmacist_id,medication_id,status_id,dose_mg,created_date,modified_date,notes)
values
(patient_id,doctor_id,pharmacist_id,medication_id,status_id,dose_mg,created_date,modified_date,notes);
Select LAST_INSERT_ID() into InsertedId;
	Select InsertedId;
	
END$

CREATE PROCEDURE sp_getPrescription(in PatientId int)
Begin

SELECT d.id as doctorid,d.firstname as DocFirstName,d.lastname as DocLastName,d.dea_number,d.degree,d.phone_number, 
m.id as medicationid,m.name as medname,m.common_name as medcomname,m.description as med_desc,
p.id as patientid,p.mercy_id as mercyid,p.mercy_clinic, p.firstname as PatFirstName,p.lastname as PatLastName,p.phone_number as PatPhone,
pm.id as pharmacistid,pm.dea_number pharmDea,pm.firstname as pharmFirst,pm.lastName as pharmLast,pm.phone_number as pharmPhone,
ps.id as statusid,ps.description as prescStatus,
pr.id as prescriptionid,pr.dose_mg as dose,pr.created_date,pr.modified_date,pr.notes
from
Patient p,Prescription pr,doctor d, medication m,pharmacist pm,prescription_status ps
where p.id=pr.patient_id and pr.doctor_id=d.id and pr.medication_id=m.id
and pm.id=pr.medication_id and ps.id=pr.status_id
and p.id=PatientId;
	
END$

Create Procedure sp_ModifyPrescription(in PrescriptionId int,in patient_id int,in doctor_id int,in pharmacist_id int,in medication_id int,in status_id int,in dose_mg int,in created_date date,in modified_date date,in notes varchar(50))
begin
Update Prescription
set patient_id=patient_id, doctor_id=doctor_id,pharmacist_id=pharmacist_id,
medication_id=medication_id,status_id=status_id,dose_mg=dose_mg,created_date=created_date,
modified_date=modified_date,notes=notes
where id=PrescriptionId;
Select PrescriptionId;
	
END$


Create Procedure sp_GetPrescriptionBasedOnId(in PrescriptionId int)
begin
SELECT d.id as doctorid,d.firstname as DocFirstName,d.lastname as DocLastName,d.dea_number,d.degree,d.phone_number, 
m.id as medicationid,m.name as medname,m.common_name as medcomname,m.description as med_desc,
p.id as patientid,p.mercy_id as mercyid,p.mercy_clinic, p.firstname as PatFirstName,p.lastname as PatLastName,p.phone_number as PatPhone,
pm.id as pharmacistid,pm.dea_number pharmDea,pm.firstname as pharmFirst,pm.lastName as pharmLast,pm.phone_number as pharmPhone,
ps.id as statusid,ps.description as prescStatus,
pr.id as prescriptionid,pr.dose_mg as dose,pr.created_date,pr.modified_date,pr.notes
from
Patient p,Prescription pr,doctor d, medication m,pharmacist pm,prescription_status ps
where p.id=pr.patient_id and pr.doctor_id=d.id and pr.medication_id=m.id
and pm.id=pr.medication_id and ps.id=pr.status_id
and pr.id=PrescriptionId;
