package com.contact.ContactRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Long> {
    List<Contact> findByfirstNameContainingIgnoreCase(String firstname);
}

