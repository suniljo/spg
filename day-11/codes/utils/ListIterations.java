package com.spg.java.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListIterations {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(89, 76, 82, 93, 70, 68, 64);
		System.out.println(marks);
		
		iterate1(marks);
		iterate2(marks);
		iterate3(marks);
		iterate4(marks);
		iterate5(marks);
		iterate6(marks);
		iterate7(marks);
	}

	private static void iterate1(List<Integer> marks) {
		System.out.println("===> list iteration using for loop and get() method - only for java.util.List implementations");
		for(int i=0; i<marks.size(); i++) {
			Integer n = marks.get(i);
			System.out.print(n + " ".repeat(6));
		}
		System.out.println("\n");
	}
	
	private static void iterate2(List<Integer> marks) {
		System.out.println("===> list iteration using enhanced for loop");
		for(Integer mark : marks) {
			System.out.print(mark + " ".repeat(6));
		}
		System.out.println("\n");
	}
	
	private static void iterate3(List<Integer> marks) {
		System.out.println("===> list iteration using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + " ".repeat(6));
		}
		System.out.println("\n");
	}
	
	private static void iterate4(List<Integer> marks) {
		System.out.println("===> list iteration using java.util.ListIterator - only for java.util.List implementations");
		ListIterator<Integer> it = marks.listIterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + " ".repeat(6));
		}
		System.out.println();
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n + " ".repeat(6));
		}		
		System.out.println("\n");
	}
	
	private static void iterate5(List<Integer> marks) {
		System.out.println("===> list iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(marks);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n + " ".repeat(6));
		}
		System.out.println("\n");
	}
	
	private static void iterate6(List<Integer> marks) {
		System.out.println("===> list iteration using forEach() anonymous class");
		marks.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t + " ".repeat(6));				
			}			
		});
		System.out.println("\n");
	}
	
	private static void iterate7(List<Integer> marks) {
		System.out.println("===> list iteration using forEach() lambda expression");
		marks.forEach(mark -> System.out.print(mark + " ".repeat(6)));
	}	
}
