package com.spg.java.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaOnStringList {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sanjay", "Praveen","Aravind", "Bharath", "Wilson", "Charles");
		System.out.println("names in original order = " + names);
		
		/*
		//-- using anonymous class concept
		names.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int n = o1.compareTo(o2);
				if(n > 0) {
					return 1;
				}else {
					return -1;
				}
			}			
		});
		*/
		
		/*
		//--using lambdas
		Comparator<String> namesComparator = (String o1, String o2) -> o1.compareTo(o2);
		names.sort(namesComparator);
		*/
		
		names.sort((newName, existingName) -> (newName.compareTo(existingName) > 0) ? 1 : -1);
		System.out.println("names in sorted order = " + names);
	}

}
