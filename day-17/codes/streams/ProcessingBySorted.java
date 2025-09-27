package com.spg.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingBySorted {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(65, 82, 76, 60, 92, 81, 50, 50, 82);
		System.out.println(marks);
		
		/*
		//-- normal approach
		Collections.sort(marks);
		System.out.println(marks);
	   */
	   //generate a list in the sorted order of marks in ascending	
	   List<Integer> marksSorted = marks.stream()
			   							.sorted()
			   							.collect(Collectors.toList());
	   System.out.println(marksSorted);
	   System.out.println("-".repeat(100));
	   
	   //generate a list in the sorted order of marks in descending	- approach-1
	   List<Integer> marksSortedDesc = marks.stream()
			   								.sorted((newMark, existsingMark) -> (newMark > existsingMark) ? -1 : 1)
			   								.collect(Collectors.toList());
	   System.out.println(marksSortedDesc);	
	   
	   //generate a list in the sorted order of marks in descending	- approach-2
	   List<Integer> marksSortedDescending = marks.stream()
			   									  .sorted(Comparator.reverseOrder()) //Returns a comparator that imposes the reverse of the natural ordering
			   									  .collect(Collectors.toList());
	   System.out.println(marksSortedDescending);	   
	}

}
