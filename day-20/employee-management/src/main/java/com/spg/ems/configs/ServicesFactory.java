package com.spg.ems.configs;

import com.spg.ems.services.EmployeeServices;
import com.spg.ems.services.impl.EmployeeServicesImpl;

public class ServicesFactory {
	
	private static EmployeeServices empServices;
	
	public static EmployeeServices getEmployeeServices() {		
		if(empServices == null) {
			try {
				empServices = new EmployeeServicesImpl();
			} catch(Exception ex) {}
		}
		return empServices;
	}
}
