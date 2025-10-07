package com.spg.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("PALINDROME CHECK TESTS")
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
	@DisplayName("TEST PASS")
	void testIsPalindromePass() {
		String str = "Eye";
		boolean actualResult = palCheckObj.isPalindrome(str);
		assertTrue(actualResult);
	}

	@Test
	void testIsPalindromePass1() {
		String str = "MaDaM";
		boolean actualResult = palCheckObj.isPalindrome(str);
		assertTrue(actualResult);
	}	
	
	@Test
	void testIsPalindromeFail() {
		String str = "java";
		boolean actualResult = palCheckObj.isPalindrome(str);
		assertFalse(actualResult);
	}	
}
