package com.spg.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spg.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		//-- initialize spring container/ IoC
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println("=".repeat(80));
		
		User usr1 = (User) context.getBean("user2");
		System.out.println(usr1);
		System.out.println("-".repeat(80));
		
		User usr2 = context.getBean("user1", User.class);
		System.out.println(usr2);
		System.out.println("-".repeat(80));
		
		User usr3 = (User) context.getBean("user1");
		System.out.println(usr3);
		System.out.println("-".repeat(80));	
		
		User usr4 = (User) context.getBean("user1");
		System.out.println(usr4);
		System.out.println("-".repeat(80));	
		
		System.out.println(usr2.hashCode() + " | " + usr3.hashCode() + " | " + usr4.hashCode());
	}

}
