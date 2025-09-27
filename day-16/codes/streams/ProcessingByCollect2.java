package com.spg.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingByCollect2 {

	public static void main(String[] args) {
		List<String> courseNames = Arrays.asList("Core Java", "Advanced Java", "Spring", "Spring Boot", "Microservices", "React");
		System.out.println(courseNames);

		// create a new list of courses with each course name in capital letters
		Stream<String> courseNamesStream = courseNames.stream();
		Stream<String> courseNamesUpperStream = courseNamesStream.map(cname -> cname.toUpperCase());
		List<String> courseNamesInUppercase = courseNamesUpperStream.collect(Collectors.toList());
		System.out.println(courseNamesInUppercase);
		System.out.println();
		
		// create a new list of courses with each course name in capital letters with its length
		List<String> courseNamesWithLength = courseNames.stream()
														  .map(cname -> String.format("%-15s ---> %2d", cname.toUpperCase(), cname.length()))
														  .collect(Collectors.toList());
		System.out.println(courseNamesWithLength);
		courseNamesWithLength.stream()
							 .forEach(cname -> System.out.println(cname));
	}

}
