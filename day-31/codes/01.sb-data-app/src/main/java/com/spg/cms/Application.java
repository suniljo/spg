package com.spg.cms;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spg.cms.entities.Contact;
import com.spg.cms.repositories.ContactRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("-".repeat(100));

		/*
		 * ContactRepository is an interface - then how come instance/bean? - uses Proxy
		 * Design Pattern- implementation class is being created internally
		 */
		ContactRepository contactRepo = context.getBean(ContactRepository.class);
		System.out.println("implementation class = " + contactRepo.getClass().getName());
		System.out.println("-".repeat(100));

		/*
		 //--- save a new contact ---- 
		 Contact contact = new Contact();
		 contact.setContactId(101); 
		 contact.setContactName("Vinod");
		 contact.setContactNumber("1234567890");
		 
		 contactRepo.save(contact); 
		 System.out.println("contact saved!!!");
		 */

		// -- save multiple contacts
		Contact ct1 = new Contact(107, "Varalakshi", "8574968596");
		Contact ct2 = new Contact(108, "Abhilash", "9574968596");
		Contact ct3 = new Contact(109, "Jeevan", "6574968596");
		Contact ct4 = new Contact(110, "Sanjana", "7574968596");
		Contact ct5 = new Contact(111, "Sharath", "9874968596");

		List<Contact> contacts = Arrays.asList(ct1, ct2, ct3, ct4, ct5);

		contactRepo.saveAll(contacts);
		
		context.close();
	}

}
