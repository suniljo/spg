package com.spg.services;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName(value = "LARGEST | PALINDROME | EVENODD | TESTS")
@SelectClasses({ EvenOddUtilityTest.class, LargestServiceTest.class, PalindromeCheckTest.class })
//@SelectPackages(value = {"com.spg.services"})
public class AllTests {

}
