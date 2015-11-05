package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CShcheduleTest {
	public void setScheduleTest()
	{
		CSchedule cs = new CSchedule();
		CMeeting cm = new CMeeting();
		CTime ct = new CTime();	
	}
	
	@Test
	public void checkTotalMeetingsTest(){
		CMeeting[] m = new CMeeting[10];
		for(int i=0; i<10; i++){
			m[i] = new CMeeting();
		}
		
		m[0].setTimes(1, 0, 2, 0);
		m[1].setTimes(2, 0, 3, 0);
		m[2].setTimes(3, 30, 4, 0);
		m[3].setTimes(4, 0, 5, 0);
		m[4].setTimes(5, 30, 6, 0);
		m[5].setTimes(6, 0, 7, 0);
		m[6].setTimes(7, 0, 8, 30);
		m[7].setTimes(8, 30, 9, 0);
		m[8].setTimes(9, 0, 10, 0);
		m[9].setTimes(10, 0, 11, 30);
		
		CSchedule cs = new CSchedule();
		CMeeting cm[] = new CMeeting[]{m[0]};
		assertTrue(cs.checkTotalMeetings(cm));
		cm = new CMeeting[]{m[0], m[1], m[2]};
		assertTrue(cs.checkTotalMeetings(cm));
		cm = new CMeeting[]{m[3], m[4], m[5], m[6], m[7], m[8], m[9] };
		assertTrue(cs.checkTotalMeetings(cm));
		cm = new CMeeting[]{m[0], m[1], m[2], m[3], m[4], m[5], m[6], m[7], m[8], m[9]};
		assertFalse(cs.checkTotalMeetings(cm));
		
	}
	
}


