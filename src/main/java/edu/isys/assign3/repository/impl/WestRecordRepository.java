package edu.isys.assign3.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.isys.assign3.domain.Record;
import edu.isys.assign3.domain.Visit;
import edu.isys.assign3.repository.RecordRepository;
import edu.isys.assign3.util.DBHelper;
import edu.isys.assign3.util.GetData;

public class WestRecordRepository implements RecordRepository {

	public Record get(String mercyId) {
		// TODO Auto-generated method stub
		Record found=null;
		ResultSet rs=null;
		String name="",gender="",insurance="",groupId="",clinic="";
		int i=0;
		GetData gd=new GetData();
		List<Visit> visits=new ArrayList<Visit>();
		rs=gd.getResultFromWestMercyEHR(mercyId);
		try {
			while(rs.next()){
				//Creating a Visit object for each visit details retrieved above
				Visit v=new Visit(rs.getInt("id"),rs.getDate("visit_date"),rs.getString("doctor"),rs.getString("diagnosis"),rs.getString("notes"));
				//Adding these visits to a List object
				visits.add(v);
				if (i==0){
				name=rs.getString("firstname")+" "+ rs.getString("lastname");
				gender=rs.getString("gender");
				insurance= rs.getString("insurance");
				groupId=rs.getString("groupId");
				clinic=rs.getString("clinic");
				}
				i++;
			}
			//Creating Record object for the retrieved
			found=new Record(mercyId ,name, gender, insurance,groupId,clinic,visits);
			if(found.getMercyId()==mercyId){
				return found;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return found;
	}
}
