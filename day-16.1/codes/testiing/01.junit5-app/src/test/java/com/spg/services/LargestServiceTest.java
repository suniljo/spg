package com.spg.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class LargestServiceTest extends LargestService {

	@Test
	void testFindLargest() {
		LargestService serviceObj = new LargestService();
		int[] data = {10, 25, 34, 6, 10, 16};
		
		int expectedLargest = 34;
		int actualLargest = serviceObj.findLargest(data);
		
		assertEquals(expectedLargest, actualLargest);
	}

	@Test
	void testFindLargestForNegativeNumbers() {
		LargestService serviceObj = new LargestService();
		int[] data = {-10, -25, -34, -6, -10, -16};
		
		int expectedLargest = -6;
		int actualLargest = serviceObj.findLargest(data);
		
		assertEquals(expectedLargest, actualLargest);
	}
	
	@Test
	void testFindLargestForEmptyDataSet() {
		LargestService serviceObj = new LargestService();
		int[] data = {};
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> serviceObj.findLargest(data));
	}	
}
