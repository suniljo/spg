package com.spg.spring.core;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//-- initialize spring container/ IoC
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println("-".repeat(80));
		
		int noOfBeans = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + noOfBeans);
		System.out.println("-".repeat(80));
		
		System.out.println("============== BEAN NAMES ============\n");
		String[] beanNames = context.getBeanDefinitionNames();
		for(int i=0; i<beanNames.length; i++) {
			System.out.println("-----> " + beanNames[i]);
		}
		System.out.println("-".repeat(80));
		
		Arrays.stream(beanNames).forEach(bn -> System.out.println(bn));
	}

}
