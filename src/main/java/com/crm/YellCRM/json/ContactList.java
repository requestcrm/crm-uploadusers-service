package com.crm.YellCRM.json;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonSerialize
public class ContactList {

    @JsonProperty("ContactList")
    private List<Contact> contactList;

    public List<Contact> getContactList() {
        return contactList;
    }

    public ContactList setContactList(List<Contact> contactList) {
        this.contactList = contactList;
        return this;
    }
}
