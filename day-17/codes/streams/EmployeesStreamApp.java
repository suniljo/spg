package com.spg.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
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
		System.out.println("-".repeat(100));
		
		//case-2 Group employees by department
		Map<String, List<Employee>> deptEmps = employees.stream()
													    .collect(Collectors.groupingBy(Employee::getDepartment));
		//System.out.println(deptEmps);
		Set<String> deptNames = deptEmps.keySet();
		for(String deptName : deptNames) {
			System.out.println("----- EMPLOYEES OF DEPARTMENT: " + deptName.toUpperCase() + " -----\n");
			List<Employee> empsOfDept = deptEmps.get(deptName);
			empsOfDept.stream()
					  .forEach(emp -> System.out.println(emp));
			System.out.println();
		}
		
		System.out.println("-".repeat(100));
		
		//Case 3 Average salary by department
		Map<String, Double> deptAvgSalary = employees.stream()
													 .collect(Collectors.groupingBy(Employee::getDepartment, 
															  Collectors.averagingDouble(Employee::getSalary)));
		//System.out.println(deptAvgSalary);
		System.out.println("============ DEPARTMENT-WISE AVERAGE SALARY ============");
		Set<Map.Entry<String, Double>> avgSalSet = deptAvgSalary.entrySet();
		Iterator<Map.Entry<String, Double>> it = avgSalSet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Double> entry = it.next();
			String deptName = entry.getKey();
			double avgSal = entry.getValue();
			System.out.println(String.format("%-10s :: %.2f", deptName, avgSal));
		}
		System.out.println("-".repeat(100));
		
		//Case 4 Sort employees by salary in descending order
		List<Employee> empInDescOrder = employees.stream()
												 .sorted((emp1, emp2) -> emp1.getSalary() > emp2.getSalary() ? -1 : 1)												 
												 .collect(Collectors.toList());
		/*
		List<Employee> sortedBySalary = employees.stream()
			    .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
			    .collect(Collectors.toList());
		 */
		System.out.println("======= EMPLOYEE IN DESCENDING ORDER OF SALARY =======");
		empInDescOrder.forEach(System.out::println);
		System.out.println("-".repeat(100));
		
		//Case 5 Find the highest paid employee
		Optional<Employee> optHighestPaid = employees.stream()
													 .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
					  								 .findFirst();
		if(optHighestPaid.isPresent()) {
			Employee emp = optHighestPaid.get();
			System.out.println(emp);
		}
		System.out.println();
		
		Optional<Employee> highestPaid = employees.stream()
			    								  .max(Comparator.comparingDouble(Employee::getSalary));
		if(highestPaid.isPresent()) {
			Employee emp = highestPaid.get();
			System.out.println(emp);
		}
	} //main
} //class
