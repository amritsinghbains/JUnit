package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CTimeTest {

	@Test
	public void setTimeTest() {
		CTime ct = new CTime();
		assertTrue(ct.setTime(11, 10));
		assertFalse(ct.setTime(122, 10));
		
	}

}
