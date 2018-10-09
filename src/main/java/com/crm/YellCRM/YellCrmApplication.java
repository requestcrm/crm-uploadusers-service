package com.crm.YellCRM;

import com.crm.YellCRM.controller.AccountsController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YellCrmApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(YellCrmApplication.class, args);
	}

    @Value("${company}")
    private String company;

	@Autowired
	private AccountsController accountsController;

	@Override
	public void run(String... strings) throws Exception {
        accountsController.insertRecord(company);
	}
}
