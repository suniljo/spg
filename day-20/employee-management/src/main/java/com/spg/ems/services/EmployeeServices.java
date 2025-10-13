package com.spg.ems.services;

import com.spg.ems.dto.Employee;

public interface EmployeeServices {
	
	public void saveEmployee(Employee emp);
	
	public Employee getEmployeeById(int eid);
	
	public void updateEmployee(int eid, Employee emp);
	
	public void deleteEmployeeById(int eid);
	
	public void getAllEmployees();
}
