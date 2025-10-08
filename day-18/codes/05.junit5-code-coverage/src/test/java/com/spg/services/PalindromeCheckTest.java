package com.spg.services;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PalindromeCheckTest {
	private static PalindromeCheck palCheckObj;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		palCheckObj = new PalindromeCheck();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		palCheckObj = null;
	}

	@Test
	void testIsPalindromePass() {
		String str = "Eye";
		boolean actualResult = palCheckObj.isPalindrome(str);
		assertTrue(actualResult);
	}

	@Test
	void testIsPalindromeFail() {
		String str = "Java";
		boolean actualResult = palCheckObj.isPalindrome(str);
		assertFalse(actualResult);
	}	

}
