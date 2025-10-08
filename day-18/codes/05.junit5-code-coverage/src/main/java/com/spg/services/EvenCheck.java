package com.spg.services;

public class EvenCheck {

	public boolean isEven(int num) {
		int rem = num % 2;
		
		if(rem == 0) {
			return true;
		}else {
			return false;
		}
	}
}
