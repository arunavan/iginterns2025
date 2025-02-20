package com.insight;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
class LoanTest2 {
	Loan l;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//db   once
		System.out.println(" before all");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after all");
		//db close
	}
	@BeforeEach
	void setUp() throws Exception {
		System.out.println(" before each");
		l=new Loan();
	}
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each");
		l=null;
	}
	@Test
	void testGetEmi() {
		//fail("Not yet implemented");
		assertEquals(5000,l.getEmi(60000));
	}
	@Test
	void testSum() {
		assertEquals(10,l.sum(6, 4));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDevide1() {
		assertEquals(5,l.divide(10,2));
	}
	/*
	@Test
	 public void testDivide() {
	  ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
		 l.divide(15,3);
	 });
	 assertEquals("/ by zero", exception.getMessage());
	 } 
	@Test
	public void testDeposit() {
		  MyException e=assertThrows(MyException.class,()-> { l.deposit();});
		  assertEquals("sample exception",e.getMessage());
	}
	*/
	@Test
    void testAddition() {
        int num1 = -8;
        int num2 = -10;
       assumingThat(num1 >= 0 && num2 >= 0, () -> {
            int sum = addNumbers(num1, num2);
            assertEquals(28, sum);
        });
        
        assumeTrue(num1 > 0 && num2 > 0);
        assertEquals(18, num1+num2);
  }
    private int addNumbers(int a, int b) {
        return a + b;
    }
    @ParameterizedTest
	@ValueSource(ints = {1, 3, 5, 15,17,22,25,27,89,678,8796}) 
	void ifEvenOrOddTest(Integer number) {
 	    assertTrue(l.isOdd(number));
	}
    
    @TestFactory
    Collection<DynamicTest> dynamicTestsWithCollection() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Test 1 + 1 = 2", () -> assertEquals(2, 1 + 1)),
                DynamicTest.dynamicTest("Test 2 * 2 = 4", () -> assertEquals(4, 2 * 2))
        );
    }
        @TestFactory
        DynamicTest  dynamicTest1() {
        	return DynamicTest.dynamicTest("Test",()->assertEquals(10,6+4));
        }
        
        
        
}
