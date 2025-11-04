package com.spg.cms.repositories;

import org.springframework.data.repository.CrudRepository;
import com.spg.cms.entities.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
