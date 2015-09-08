package edu.isys.assign3.repository.impl;

import java.util.List;

import edu.isys.assign3.domain.Record;
import edu.isys.assign3.repository.RecordRepository;
import edu.isys.assign3.util.JsonUtil;

public class MasterRecordRepository implements RecordRepository {

	private EastRecordRepository eastRepo=new EastRecordRepository();
	private WestRecordRepository westRepo=new WestRecordRepository();
	
	public Record get(String mercyId) {
		// TODO Auto-generated method stub
		Record found=null;
		if(mercyId.startsWith("E")){
			//Get the record from the East Repository
			found=eastRepo.get(mercyId);
		}
		else if (mercyId.startsWith("W")){
			//Get the record from the West Repository
			found=westRepo.get(mercyId);
		}
		return found;
	}

}
