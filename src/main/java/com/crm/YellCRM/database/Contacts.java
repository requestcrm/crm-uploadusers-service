package com.crm.YellCRM.database;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CONTACTS")
public class Contacts implements Serializable {

    @Id
    @Column(name = "ID",unique=true,nullable = false)
    private String id;

    @Column(name = "assigned_user_id",nullable = false)
    private String account;

    @Column(name = "primary_address_city",nullable = false)
    private String accountAddress;

    @Column(name = "primary_address_postalcode",nullable = false)
    private String zipCode;

    @Column(name = "phone_work",nullable = false)
    private String accountTelephone;

    @Column(name = "department",nullable = false)
    private String accountEmail;

    @Column(name = "first_name",nullable = false)
    private String contactFirstName;

    @Column(name = "last_name",nullable = false)
    private String contactLastName;

    @Column(name = "salutation",nullable = false)
    private String emailAddress;

    @Column(name = "phone_mobile",nullable = false)
    private String telephone;

    @Column(name = "assistant",nullable = false)
    private String age;

    @Column(name = "description",nullable = false)
    private String gender;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "lead_source",nullable = false)
    private String leadSource;

    public String getId() {
        return id;
    }

    public Contacts setId(String id) {
        this.id = id;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public Contacts setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getAccountAddress() {
        return accountAddress;
    }

    public Contacts setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Contacts setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getAccountTelephone() {
        return accountTelephone;
    }

    public Contacts setAccountTelephone(String accountTelephone) {
        this.accountTelephone = accountTelephone;
        return this;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public Contacts setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
        return this;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public Contacts setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
        return this;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public Contacts setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Contacts setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public Contacts setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Contacts setAge(String age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Contacts setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Contacts setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public Contacts setLeadSource(String leadSource) {
        this.leadSource = leadSource;
        return this;
    }
}
