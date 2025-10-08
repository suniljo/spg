package com.spg.app.services.impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.spg.app.dao.EmployeeDAO;

class EmployeeServicesImplTest {

	@Test
	void testGetEmployeeNameById() {
		EmployeeServicesImpl empServicesObj = new EmployeeServicesImpl();
		
		//create a mock object for EmployeeDAO
		EmployeeDAO empDaoMockObj = Mockito.mock(EmployeeDAO.class);
		
		//provide the mock object to the service component
		empServicesObj.setDao(empDaoMockObj);

		//setting the behavior for mock object
		Mockito.when(empDaoMockObj.findEmployeeNameById(101)).thenReturn("Sanjay");
		Mockito.when(empDaoMockObj.findEmployeeNameById(100)).thenReturn(null);
		
		int eid = 101;
		String ename = empServicesObj.getEmployeeNameById(eid);
		assertNotNull(ename);
		
		eid = 100;
		ename = empServicesObj.getEmployeeNameById(eid);
		assertNull(ename);
	}

}
