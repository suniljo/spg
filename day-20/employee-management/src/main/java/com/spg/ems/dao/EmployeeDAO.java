package com.spg.ems.dao;

import java.util.List;

import com.spg.ems.dto.Employee;

public interface EmployeeDAO {
	
	public Integer saveEmployee(Employee emp);
	
	public Employee findEmployeeById(int eid);
	
	public Integer updateEmployee(int eid, Employee emp);
	
	public Integer deleteEmployeeById(int eid);
	
	public List<Employee> findAll();
}
