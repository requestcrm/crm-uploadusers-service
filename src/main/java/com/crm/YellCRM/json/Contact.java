package com.crm.YellCRM.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Contact {

    @JsonProperty("Account")
    private String account;

    @JsonProperty("Account Address")
    private String accountAddress;

    @JsonProperty("Zip Code")
    private String zipCode;

    @JsonProperty("Account Telephone")
    private String accountTelephone;

    @JsonProperty("Account Email")
    private String accountEmail;

    @JsonProperty("Contact First Name")
    private String contactFirstName;

    @JsonProperty("Contact Last Name")
    private String contactLastName;

    @JsonProperty("Email Address")
    private String emailAddress;

    @JsonProperty("Telephone")
    private String telephone;

    @JsonProperty("Age")
    private String age;

    @JsonProperty("Gender")
    private String gender;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Lead or Customer")
    private String leadSource;

    public String getAccount() {
        return account;
    }

    public Contact setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getAccountAddress() {
        return accountAddress;
    }

    public Contact setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Contact setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getAccountTelephone() {
        return accountTelephone;
    }

    public Contact setAccountTelephone(String accountTelephone) {
        this.accountTelephone = accountTelephone;
        return this;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public Contact setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
        return this;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public Contact setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
        return this;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public Contact setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Contact setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public Contact setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getAge() {
        return age.trim();
    }

    public Contact setAge(String age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Contact setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Contact setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public Contact setLeadSource(String leadSource) {
        this.leadSource = leadSource;
        return this;
    }

    @Override
    public String toString(){
        return "Account="+account+
                "\nAccountAddress="+accountAddress +
                "\nEmailAddress="+emailAddress +
                "\nTitle="+title+
                "\nGender="+gender+
                "\nContact First Name"+contactFirstName;
    }

    public boolean isValidContactData(){
        return notEmpty(account) && notEmpty(accountAddress) && notEmpty(accountEmail) && notEmpty(emailAddress)
                && notEmpty(contactFirstName) && notEmpty(contactLastName) && notEmpty(age) && isNumber(age);
    }

    private boolean notEmpty(String s){
      return s != null && s.trim().length() > 0;
    }

    private boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){}
        return false;
    }
}
