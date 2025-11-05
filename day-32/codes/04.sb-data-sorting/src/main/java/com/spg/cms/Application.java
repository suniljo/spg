package com.spg.cms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spg.cms.entities.Contact;
import com.spg.cms.services.ContactServices;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private ContactServices contactServices;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Contact> contacts = contactServices.getContactsInContactNameOrder();
		contacts.forEach(System.out::println);
	}

}
