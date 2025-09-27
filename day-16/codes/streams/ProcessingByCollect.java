package com.spg.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingByCollect {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		System.out.println("original data = " + nums);

		// -- make a copy of nums using Stream
		Stream<Integer> numsStream = nums.stream();
		List<Integer> numsCopy = numsStream.collect(Collectors.toList());
		System.out.println("copy of nums = " + numsCopy);
		
		//System.out.println(numsStream.count()); //java.lang.IllegalStateException: stream has already been operated upon or closed
		System.out.println();
		
		//collect even numbers from nums list - traditional approach
		List<Integer> evenNums = new ArrayList<Integer>();
		for(int num : nums) {
			int rem = num % 2;
			if(rem == 0) {
				evenNums.add(num);
			}
		}
		System.out.println("even numbers using traditional approach = " + evenNums);
		
		//collect even numbers from nums list - stream approach & lambdas
		/*
		Stream<Integer> numsStream1 = nums.stream();
		Stream<Integer> numsStream2 = numsStream1.filter(n -> n%2 == 0);
		List<Integer> evenNums1 = numsStream2.collect(Collectors.toList());
		*/
		List<Integer> evenNums1 = nums.stream()
									  .filter(n -> n%2 == 0)
									  .collect(Collectors.toList());
		System.out.println("even numbers using stream approach = " + evenNums1);
	}

}
