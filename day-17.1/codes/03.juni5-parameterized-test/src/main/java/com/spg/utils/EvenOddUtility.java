package com.spg.utils;

public class EvenOddUtility {

	public String isEvenOrOdd(int num) {
		int rem = num % 2;
		
		if(rem == 0)
			return "even";
		else
			return "odd";
	}
}
