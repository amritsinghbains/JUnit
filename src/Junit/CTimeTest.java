package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CTimeTest {

	@Test
		public void setTimeTest() {
			CTime ct = new CTime();
			for (int h=-100; h<100;h++)
			{
				for (int m = -100; m<100; m++)
				{
					System.out.println("Hours: " + h + " Minutes: " + m );
					
					if(h<0 && m<0)
					{
						assertFalse(ct.setTime(h, m));
					}
					else if (h<0 && m>0)
					{
						assertFalse(ct.setTime(h, m));
						
					}
					else if(h>=0 && m>=0 )
					{
						if(h>23 || m>59)
						{
							assertFalse(ct.setTime(h, m));
						}
						else 
						{
							assertTrue(ct.setTime(h, m));
						}
						
					}
					
						
	}
		}
		}

}
