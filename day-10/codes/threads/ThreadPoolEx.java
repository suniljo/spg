package com.spg.java.threads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeDAO.getAllEmployees();
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=0; i<empList.size(); i++) {
			System.out.println("Calculating Salary of Employee-" + empList.get(i).getEmpNo());
			//Thread t = new SalaryCalculation(empList.get(i));
			//t.start();
			Runnable salObj = new SalaryCalculation(empList.get(i));
			executor.submit(salObj);
		}
		System.out.println();
		
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
		executor.shutdown();
	}

}
