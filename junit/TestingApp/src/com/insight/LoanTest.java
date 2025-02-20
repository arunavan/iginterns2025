package com.insight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
public class LoanTest {
	public LoanTest(){
		
	}
	@Test
	//@RepeatedTest(5)
	void testGetEmi() {
		Loan l=new Loan();
		int actual=l.getEmi(60000);
		assertEquals(5000,actual);
		//fail("Not yet implemented");
	}
	@Test
	//@Ignore
	//@Disabled
	void testSum() {
		Loan l=new Loan();
		assertEquals(7,l.sum(3, 4));
		//fail("Not yet implemented");
	}
}
