package edu.isys.assign3.repository.impl;

import java.util.List;

import edu.isys.assign3.domain.Record;
import edu.isys.assign3.domain.Visit;
import edu.isys.assign3.repository.RecordRepository;
import edu.isys.assign3.util.JsonUtil;

public class EastRecordRepository implements RecordRepository {

	//Getting the Record if it exists in the EastMercyEHR
	//by passing the MercyId for the Patient
	public Record get(String mercyId) {
		// TODO Auto-generated method stub
		Record found=null;
		List<Record> records= JsonUtil.loadRecordsFromJson();
		for(Record record:records){
			if(record.getMercyId().equals(mercyId)){
				found=record;
				for(Visit v:record.getVisits()){
					System.out.println(v.getNotes()+":"+v.getDoctor()+":"+v.getDate());
				}
				break;
			}
		}
		return found;
	}
	
}
