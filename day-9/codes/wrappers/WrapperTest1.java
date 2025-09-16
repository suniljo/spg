package com.spg.java.wrappers;

public class WrapperTest1 {

	public static void main(String[] args) {
		Integer in1 = new Integer(25);
		Integer in2 = new Integer("25");
		System.out.println(in1 + " | " + in2);
		
		Integer in3 = Integer.valueOf(25);
		Integer in4 = Integer.valueOf("25");
		System.out.println(in3 + " | " + in4);
		
		Character c1 = new Character('A');
		Character c2 = Character.valueOf('A');
		System.out.println(c1 + " | " + c2);
	}
}
