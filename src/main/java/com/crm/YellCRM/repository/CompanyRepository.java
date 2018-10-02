package com.crm.YellCRM.repository;

import com.crm.YellCRM.database.Contacts;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Contacts, Integer> {
}
