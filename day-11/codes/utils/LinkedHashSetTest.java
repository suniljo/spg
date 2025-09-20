package com.spg.java.utils;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();
		System.out.println(names + " | size = " + names.size());
		
		System.out.println(names.add("Rajeev")); //true
		System.out.println(names.add("Rajeev")); //false
		System.out.println(names.add("Mohan")); //true
		System.out.println(names.add("Murali")); //true
		names.add("Imran");
		names.add("Jeevan");
		
		System.out.println(names + " | size = " + names.size());
		
		names.add(null);
		System.out.println(names + " | size = " + names.size());
	}

}
