package com.spg.java.wrappers;

public class WrapperTest3 {

	public static void main(String[] args) {
		Integer in = Integer.valueOf(27);
		
		byte b = in.byteValue();
		short s = in.shortValue();
		int n = in.intValue();
		long l = in.longValue();
		System.out.println(b + " | " + s + " | " + n + " | " + l);
		
		float f = in.floatValue();
		double d = in.doubleValue();
		System.out.println(f + " | " + d);
	}

}
