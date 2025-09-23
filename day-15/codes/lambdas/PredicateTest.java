/**
checking number is even or not
*/
package com.spg.java.lambdas;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> numsPredicate = (num) -> {return num%2 == 0; };
		//int n = 25;
		int n = 26;
		boolean isEven = numsPredicate.test(n);
		if(isEven)
			System.out.println(n + " is EVEN");
		else
			System.out.println(n + " is ODD");
	}

}
