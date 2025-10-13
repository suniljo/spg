package com.spg.ems.services.impl;

import java.util.List;

import com.spg.ems.dao.EmployeeDAO;
import com.spg.ems.dao.impl.EmployeeDAOImpl;
import com.spg.ems.dto.Employee;
import com.spg.ems.services.EmployeeServices;

public class EmployeeServicesImpl implements EmployeeServices {
	private EmployeeDAO dao = null;
		
	public EmployeeServicesImpl() throws Exception {
		super();
		dao = new EmployeeDAOImpl();
	}

	@Override
	public void saveEmployee(Employee emp) {
		Integer rowsAffected = dao.saveEmployee(emp);
		if(rowsAffected != null)
			System.out.println("Employee Saved");
	}

	@Override
	public Employee getEmployeeById(int eid) {
		return dao.findEmployeeById(eid);
	}

	@Override
	public void updateEmployee(int eid, Employee emp) {
		Integer rowsAffected = dao.updateEmployee(eid, emp);
		if(rowsAffected != null)
			System.out.println("Employee Updated");
		else
			System.out.println("No matching employee to update");
	}

	@Override
	public void deleteEmployeeById(int eid) {
		Integer rowsAffected = dao.deleteEmployeeById(eid);
		if(rowsAffected != null)
			System.out.println("Employee Deleted");
		else
			System.out.println("No matching employee to delete");
	}

	@Override
	public void getAllEmployees() {
		List<Employee> employees = dao.findAll();
		employees.stream().forEach(emp -> { 
				System.out.println(emp);
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {}		
		});
	}

}
