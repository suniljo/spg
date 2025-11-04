package com.spg.cms.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spg.cms.entities.Contact;

@Repository //--optional
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
