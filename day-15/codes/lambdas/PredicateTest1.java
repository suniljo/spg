package com.spg.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateTest1 {

	public static void main(String[] args) {
		// get the even numbers from a list of numbers
		List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		System.out.println("original numbers = " + nums);
		
		List<Integer> evenNums = nums.stream()
									 .filter(num -> num%2 ==0)
									 .collect(Collectors.toList());
		System.out.println("even numbers = "+ evenNums);
		
		System.out.print("odd numbers = ");
		nums.stream()
			.filter(n -> n%2 == 1)
			.forEach(n -> System.out.print(n+", "));
	}

}
