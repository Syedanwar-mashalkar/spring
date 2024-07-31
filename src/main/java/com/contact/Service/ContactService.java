package com.contact.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.ContactRepo.ContactRepo;
import com.contact.entity.Contact;

@Service

public class ContactService {
	@Autowired
	private ContactRepo contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactByName(String firstname) {
        List<Contact>contacts=contactRepository.findAll();
        for(Contact contact:contacts) {
        	if(contact.getFirstName().equalsIgnoreCase(firstname)) {
        		return Optional.of(contact);
        	}
        }
        return Optional.empty();
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Contact updateContact(Long id, Contact contact) {
        if (contactRepository.existsById(id)) {
            contact.setId(id);
            return contactRepository.save(contact);
        }
        return null;
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }

    public List<Contact> searchContacts(String searchTerm) {
        return contactRepository.findByfirstNameContainingIgnoreCase(searchTerm);
    }
}
