package com.spg.java.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new LinkedHashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 15000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
		System.out.println(bank.put("Anil", 15000f)); //null
		bank.put("Praveen", 25000f);
		bank.put("Charles", 45250.5f);
		bank.put("Rahul", 11500f);
		
		System.out.println(bank);
		
		bank.put(null, null);
		System.out.println(bank);
	}

}
