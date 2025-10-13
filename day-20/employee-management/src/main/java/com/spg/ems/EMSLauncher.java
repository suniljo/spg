package com.spg.ems;

import java.util.Scanner;

import com.spg.ems.configs.ServicesFactory;
import com.spg.ems.dto.Employee;
import com.spg.ems.services.EmployeeServices;

public class EMSLauncher {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Employee emp = null;
		int eno=0;
		
		EmployeeServices services = ServicesFactory.getEmployeeServices();
		
		while(true) {
			System.out.println("1. New Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. All Employees");
			System.out.println("6. Exit");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			  case 1:
				emp = generateEmployee();
				services.saveEmployee(emp); 
				break;
			  case 2:
				  System.out.print("search employee with employee no: ");
				  eno = sc.nextInt();
				  emp = services.getEmployeeById(eno);
				  if(emp != null)
					  System.out.println(emp);
				  else
					  System.err.println("no matching employee found for empno: " + eno);
				  break;
			  case 3:
				  System.out.print("update employee with employee no: ");
				  eno = sc.nextInt();
				  sc.nextLine();
				  emp = services.getEmployeeById(eno);
				  if(emp != null) {
					  System.out.println(emp);
					  System.out.print("enter employee's updated name: ");
					  String name = sc.nextLine();
					  System.out.print("enter employee's updated salary: ");
					  float sal = sc.nextFloat();
					  emp = new Employee(eno, name, sal);
					  services.updateEmployee(eno, emp);
				  }
				  else
					  System.err.println("no matching employee found for empno: " + eno);	
				  break;
			  case 4:
				  System.out.print("delete employee with employee no: ");
				  eno = sc.nextInt();
				  emp = services.getEmployeeById(eno);
				  if(emp != null) {
					  System.out.println(emp);
					  System.out.print("\ndo you want to delete the employee? [Y/N]: ");
					  String req = sc.next();
					  if(req.equalsIgnoreCase("Y"))
						  services.deleteEmployeeById(eno);
				  }
				  else
					  System.err.println("no matching employee found for empno: " + eno);	
				  break;
			  case 5:
				 services.getAllEmployees();
				 break;
			  case 6:
				 System.out.println("\t application designed & developed by ");
				 System.out.println("\t     team @ SP Globals");
				 sc.close();
				 System.exit(0);
				 break;
			  default:
				  System.err.println("Invalid Option ... Try Again!!!");
			} //switch
			System.out.println("=".repeat(80)+"\n");
		}//while
	}

	private static Employee generateEmployee() {
		System.out.print("enter employee no: ");
		int eno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter employee name: ");
		String name = sc.nextLine();
		
		System.out.print("enter employee salary: ");
		float sal = sc.nextFloat();
		
		return new Employee(eno, name, sal);
	}

}
