package com.spg.cms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spg.cms.entities.Contact;
import com.spg.cms.repositories.ContactRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application implements CommandLineRunner {
    private ContactRepository contactRepo;    
    
    //constructor injection
	public Application(ContactRepository contactRepo) {
		this.contactRepo = contactRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Contact contact = null;		
		
		String cname = "Varalakshi";
		Optional<Contact> optContact = contactRepo.findByContactName(cname);
		if(optContact.isPresent()) {
			contact = optContact.get();
			log.info(contact.toString());
		}else {
			log.error("no matching contact for contact Name: {}", cname);
		}		
		System.out.println("-".repeat(100));
		
		
		String cno = "1234567890";
		contact = contactRepo.findByContactNumber(cno);
		if(contact != null)
			System.out.println(contact);
		else
			log.warn("no matching contact for contact Number: {}", cno);
		
		cname = "Bharath";
		optContact = contactRepo.findByContactNameAndContactNumber(cname, "7574968596");
		if(optContact.isPresent()) {
			contact = optContact.get();
			log.info(contact.toString());
		}else {
			log.error("no matching contact for contact Name: {}", cname);
		}		
		System.out.println("-".repeat(100));
		
		
		List<Contact> contacts = contactRepo.findByContactNameOrContactNumber("Soujanya", "6574968596");
		contacts.forEach(System.out::println);
		System.out.println("-".repeat(100));
		
		List<String> contactNames = contactRepo.findAllContactName();
		contactNames.forEach(ctname -> System.out.println(ctname));
		System.out.println("-".repeat(100));
		
		cname = "Ajay";
		optContact = contactRepo.findByCntName(cname);
		if(optContact.isPresent()) {
			contact = optContact.get();
			System.out.println(contact);
		}else {
			log.error("no matching contact for contact Name: {}", cname);
		}
		System.out.println("-".repeat(100));
		
		contacts = contactRepo.findContactsWhereNamesWith("S");
		contacts.forEach(System.out::println);
		System.out.println();		
	}

}
