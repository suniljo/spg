package com.spg.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spg.spring.core.beans.Customer;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer-car-beans.xml");
		
		Customer cust = (Customer)context.getBean("sandeep");
		System.out.println(cust.getCustomerName() + ", owns a \"" + cust.getCar().getModel() + "\" costs Rs." +
				cust.getCar().getCost());
		System.out.println();
		
		Customer cust1 = (Customer)context.getBean("rahul");
		System.out.println(cust1.getCustomerName() + ", owns a \"" + cust1.getCar().getModel() + "\" costs Rs." +
				cust1.getCar().getCost());
	}

}
