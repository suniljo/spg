package com.spg.boot;
import com.spg.boot.beans.configs.AppConfig;
import com.spg.boot.utils.SecurityUtility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spg.boot.beans.Car;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("-".repeat(100));
		
		int noOfBeans = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + noOfBeans);
		System.out.println("-".repeat(100));
		
		//-- get the Car type bean from IoC/ spring container
		//Car carRef = context.getBean(Car.class);
		//Car carRef = (Car)context.getBean("car");
		//Car carRef = context.getBean("car", Car.class);
		Car carRef = (Car)context.getBean("mycar");
		
		carRef.startJourney();
		System.out.println();
		
		//SecurityUtility secUtil = context.getBean(SecurityUtility.class);
		//SecurityUtility secUtil = (SecurityUtility) context.getBean("generateSecurityUtility");
		//SecurityUtility secUtil = (SecurityUtility) context.getBean("security");
		SecurityUtility secUtil = (SecurityUtility) context.getBean("encoder");
		String data = "S&P Globals";
		String encodedData = secUtil.encodeData(data);
		System.out.println(encodedData);
		
		System.out.println();
		SecurityUtility secUtil1 = (SecurityUtility) context.getBean("security");
	}
}
