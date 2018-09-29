package com.crm.YellCRM.repository;

import com.crm.YellCRM.database.CrmDatabaseUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<CrmDatabaseUser, Integer> {


}
