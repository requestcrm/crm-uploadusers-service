package com.crm.YellCRM.controller;

import com.crm.YellCRM.database.Contacts;
import com.crm.YellCRM.json.ContactList;
import com.crm.YellCRM.repository.CompanyRepository;
import com.crm.YellCRM.service.CompanyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class YellCRMController {

    @Autowired
    private CompanyImpl insertImpl;

    @Autowired
    private CompanyRepository companyRepository;

    @CrossOrigin
    @RequestMapping(value="/insertRecord",method = RequestMethod.POST)
    public ResponseEntity insertContacts(@RequestBody @Valid final ContactList contactList){
        System.out.println("Entered");
        try{
            insertImpl.insertContacts(contactList);
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        return ResponseEntity.ok("Records updated successfully!!");
    }

    @CrossOrigin
    @RequestMapping( value = "/contacts", method = RequestMethod.GET)
    public Iterable<Contacts> listAllContacts(){
        return companyRepository.findAll();
    }

}
