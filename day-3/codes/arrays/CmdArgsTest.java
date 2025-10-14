package com.spg.java.arrays;

public class CmdArgsTest {

	public static void main(String[] args) {
		System.out.println("no of cmd args = " + args.length);
		
		System.out.println("command-line arguments are:");
		for(String arg : args) {
			System.out.println("----> " + arg);
		}
	}

}
