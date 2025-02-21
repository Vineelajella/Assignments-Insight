package com.insight;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class VoterValidatorTest {
	VoterValidator v;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("before all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before all");
		v=new VoterValidator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testValidateVoterAge(){;
		Exception e=assertThrows(Exception .class,()->{v.validateVoterAge(-3);});
		assertEquals("Invalid age",e.getMessage());
		
//		fail("Not yet implemented");
		
	}
//	@ignore
//	void testValidateVoterAge1() throws Exception{;
//
//	assertEquals(true,v.validateVoterAge(21));
//	
//
//	
//}
	
	//parameterized
	
	  @ParameterizedTest
	  @ValueSource(ints = { 19,20,45,78,19,70})

		public void validateVoterAge1(int age) throws Exception {
 assertTrue(v.validateVoterAge(age));
		 
	  }
	  @ParameterizedTest
	  @ValueSource(ints = { 12,13,14,14})
	  
		public void validateVoterAge2(int age) throws Exception {
			 assertFalse(v.validateVoterAge(age));
					 
				  }
	  
	  
	  
			
	
	


}
