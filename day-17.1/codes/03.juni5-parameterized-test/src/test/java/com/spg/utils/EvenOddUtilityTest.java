package com.spg.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class EvenOddUtilityTest {

	@ParameterizedTest
	@CsvSource(value = {"20, even", "21, odd", "22, even", "100, even", "209, odd"}, delimiter = ',')
	void testIsEvenOrOddForSuccessScenario(String input, String expected) {
		EvenOddUtility eoUtilObj = new EvenOddUtility();
		String actuals = eoUtilObj.isEvenOrOdd(Integer.parseInt(input));
		assertEquals(expected, actuals);
	}

	@BeforeEach
	public void beforeEachTest() {
		System.out.println("-- before each test");
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv")
	void testIsEvenOrOddFromFile(String input, String expected) {
		System.out.println(input + " --- " + expected);
		EvenOddUtility eoUtilObj = new EvenOddUtility();
		String actuals = eoUtilObj.isEvenOrOdd(Integer.parseInt(input));
		assertEquals(expected, actuals);
	}	
}
