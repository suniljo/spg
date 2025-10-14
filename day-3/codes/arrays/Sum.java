package com.spg.java.arrays;

public class Sum {

	public static void main(String[] args) {
		if(args.length >= 2) {
			//System.out.println(args[0]+args[1]);
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int s = x + y;
			System.out.printf("%d + %d = %d\n", x, y, s);
		}else {
			System.err.println("Insufficient Inputs");
		}
		
		String str = "A";
		int x = Integer.parseInt(str); //java.lang.NumberFormatException
	}

}
