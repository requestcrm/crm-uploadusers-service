package com.crm.YellCRM.service;

import com.crm.YellCRM.database.Contacts;
import com.crm.YellCRM.json.Contact;
import com.crm.YellCRM.json.ContactList;
import com.crm.YellCRM.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.Integer.parseInt;

@Service
public class CompanyImpl  {

    @Autowired
    private CompanyRepository companyRepository;



    public void insertContacts(ContactList contactList) {
        for (Contact contact : contactList.getContactList()){
            if(contact.isValidContactData()) {
                Contacts contacts = new Contacts();
                System.out.println("contact:" + contact);
                contacts.setAccount(contact.getAccount());
                contacts.setAccountAddress(contact.getAccountAddress());
                contacts.setZipCode(contact.getZipCode());
                contacts.setAccountTelephone(contact.getAccountTelephone());
                contacts.setAccountEmail(contact.getAccountEmail());
                contacts.setContactFirstName(contact.getContactFirstName());
                contacts.setContactLastName(contact.getContactLastName());
                contacts.setEmailAddress(contact.getEmailAddress());
                contacts.setTelephone(contact.getTelephone());
                contacts.setAge(parseInt(contact.getAge()));
                contacts.setGender(contact.getGender());
                contacts.setTitle(contact.getTitle());
                contacts.setLeadSource(contact.getLeadSource());
                companyRepository.save(contacts);
            }
        }
    }
}
