package com.spg.app.dao;

public class EmployeeDAO {
	public String findEmployeeNameById(int id) {
		if(id>100)
			return "user name";
		else
			return null;
	}
}
