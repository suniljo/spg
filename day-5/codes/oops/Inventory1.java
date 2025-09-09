package com.spg.java.oops;

public class Inventory1 {

	public static void main(String[] args) {
		Product laptop = new Product(254165, "Laptop", 75000f);
		
		System.out.println("\"laptop\" is of type = " + laptop.getClass().getName());
		System.out.println("\"laptop\" is of type = " + laptop.getClass().getSimpleName());
		System.out.println();
		
		System.out.println("hashCode() of laptop = " + laptop.hashCode());
		System.out.println("hashCode() of laptop in hex form = " + Integer.toHexString(laptop.hashCode()));
		System.out.println();
		
		System.out.println(laptop); //toString()
	}
}
