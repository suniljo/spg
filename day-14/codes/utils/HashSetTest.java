package com.spg.java.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		System.out.println(names + " | size = " + names.size());
		
		System.out.println(names.add("Rajeev")); //true
		System.out.println(names.add("Rajeev")); //false
		System.out.println(names.add("Mohan")); //true
		System.out.println(names.add("Murali")); //true
		names.add("Imran");
		names.add("Jeevan");
		
		System.out.println(names + " | size = " + names.size());
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("----> " + name);
		}
		System.out.println();
		
		names.add(null);
		System.out.println(names + " | size = " + names.size());
	}

}
