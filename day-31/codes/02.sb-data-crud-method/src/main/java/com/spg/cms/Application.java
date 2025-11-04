package com.spg.cms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spg.cms.entities.Contact;
import com.spg.cms.repositories.ContactRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private ContactRepository contactRepo;    
    
    //constructor injection
	public Application(ContactRepository contactRepo) {
		System.out.println("constructor executes");
		this.contactRepo = contactRepo;
	}

	public static void main(String[] args) {
		System.out.println("main method starts");
		SpringApplication.run(Application.class, args);
		System.out.println("main method ends");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunner - run() method");	
		System.out.println("-".repeat(100));
		
		//--- find the number of contacts
		long noOfContacts = contactRepo.count();
		System.out.println("no of contacts = " + noOfContacts);
		System.out.println("-".repeat(100));
		
		//-- check whether a contact is existing with a specific id
		int cid = 101;
		boolean isExists = contactRepo.existsById(cid);
		System.out.println("is a contact with ID:" + cid + " exists = " + isExists);
		System.out.println("-".repeat(100));
		
		//-- get a Contact based on contactId( ID property value)
		Optional<Contact> optContact = contactRepo.findById(cid);
		if(optContact.isPresent()) {
			Contact ct = optContact.get();
			System.out.println(ct);
		}else {
			System.err.println("no contact with ID: " + cid +" exists!!");
		}
		System.out.println("-".repeat(100));
		
		//--- get Contacts based on multiple contactIds
		List<Integer> contactIds = Arrays.asList(101, 202, 605, 103, 105, 107);		
		Iterable<Contact> contacts = contactRepo.findAllById(contactIds);
		printContacts(contacts);		
		System.out.println("-".repeat(100));
		
		//--- get all contacts
		Iterable<Contact> listContacts = contactRepo.findAll();
		printContacts(listContacts);		
		System.out.println("-".repeat(100));
		
		//--delete a contact by id
		contactRepo.deleteById(106);
		System.out.println("-".repeat(100));
	}

	private void printContacts(Iterable<Contact> contacts) {
		contacts.forEach(ct -> { 
			System.out.println(ct);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {	e.printStackTrace(); 	}
		});
		
	}

}
