package com.spg.app.servces;

import com.spg.app.dao.EmployeeDAO;

public class EmployeeServices {
	private EmployeeDAO dao;
	
	public String getEmployeeNameById(int id) {
		dao = new EmployeeDAO();
		String ename = dao.findEmployeeNameById(id);
		return ename;
	}
}
