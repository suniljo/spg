package com.spg.services;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class EvenCheckTest {

	@Test
	void testIsEven() {
		int num = 22;
		EvenCheck ecObj = new EvenCheck();
		boolean actuals = ecObj.isEven(num);
		assertTrue(actuals);
	}

	@Test
	void testNotEven() {
		int num = 21;
		EvenCheck ecObj = new EvenCheck();
		boolean actuals = ecObj.isEven(num);
		assertFalse(actuals);
	}	
}
