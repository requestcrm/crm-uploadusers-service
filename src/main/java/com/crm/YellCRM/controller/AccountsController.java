package com.crm.YellCRM.controller;

import com.crm.YellCRM.database.Accounts;
import com.crm.YellCRM.database.Contacts;
import com.crm.YellCRM.repository.AccountsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class AccountsController {

    private static final Logger LOGGER =  LoggerFactory.getLogger(AccountsController.class);

    private AccountsRepository accountsRepository;

    @Autowired
    public AccountsController(AccountsRepository accountsRepository){
        this.accountsRepository = accountsRepository;
    }

    //This is to get company from UJ-1 and insert in to accounts table which can be used by UJ-2
    @RequestMapping(value = "/{company}", method = RequestMethod.GET)
    public ResponseEntity getResult(@PathVariable("company") String company){
        LOGGER.info("Entry in to GET Controller - for inserting in to Accounts ");
        try {
            Accounts acc = new Accounts();
            acc.setId(UUID.randomUUID().toString());
            acc.setName(company);
            acc.setBillingAddressPostcode("OX5 1GB");
            acc.setAssignedUserId("1");
            accountsRepository.save(acc);
        }
        catch(Exception ex){
            LOGGER.error("Failed to insert the company in to accounts for: " + company , ex);
            return new ResponseEntity(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok("Record Inserted in to accounts: " + company);    }


    public void insertRecord(String company) {
        LOGGER.info("Entry in to Accounts Controller - for inserting in to Accounts ");
        try {
            Accounts acc = new Accounts();
            acc.setId(UUID.randomUUID().toString());
            acc.setName(company);
            acc.setBillingAddressPostcode("OX5 1GB");
            acc.setAssignedUserId("1");
            accountsRepository.save(acc);
        } catch (Exception ex) {
            LOGGER.error("Failed to insert the company in to accounts for: " + company, ex);
        }
    }

    @CrossOrigin
    @RequestMapping( value = "/crm/accounts", method = RequestMethod.GET)
    public List<Accounts> listAllAccounts(){
        return accountsRepository.findAll();
    }

    @CrossOrigin
    @RequestMapping( value = "/ping", method = RequestMethod.GET)
    public String ping(){
        return "service is running ..";
    }

}
