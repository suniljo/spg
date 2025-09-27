package com.spg.java.datetime;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		String[] names = new String[10];
		System.out.println(names[0]);
		//System.out.println(names[0].length()); //java.lang.NullPointerException
		System.out.println();
		
		Optional<String> opt = Optional.empty();
		System.out.println(opt);
		System.out.println(opt.isEmpty()); //true
		System.out.println(opt.isPresent()); //false
		System.out.println();
		
		opt = Optional.of("Java");
		//opt = Optional.of(null); //java.lang.NullPointerException
		System.out.println(opt);
		System.out.println(opt.isEmpty()); //false
		System.out.println(opt.isPresent()); //true
		if(opt.isPresent()) {
			String str = opt.get();
			System.out.println(str);
		}	
		System.out.println();
		
		//opt = Optional.ofNullable("Java");
		opt = Optional.ofNullable(null);
		System.out.println(opt);
		System.out.println(opt.isEmpty()); //false
		System.out.println(opt.isPresent()); //true
		if(opt.isPresent()) {
			String str = opt.get();
			System.out.println(str);
		}			
	}

}
