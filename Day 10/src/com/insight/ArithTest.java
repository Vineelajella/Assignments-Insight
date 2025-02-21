package com.insight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithTest {

	@Test
	void test() {
		
		Arith a=new Arith();
		assertEquals(10,a.add(5,5));
		
//		fail("Not yet implemented");
	}

}
