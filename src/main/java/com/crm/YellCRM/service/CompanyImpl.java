package com.crm.YellCRM.service;

import com.crm.YellCRM.database.CrmDatabaseUser;
import com.crm.YellCRM.json.CrmUser;
import com.crm.YellCRM.json.CrmUsers;
import com.crm.YellCRM.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyImpl  {

    @Autowired
    private CompanyRepository companyRepository;

    public void insertCompanyDetails(CrmUsers crmUsers) {
        for (CrmUser user : crmUsers.getCrmUsers()){
            CrmDatabaseUser crmUser=new CrmDatabaseUser();
            crmUser.setFirstName(user.getFirstName());
            crmUser.setLastName(user.getLastName());
            crmUser.setCity(user.getCity());
            crmUser.setEmailId(user.getEmail());
            crmUser.setMobileNo(user.getMobile());
            companyRepository.save(crmUser);
        }
    }
}
