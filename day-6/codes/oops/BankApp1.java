package com.spg.java.oops;

import java.util.Scanner;

public class BankApp1 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Account acc = null;
		float amt;

		while (true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Interest Calculation");
			System.out.println("6. Service Charge");
			System.out.println("7. Exit");

			System.out.print("\nenter an option: ");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				if (acc == null) {
					System.out.print("enter type of a/c [1.Savings | 2.Current]:  ");
					int accType = sc.nextInt();
					if(accType <=0 || accType > 2) {
						System.err.println("Wrong A/C Type.. Try Again");
						break;
					}
					System.out.print("enter a/c no: ");
					long acno = sc.nextLong();
					sc.nextLine();

					System.out.print("enter name: ");
					String name = sc.nextLine();

					System.out.print("enter initial deposit: ");
					amt = sc.nextFloat();
					
					//create an instance of Account
					if(accType == 1) {
						System.out.print("enter ROI: ");
						float roi = sc.nextFloat();
						acc = new SavingsAccount(acno, name, amt, roi);
					}else if(accType == 2) {
						acc = new CurrentAccount(acno, name, amt);
					}
					System.out.println("Welcome to State Bank of India");
				} else {
					System.err.println("A/C is already with Us!!!!");
				}
				break;
			case 2:
				if(acc != null) {
					System.out.print("enter an amount to deposit: ");
					amt = sc.nextFloat();
					acc.deposit(amt);
				}else {
					System.err.println("###--- Please open an A/C with us!! ---###");
				}
				break;
			case 3:
				if(acc != null) {
					System.out.print("enter an amount to withdraw: ");
					amt = sc.nextFloat();
					acc.withdraw(amt);
				}else {
					System.err.println("###--- Please open an A/C with us!! ---###");
				}				
				break;
			case 4:
				if(acc != null) {
					acc.getBalance();
				}else {
					System.err.println("###--- Please open an A/C with us!! ---###");
				}				
				break;
			case 5:
				if(acc instanceof SavingsAccount)
					((SavingsAccount)acc).calculateInterest();
				else
					System.err.println("Interest Calculation is not available for this type of A/C: " + acc.getClass().getSimpleName());
				break;
			case 6:
				if(acc instanceof CurrentAccount)
					((CurrentAccount)acc).serviceCharge();
				else
					System.err.println("Service Charges are not applicable for this type of A/C: " + acc.getClass().getSimpleName());				
				break;
			case 7:
				System.out.println("Application Designed & Developed by ");
				System.out.println("\t team@S&P GLOBAL");
				System.exit(0);
				break;
			default:
				System.err.println("@@@--- INVALID OPERATION --- TRY AGAIN ---@@@");
				break;				
			} // switch
			System.out.println("-".repeat(60) + "\n");
		} // while

	} // main

} // class
