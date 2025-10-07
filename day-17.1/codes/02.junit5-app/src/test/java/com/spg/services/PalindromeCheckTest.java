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
//@Disabled
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
	//@RepeatedTest(value = 2)
	@RepeatedTest(value = 3, name = "{displayName} ----> {currentRepetition} of {totalRepetitions}")
	@Tag("dev")
	//@Disabled
	void testIsPalindromePass() {
		String str = "Eye";
		boolean actualResult = palCheckObj.isPalindrome(str);
		assertTrue(actualResult);
	}

	@Test
	@Tag("qa")
	void testIsPalindromePass1() {
		String str = "MaDaM";
		boolean actualResult = palCheckObj.isPalindrome(str);
		assertTrue(actualResult);
	}	
	
	@Test
	
	@Tag("prod")
	void testIsPalindromeFail() {
		String str = "java";
		boolean actualResult = palCheckObj.isPalindrome(str);
		assertFalse(actualResult);
	}	
}
