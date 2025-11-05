package com.spg.cms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.spg.cms.entities.Contact;
import com.spg.cms.repositories.ContactRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private ContactRepository contactRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Pageable pageable = Pageable.ofSize(5);
		Page<Contact> page = contactRepo.findAll(pageable);
		List<Contact> contacts = page.getContent();
		*/
		
		/*
		//int pageNo = 0; //first page
		int pageNo = 1; //second page
		int pageSize = 4; // no of records in each page
		
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		Page<Contact> page = contactRepo.findAll(pageRequest);
		List<Contact> contacts = page.getContent();
		*/
		
		int pageSize = 4;
		long noOfPages = contactRepo.count() / pageSize;
		if(contactRepo.count() % pageSize > 0) {
			noOfPages++;
		}
		
		for(int pageNo=0; pageNo<noOfPages; pageNo++) {
			System.out.println(String.format("--------------------- Page %d / %d ---------------------", (pageNo+1), noOfPages));
			
			Page<Contact> page = contactRepo.findAll(PageRequest.of(pageNo, pageSize));
			List<Contact> contacts = page.getContent();
			contacts.forEach(System.out::println);
			
			System.out.println();
		}
		
	}

}
