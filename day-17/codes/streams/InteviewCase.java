package com.spg.java.streams;

import java.util.stream.IntStream;

public class InteviewCase {

	public static void main(String[] args) {
		/*
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + "      ");
			}
			System.out.println();
		}
		*/
		
		
		IntStream.rangeClosed(1, 5)
				 .forEach(i -> {
					 IntStream.rangeClosed(1, i)
					 		  .forEach(j -> System.out.print(j+"     "));
					 System.out.println();
				 });				 
	}
}
