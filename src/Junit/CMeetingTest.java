package Junit;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class CMeetingTest {

	@Test
	public void checkValidTest() throws ParseException {
		
		
		for(int h1=0; h1<24; h1++){
			for(int m1=0; m1<60; m1++){
				for(int h2=0; h2<24; h2++){
					for(int m2=0; m2<60; m2++){
						
						CTime start = new CTime();
						CTime end = new CTime();
						
						start.hour = h1;
						start.minute = m1;
						end.hour = h2;
						end.minute = m2;
						
						CMeeting cm = new CMeeting();
						System.out.println(cm.checkValid(start, end) + " , " + checkValidDateTime(start, end));
						assertEquals(cm.checkValid(start, end), checkValidDateTime(start, end));
					}
				}
			}
		}
		
		
		
	}
	
	public Boolean checkValidDateTime(CTime start, CTime end) throws ParseException{
		Boolean result = false;	
		
		String time1 = start.hour + ":" + start.minute;
		String time2 = end.hour + ":" + end.minute;

		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		long difference = (date2.getTime() - date1.getTime())/(1000*60); 
		
		if(difference >= 0 && difference <= 60){
			result = true;
		}
		return result;		
	}

}
