package edu.isys.assign3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.isys.assign3.domain.Record;
import edu.isys.assign3.repository.RecordRepository;
import edu.isys.assign3.repository.impl.EastRecordRepository;

public class EastRecordRepositoryTest {

	@Test
	public final void testGet() {
		String MercyId="E000000011";
		Record record=null;
		System.out.println("Testing West Repositroy");
		RecordRepository rr=new EastRecordRepository();
		record=rr.get(MercyId);
		assertEquals(MercyId, record.getMercyId());
		
	}

}
