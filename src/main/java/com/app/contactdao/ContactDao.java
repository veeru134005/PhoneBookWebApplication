package com.app.contactdao;

import java.rmi.ServerException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.entity.Contact;

@Repository
public interface ContactDao {

	public String saveConact(Contact contact) throws ServerException;

	public List<Contact> getAllContacts();

	public Contact getContactById(Integer contactId);

	public String updateContact(Contact contact);

	public String deleteConactById(Integer contactId);
}
