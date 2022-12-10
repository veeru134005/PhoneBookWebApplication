package com.app.contactserviceimpl;

import java.rmi.ServerException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.contactdao.ContactDao;
import com.app.contactservice.ContactService;
import com.app.contactutils.ContactUtiils;
import com.app.entity.Contact;

public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDao contactDao;

	@Override
	public String saveConact(Contact contact) throws ServerException {

		ContactUtiils.validateContactForm(contact);

		return contactDao.saveConact(contact);
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return contactDao.getAllContacts();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		return contactDao.getContactById(contactId);
	}

	@Override
	public String updateContact(Contact contact) throws ServerException {

		ContactUtiils.validateContactForm(contact);

		return contactDao.updateContact(contact);
	}

	@Override
	public String deleteConactById(Integer contactId) {
		return contactDao.deleteConactById(contactId);
	}

}
