package com.app.controller;

import java.rmi.ServerException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.contactservice.ContactService;
import com.app.entity.Contact;

public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping(value = "/savecontact")
	public String saveConact(Contact contact) throws ServerException {
		return contactService.saveConact(contact);
	}

	@GetMapping(value = "/getcontacts")
	public List<Contact> getAllContacts() {

		return contactService.getAllContacts();
	}

	@GetMapping(value = "/fetchcontact/{contactId}")
	public Contact getContactById(@PathVariable Integer contactId) {
		return contactService.getContactById(contactId);
	}

	@PutMapping(value = "/updatecontact")
	public String updateContact(@RequestBody Contact contact) throws ServerException {
		return contactService.updateContact(contact);
	}

	@DeleteMapping(value = "deletecontact/{contactId}")
	public String deleteConactById(@PathVariable Integer contactId) {

		return contactService.deleteConactById(contactId);
	}

}
