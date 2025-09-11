package com.spg.java.oops;

public class SavingsAccount extends Account {
	float roi;

	public SavingsAccount(long acno, String name, float bal, float roi) {
		super(acno, name, bal);
		this.roi = roi;
	}
	
	public void calculateInterest() {
		float intrst = this.bal * this.roi /100;
		super.deposit(intrst);
	}
}
