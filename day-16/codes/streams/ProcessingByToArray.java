package com.spg.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProcessingByToArray {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(65, 82, 76, 60, 92, 81, 50);
		
		Object[] objArray = nums.stream()
								.toArray();
		System.out.println(Arrays.toString(objArray));
		
	
		Integer[] intArray = nums.stream()
								 .toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray));
		
		Stream<String> stringStream = Stream.of("red", "green", "blue");
        String[] stringArray = stringStream.toArray(String[]::new);
        System.out.println(Arrays.toString(stringArray));
        
        //IntStream intStream = IntStream.range(1, 5);
        IntStream intStream = IntStream.rangeClosed(1, 5);
        int[] primitiveIntArray = intStream.toArray();
        System.out.println(Arrays.toString(primitiveIntArray));
	}

}
