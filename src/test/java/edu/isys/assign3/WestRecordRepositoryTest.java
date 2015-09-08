package edu.isys.assign3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.isys.assign3.domain.Record;
import edu.isys.assign3.domain.Visit;
import edu.isys.assign3.repository.RecordRepository;
import edu.isys.assign3.repository.impl.*;
public class WestRecordRepositoryTest {

	@Test
	public final void testGet() {
		String MercyId="W000000001";
		int numVisits=0;
		Record record=null;
		RecordRepository rr=new WestRecordRepository();
		record=rr.get(MercyId);
		System.out.println("Testing West Repositroy");
		for(Visit v:record.getVisits()){
			System.out.println(v.getNotes()+":"+v.getDoctor()+":"+v.getDate());
			numVisits++;
		}
		assertEquals(MercyId, record.getMercyId());
	}
}
