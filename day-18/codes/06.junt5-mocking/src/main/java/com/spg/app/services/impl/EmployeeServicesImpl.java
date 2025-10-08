package com.spg.app.services.impl;

import com.spg.app.dao.EmployeeDAO;
import com.spg.app.services.EmployeeServices;

public class EmployeeServicesImpl implements EmployeeServices {
	private EmployeeDAO dao;
	
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String getEmployeeNameById(int eid) {
		String ename = dao.findEmployeeNameById(eid);
		return ename;
	}

}
