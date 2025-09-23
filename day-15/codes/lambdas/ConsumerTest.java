package com.spg.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> consumerRef = 	name -> System.out.println("Hello " + name + ", welcome to S&P Global");
				
		consumerRef.accept("Sanjay");
		consumerRef.accept("Valerie");
		System.out.println();
		
		List<String> names = Arrays.asList("Sanjay", "Praveen","Aravind", "Bharath", "Wilson");
		names.forEach(consumerRef);
		System.out.println();
		
		names.forEach(t -> System.out.println(String.format("Hi %s",t.toUpperCase())));
	}

}
