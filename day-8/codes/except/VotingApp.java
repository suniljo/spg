package com.spg.java.except;

import java.util.Scanner;

public class VotingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String isAnyOneInQueue = "Y";
		
		while(isAnyOneInQueue.equalsIgnoreCase("Y")) {
			System.out.print("enter age of voter: ");
			int voterAge = sc.nextInt();
			
			try {
				if(voterAge >= 18) {
					System.out.println("Voting Done <beep> <beep>");
				}else {
					throw new AgeNotValidException("age should be >= 18");
				}
			}catch(Exception ex) {
				System.err.println(ex.toString());
			}
			System.out.println();
			System.out.print("is anyone else in queue [Y/N] ? ");
			isAnyOneInQueue = sc.next();
		} //while
		sc.close();
	}

}
