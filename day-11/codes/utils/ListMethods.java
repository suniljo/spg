package com.spg.java.utils;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println(names + " | size= " + names.size());
		System.out.println("is empty = " + names.isEmpty());
		
		names.add("Sunil");
		names.add("Mohan");
		names.add("Murali");
		names.add("Abhilash");
		names.add("Sunil");
		names.add("Jeevan");
		names.add("Sunil");
		
		System.out.println(names + " | size= " + names.size());
		//System.out.println("is empty = " + names.isEmpty());
		
		names.add(1, "Sanjana");
		System.out.println(names + " | size= " + names.size());
		names.set(1, "SANJANA");
		System.out.println(names + " | size= " + names.size());
		System.out.println();
		
		System.out.println("is \"Sunil\" in list = " + names.contains("Sunil"));
		
		System.out.println("indexOf(Sunil) = " + names.indexOf("Sunil"));
		System.out.println("lastIndexOf(Sunil) = " + names.lastIndexOf("Sunil"));
		System.out.println("indexOf(Imran) = " + names.indexOf("Imran")); //-1
		System.out.println();
		
		System.out.println("person @ index 1 = " + names.get(1));
		
		//System.out.println("person @ index 8 = " + names.get(8)); //java.lang.IndexOutOfBoundsException
		
		System.out.println("remove(object) = " + names.remove("Sunil")); //boolean
		System.out.println(("remove(index) = " + names.remove(0))); //element
		
		System.out.println(names + " | size= " + names.size());
	}

}
