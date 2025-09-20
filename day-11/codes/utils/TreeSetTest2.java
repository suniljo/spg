package com.spg.java.utils;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		NavigableSet<String> names = new TreeSet<String>();
		if(names.size() > 0) {
			System.out.println("first() --> " + names.first()); //java.util.NoSuchElementException
		}
		names.add("Charles");
		names.add("Praveen");
		names.add("Rahul");
		names.add("Sachin");
		names.add("Bharath");
		names.add("Abhay");
		names.add("Valerie");
		
		System.out.println(names);
		if(names.size() > 0) {
			System.out.println("first() --> " + names.first());
			System.out.println("last() --> " + names.last());
			
			//SortedSet<String> headSet = names.headSet("Praveen");
			Set<String> headSet = names.headSet("Praveen"); //("Sanjay")
			System.out.println("headSet(Praveen) --> " + headSet);
			
			Set<String> tailSet = names.tailSet("Praveen");
			System.out.println("tailSet(Praveen) --> " + tailSet);
			
			//System.out.println("Valerie".compareTo("a"));
			Set<String> subSet = names.subSet("Anil", "a");
			System.out.println("subSet(Anil, ) ---> " + subSet);
			
			System.out.println();
			
			System.out.println("lower(Charles) ---> " + names.lower("Charles"));
			System.out.println("lower(Aanand) ---> " + names.lower("Aanand"));
			
			Set<String> decendingSet = names.descendingSet();
			System.out.println(decendingSet);
		}
	}
}
