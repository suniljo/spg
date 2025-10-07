package com.spg.utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckTest {

	@ParameterizedTest
	@ValueSource(strings = {"eye", "madam", "malayalam"})
	void testIsPalindrome(String str) {
		System.out.println("----> " + str);
		PalindromeCheck palCheckObj = new PalindromeCheck();
		assertTrue(palCheckObj.isPalindrome(str));
	}

}
