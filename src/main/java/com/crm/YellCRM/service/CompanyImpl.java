package com.crm.YellCRM.service;

import com.crm.YellCRM.database.Contacts;
import com.crm.YellCRM.json.Contact;
import com.crm.YellCRM.json.ContactList;
import com.crm.YellCRM.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CompanyImpl  {

    @Autowired
    private CompanyRepository companyRepository;

    public void insertContacts(ContactList contactList) {
        for (Contact contact : contactList.getContactList()){
            if(contact.isValidContactData()) {
                Contacts contacts = new Contacts();
                System.out.println("contact:" + contact);
                contacts.setId(UUID.randomUUID().toString());
                contacts.setCustomerName(contact.getCustomerName());
                contacts.setCustomerAddress(contact.getCustomerAddress());
                contacts.setCustomerPinCode(contact.getCustomerPinCode());
                contacts.setCustomerTelephone(contact.getCustomerTelephone());
                contacts.setCustomerEmailAddress(contact.getCustomerEmailAddress());
                contacts.setFirstName(contact.getFirstName());
                contacts.setLastName(contact.getLastName());
                contacts.setEmailAddress(contact.getEmailAddress());
                contacts.setPhoneNumber(contact.getPhoneNumber());
                contacts.setCustomField1((contact.getCustomField1()));
                contacts.setCustomField2(contact.getCustomField2());
                contacts.setCustomField3(contact.getCustomField3());
                contacts.setCustomField4(contact.getCustomField4());
                companyRepository.save(contacts);
            }
        }
    }
}
