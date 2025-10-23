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
	}

}
