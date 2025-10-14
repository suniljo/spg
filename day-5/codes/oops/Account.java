package com.spg.java.oops;

public class Account {
	long acno;
	String name;
	float bal;
	
	public Account(long acno, String name, float bal) {
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	
	public void deposit(float amt) {
		if(amt > 0) {
			this.bal += amt;
			System.out.println(String.format("Rs %.2f Credited | Balance: %.2f", amt, this.bal));
		}
	}
	
	public void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal -= amt;
			System.out.println(String.format("Rs %.2f Debited | Balance: %.2f", amt, this.bal));			
		}else {
			System.err.println("Insufficient Balance!!");
		}
	}
	
	public void getBalance() {
		System.out.println(String.format("A/C No: %-10d | NAME: %-20s | BALANCE: %.2f", this.acno, this.name, this.bal));
	}
}
