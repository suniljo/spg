package com.spg.cms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spg.cms.entities.Contact;
import com.spg.cms.repositories.ContactRepository;
import com.spg.cms.services.ContactServices;

@Service
public class ContactServicesImpl implements ContactServices {
	
	private ContactRepository contactRepo;
	
	//Constructor Injection
	@Autowired
	public ContactServicesImpl(ContactRepository contactRepo) {
		super();
		this.contactRepo = contactRepo;
	}
	
	@Override
	public List<Contact> getContactsInContactNameOrder() {
		//-----sorting - approach-1 -- using findByOrderBy ----
		//List<Contact> contactsInOrder = contactRepo.findByOrderByContactName();
		//List<Contact> contactsInOrder = contactRepo.findByOrderByContactNameAsc();
		//List<Contact> contactsInOrder = contactRepo.findByOrderByContactNameDesc();
		//List<Contact> contactsInOrder = contactRepo.findByOrderByContactNameDescContactNumberAsc();
		//List<Contact> contactsInOrder = contactRepo.findByContactIdGreaterThanOrderByContactNameAsc(104);
		
		//-----sorting - approach-2 -- using pre-defined findAll() method of JpaRepository -- sorting by Sort parameter
		//List<Contact> contactsInOrder = contactRepo.findAll(Sort.by("contactName"));
		//List<Contact> contactsInOrder = contactRepo.findAll(Sort.by("contactName").ascending());
		//List<Contact> contactsInOrder = contactRepo.findAll(Sort.by("contactName").descending());
		//List<Contact> contactsInOrder = contactRepo.findAll(Sort.by("contactName", "contactNumber").descending());
		//List<Contact> contactsInOrder = contactRepo.findAll(Sort.by("contactName").descending().and(Sort.by("contactNumber").ascending()));
		List<Contact> contactsInOrder = contactRepo.findByContactIdGreaterThan(105, Sort.by("contactName").ascending());
		return contactsInOrder;
	}


}
