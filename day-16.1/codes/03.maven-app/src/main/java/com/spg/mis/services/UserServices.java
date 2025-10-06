package com.spg.mis.services;

public class UserServices {

	public String getUserNameById(int id) {
		// logic to get the username from Database
		if (id == 101) {
			return "Sanjay";
		} else {
			return null;
		}
	}
}
