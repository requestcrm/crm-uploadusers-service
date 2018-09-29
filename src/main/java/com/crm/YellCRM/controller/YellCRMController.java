package com.crm.YellCRM.controller;

import com.crm.YellCRM.json.CompanyRequestBody;
import com.crm.YellCRM.json.CrmUsers;
import com.crm.YellCRM.service.CompanyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class YellCRMController {

    @Autowired
    private CompanyImpl impl;

    @CrossOrigin
    @RequestMapping(value="/insertRecord",method = RequestMethod.POST)
    public ResponseEntity insertCompanyDetails(@RequestBody @Valid final CrmUsers crmUsers){
        System.out.println("Entered");
        try{
            impl.insertCompanyDetails(crmUsers);
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        return ResponseEntity.ok("Records updated successfully!!");
    }
}
