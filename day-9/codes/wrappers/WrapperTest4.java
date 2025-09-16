package com.spg.java.wrappers;

public class WrapperTest4 {

	public static void main(String[] args) {
		byte b = Byte.parseByte("127");
		short s = Short.parseShort("128");
		
		float f = Float.parseFloat("25.78");
		
		System.out.println(b + " | " + s + " | " + f);
				
	}

}
