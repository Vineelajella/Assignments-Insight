package com.insight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanTest {
	Loan l;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//called only once eg: db connection  to open conn
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		//close conn after all test cases exec it is called only once eg:db close 
	}

	@BeforeEach
	void setUp() throws Exception {
		l=new Loan(); //for each test case it is exec 
	}

	@AfterEach
	void tearDown() throws Exception {
		//for each test each it is exec obj is nullified
		l=null;
	}

	@Test
	void testGetEmi() {
		assertEquals(5000,l.getEmi(60000));
		
		
//		fail("Not yet implemented");
	}

	@Test
	void testSum() {
		assertEquals(l.sum(10, 8),18);
		
//		fail("Not yet implemented");
	}

	@Test
	void testDivide() {
		
		ArithmeticException exception=assertThrows(ArithmeticException.class ,()->{l.divide(10, 0);});
		assertEquals("/ by zero",exception.getMessage());
		
		
//		fail("Not yet implemented");
	}

	@Test
	void testDeposit() {
		MyException exception=assertThrows(MyException.class ,()->{l.deposit();});
		assertEquals("sample exception",exception.getMessage());
//		fail("Not yet implemented");
	}
	
	

}
