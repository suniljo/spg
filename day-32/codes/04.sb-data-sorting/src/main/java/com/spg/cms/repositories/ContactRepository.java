package com.spg.cms.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spg.cms.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

	List<Contact> findByOrderByContactName();

	List<Contact> findByOrderByContactNameAsc();

	List<Contact> findByOrderByContactNameDesc();

	List<Contact> findByOrderByContactNameDescContactNumberAsc();

	List<Contact> findByContactIdGreaterThanOrderByContactNameAsc(int i);

	List<Contact> findByContactIdGreaterThan(int i, Sort ascending);

}
