package com.spg.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesStreamApp {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
					new Employee(101, "Alice", "HR", 60000),
					new Employee(102, "Bob", "IT", 75000), 
					new Employee(103, "Charlie", "IT", 55000),
					new Employee(104, "David", "Finance", 50000), 
					new Employee(105, "Eva", "HR", 48000),
					new Employee(106, "Frank", "Finance", 67000));
		
		//case-1  Filtering employees with salary > ₹50,000.
		List<Employee> employeesWithSalaryGreater = employees.stream()
																.filter(emp -> emp.getSalary() > 50000)
																.collect(Collectors.toList());
		employeesWithSalaryGreater.forEach(System.out::println);
	}

}
