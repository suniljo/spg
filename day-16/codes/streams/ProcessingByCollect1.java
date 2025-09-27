package com.spg.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingByCollect1 {

	public static void main(String[] args) {
		List<String> courseNames = Arrays.asList("Core Java", "Advanced Java", "Spring", "Spring Boot", "Microservices" , "React");
		System.out.println(courseNames);

		//create a new List of courses where course name length is greater than or equals 8 chars
		List<String> courseNamesGreaterThan8CharsLength = courseNames.stream()
																	 .filter(cname -> cname.length() >= 8)
																	 .collect(Collectors.toList());
		System.out.println("course names whose length >=8 :: " + courseNamesGreaterThan8CharsLength);
	}

}
