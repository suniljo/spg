package com.spg.java.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		Map<String, Float> bank = new HashMap<String, Float>();

		System.out.println(bank.put("Sunil", 15000f)); // null
		System.out.println(bank.put("Sunil", 11500.5f)); // 15000.0
		System.out.println(bank.put("Anil", 15000f)); // null
		bank.put("Praveen", 25000f);
		bank.put("Charles", 45250.5f);
		bank.put("Rahul", 11500f);

		System.out.println(bank);
		System.out.println("Anil".hashCode() % 16);
		System.out.println();

		if (bank.containsKey("Sunil")) {
			float bal = bank.get("Sunil");
			System.out.println("A/c balance of \"Sunil\" = " + bal);
			bal += 1250.5f;
			bank.put("Sunil", bal);
			System.out.println(bank);
		}
		System.out.println();
		
		Set<String> names = bank.keySet();
		System.out.print("A/C Holders = ");
		for(String name : names) {
			System.out.print(name + " | ");
		}
		System.out.println("\n");
		
		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>> it =  entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Float> entry = it.next();
			String name = entry.getKey();
			float bal = entry.getValue();
			
			System.out.println(String.format("%-20s - %.2f", name, bal));
			Thread.sleep(1500);
		}
		System.out.println();
		
		bank.put(null, null);
		System.out.println(bank);
	}
}
