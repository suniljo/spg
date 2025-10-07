package com.spg.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class LargestServiceTest {
	private static LargestService serviceObj;
	
	@BeforeAll
	public static void setUpTests() {
		System.out.println("-- before all the tests");
		serviceObj = new LargestService();
	}
	
	@BeforeEach
	public void beforeEachTest(TestInfo info) {
		System.out.println("====== before each test ---> " + info.getTestMethod().get().getName());
	}
	
	@AfterEach
	public void afterEachTest(TestInfo info) {
		System.out.println("====== after each test  ---> " + info.getTestMethod().get().getName());
	}
	
	@Test
	void testFindLargest() {
		//LargestService serviceObj = new LargestService();
		int[] data = {10, 25, 34, 6, 10, 16};
		
		int expectedLargest = 34;
		int actualLargest = serviceObj.findLargest(data);
		
		assertEquals(expectedLargest, actualLargest);
	}

	@Test
	void testFindLargestForNegativeNumbers() {
		//LargestService serviceObj = new LargestService();
		int[] data = {-10, -25, -34, -6, -10, -16};
		
		int expectedLargest = -6;
		//int expectedLargest = -10;
		int actualLargest = serviceObj.findLargest(data);
		
		//assertEquals(expectedLargest, actualLargest);
		assertEquals(expectedLargest, actualLargest, "my expectation was wrong");
	}
	
	@Test
	void testFindLargestForEmptyDataSet() {
		//LargestService serviceObj = new LargestService();
		int[] data = {};
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> serviceObj.findLargest(data));
	}
	
	@AfterAll
	public static void allTestsCompleted() {
		System.out.println("-- all tests completed");
		serviceObj = null;
	}
}
