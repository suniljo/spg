package com.spg.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest1 {

	public static void main(String[] args) {
		String str = "Java";
		
		Function<String, Integer> strLenFun = st -> st.length();
		//Function<String, String> strLenFun = st -> st.toUpperCase();
		System.out.println(strLenFun.apply(str));
		
		Function<String, String> strFun = st -> st.toUpperCase() +" ---- " + str.length();
		System.out.println(strFun.apply(str));
		System.out.println();
		
		List<String> courses = Arrays.asList("Core Java", "Advanced Java", "Spring", "Spring Boot", "Microservices", "React");
		List<String> coursesProcessed = courses.stream()
											   .map(cname -> String.format("%-20s ---> %2d", cname.toUpperCase(), cname.length()))
											   .collect(Collectors.toList());
		coursesProcessed.forEach(cn -> System.out.println(cn));
	}
}
