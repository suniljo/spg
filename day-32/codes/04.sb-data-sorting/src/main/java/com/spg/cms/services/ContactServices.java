package com.spg.cms.services;

import java.util.List;

import com.spg.cms.entities.Contact;

public interface ContactServices {
	
	public List<Contact> getContactsInContactNameOrder();
	
}
