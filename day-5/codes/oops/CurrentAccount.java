package com.spg.java.oops;

public class CurrentAccount extends Account {
	int noOfTransactions;
	final int allowedTransactions = 3;
	
	public CurrentAccount(long acno, String name, float bal) {
		super(acno, name, bal);
	}
	
	
	@Override
	public void deposit(float amt) {
		this.noOfTransactions++;
		super.deposit(amt);
	}


	@Override
	public void withdraw(float amt) {
		this.noOfTransactions++;
		super.withdraw(amt);
	}


	@Override
	public void getBalance() {
		this.noOfTransactions++;
		super.getBalance();
	}


	public void serviceCharge() {
		if(noOfTransactions > allowedTransactions) {
			int additionalTrans = noOfTransactions - allowedTransactions;
			int serviceAmount = additionalTrans * 100;
			System.out.println("Service Charge = " + serviceAmount);
			super.withdraw(serviceAmount);
			noOfTransactions = 0;
		}else {
			System.out.println("No Service Charge now, as only " + noOfTransactions + " are completed");
		}
	}
	
	
}
