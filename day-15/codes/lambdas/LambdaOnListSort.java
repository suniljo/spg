package com.spg.java.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaOnListSort {
	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(85, 79, 66, 92, 89, 60);
	    System.out.println("original marks = " + marks);
	    
	    //Collections.sort(marks);
	    //Comparator<Integer> compForMarks = (m1, m2) -> (m1 > m2) ? 1 : -1;
	    Comparator<Integer> compForMarks = (m1, m2) -> (m1 > m2) ? -1 : 1;
	    Collections.sort(marks, compForMarks);
	    System.out.println("marks in ascending order = " + marks);
	}
}
