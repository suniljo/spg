package com.spg;

import java.util.Scanner;

import com.spg.mis.services.OddOrEven;
import com.spg.mis.services.UserServices;

public class SPGApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. User Service");
		System.out.println("2. Number Service");
		System.out.println("3. Exit");

		System.out.print("\nenter an option: ");
		int opt = sc.nextInt();

		switch (opt) {
		 case 1:
			UserServices service = new UserServices();
			System.out.print("enter user id: ");
			int id = sc.nextInt();
			String name = service.getUserNameById(id);
			if (name != null)
				System.out.println("Hi \"" + name + "\" welcome to S & P Global");
			else
				System.out.println("no user find with id: " + id);
			break;
		 case 2:
			OddOrEven ser = new OddOrEven();
			System.out.print("enter a number: ");
			int num = sc.nextInt();
			if (ser.isEven(num))
				System.out.println(num + " is EVEN");
			else
				System.out.println(num + " is ODD");
			break;
		case 3:
			System.out.println("Application designed & developed by ");
			System.out.println("\t team @ S&P Global");
			sc.close();
			return;
		default:
			System.out.println("Invalid Option --- Try Again");
		}
		sc.close();
	}
}
