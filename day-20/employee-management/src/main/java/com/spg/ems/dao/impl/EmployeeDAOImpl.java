package com.spg.ems.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.spg.ems.configs.ConnectionFactory;
import com.spg.ems.dao.EmployeeDAO;
import com.spg.ems.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private Statement st = null;
		
	public EmployeeDAOImpl() throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		st = con.createStatement();
	}

	@Override
	public Integer saveEmployee(Employee emp) {
		String sql = "insert into emp (empno, ename, sal) values (" + emp.getEmployeeNo()
						+ ",'" + emp.getEmployeeName()+"',"
						+  emp.getEmployeeSal() + ")";
		try {
			int rowsAffected = st.executeUpdate(sql);
			return rowsAffected;
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
			return null;
		}		
	}

	@Override
	public Employee findEmployeeById(int eid) {
		Employee emp = null;
		
		String sql = "select ename, sal from emp where empno="+eid;
		try {
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				String name = rs.getString(1);
				float sal = rs.getFloat(2);
				emp = new Employee(eid, name, sal);
			}
		}catch(Exception ex) {}
		
		return emp;
	}

	@Override
	public Integer updateEmployee(int eid, Employee emp) {
		String sql = "update emp set ename='" + emp.getEmployeeName() + "', sal="+emp.getEmployeeSal() +" where "+
						"empno = " + eid;
		try {
			int rowsAffected = st.executeUpdate(sql);
			return rowsAffected;
		}catch(Exception ex) {}
		
		return null;
	}

	@Override
	public Integer deleteEmployeeById(int eid) {
		String sql = "delete from emp where empno=" + eid;
		try {
		  int rowsAffected = st.executeUpdate(sql);
		  return rowsAffected;
		} catch(Exception ex) {}
		
		return null;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> emps = new ArrayList<Employee>();
		
		String sql = "select * from emp";
		try {
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int empno = rs.getInt(1);
				String name = rs.getString(2);
				float sal = rs.getFloat(3);
				
				Employee emp = new Employee(empno, name, sal);
				emps.add(emp);
			}
		}catch(Exception ex) {}
		
		return emps;
	}

}
