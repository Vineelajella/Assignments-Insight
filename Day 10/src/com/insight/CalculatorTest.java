package com.insight;


import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		assertEquals(12,c.add(6, 6));
		
		
//		fail("Not yet implemented");
	}

	@Test
	void testIsgreaterthan() {
		assertTrue(c.isgreaterthan(21, 20));
		assertTrue(c.isgreaterthan(21, 19));
//		fail("Not yet implemented");
	}

	@Test
	void testIsless() {
		assertFalse(c.isless(24, 21));
//		fail("Not yet implemented");
	}

	@Test
	void testIsnull() {
		assertNull(c.isnull(null));
//		fail("Not yet implemented");
	}

	

}
