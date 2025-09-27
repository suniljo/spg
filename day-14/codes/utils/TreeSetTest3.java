package com.spg.java.utils;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest3 {

	public static void main(String[] args) {
		
		Set set1 = new HashSet();
		set1.add("aaa");
		set1.add("bbb");
		set1.add(123.45);
		set1.add(345);
		set1.add(true);
	    System.out.println(set1);

	    System.out.println();
	    
		Set set2 = new TreeSet();
		set2.add("aaa");
		set2.add("bbb");
		set2.add(123.45); //java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Double 
		
		System.out.println(set2);

	}

}
