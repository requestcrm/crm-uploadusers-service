package com.crm.YellCRM.database;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CRMCONTACTS")
public class Contacts implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID",unique=true,nullable = false)
    private Integer id;

    @Column(name = "ACCOUNT",nullable = false)
    private String account;

    @Column(name = "ACCOUNT_ADDRESS",nullable = false)
    private String accountAddress;

    @Column(name = "ZIP_CODE",nullable = false)
    private String zipCode;

    @Column(name = "ACCOUNT_TELEPHONE",nullable = false)
    private String accountTelephone;

    @Column(name = "ACCOUNT_EMAIL",nullable = false)
    private String accountEmail;

    @Column(name = "CONTACT_FIRST_NAME",nullable = false)
    private String contactFirstName;

    @Column(name = "CONTACT_LAST_NAME",nullable = false)
    private String contactLastName;

    @Column(name = "EMAIL_ADDRESS",nullable = false)
    private String emailAddress;

    @Column(name = "TELEPHONE",nullable = false)
    private String telephone;

    @Column(name = "AGE",nullable = false)
    private int age;

    @Column(name = "GENDER",nullable = false)
    private String gender;

    @Column(name = "TITLE",nullable = false)
    private String title;

    @Column(name = "LEAD_SOURCE",nullable = false)
    private String leadSource;

    public Integer getId() {
        return id;
    }

    public Contacts setId(Integer id) {
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

    public int getAge() {
        return age;
    }

    public Contacts setAge(int age) {
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
