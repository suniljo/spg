package com.spg.java.utils;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		System.out.println(names + " | size = " + names.size());
		
		System.out.println(names.add("Rajeev")); //true
		System.out.println(names.add("Rajeev")); //false
		System.out.println(names.add("Mohan")); //true
		System.out.println(names.add("Murali")); //true
		names.add("Imran");
		names.add("Jeevan");
		
		System.out.println(names + " | size = " + names.size());
		
		names.add(null); //java.lang.NullPointerException
		System.out.println(names + " | size = " + names.size());
	}

}
