package com.crm.YellCRM.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Contact {

    @JsonProperty("First Name")
    private String firstName;

    @JsonProperty("Last Name")
    private String lastName;

    @JsonProperty("Email Address")
    private String emailAddress;

    @JsonProperty("Phone Number")
    private String phoneNumber;

    @JsonProperty("Customer Name")
    private String customerName;

    @JsonProperty("Customer Email Address")
    private String customerEmailAddress;

    @JsonProperty("Customer Address")
    private String customerAddress;

    @JsonProperty("Customer Pin Code")
    private String customerPinCode;

    @JsonProperty("Customer Telephone")
    private String customerTelephone;

    @JsonProperty("Custom Field 1 (Car Size)")
    private String customField1;

    @JsonProperty("Custom Field 2 (Car Year)")
    private String customField2;

    @JsonProperty("Custom Field 3 (Car Make)")
    private String customField3;

    @JsonProperty("Custom Field 4 (Car Model)")
    private String customField4;

    public String getFirstName() {
        return firstName;
    }

    public Contact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Contact setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contact setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Contact setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public Contact setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
        return this;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public Contact setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    public String getCustomerPinCode() {
        return customerPinCode;
    }

    public Contact setCustomerPinCode(String customerPinCode) {
        this.customerPinCode = customerPinCode;
        return this;
    }

    public String getCustomerTelephone() {
        return customerTelephone;
    }

    public Contact setCustomerTelephone(String customerTelephone) {
        this.customerTelephone = customerTelephone;
        return this;
    }

    public String getCustomField1() {
        return customField1;
    }

    public Contact setCustomField1(String customField1) {
        this.customField1 = customField1;
        return this;
    }

    public String getCustomField2() {
        return customField2;
    }

    public Contact setCustomField2(String customField2) {
        this.customField2 = customField2;
        return this;
    }

    public String getCustomField3() {
        return customField3;
    }

    public Contact setCustomField3(String customField3) {
        this.customField3 = customField3;
        return this;
    }

    public String getCustomField4() {
        return customField4;
    }

    public Contact setCustomField4(String customField4) {
        this.customField4 = customField4;
        return this;
    }

    @Override
    public String toString(){
        return "customerName="+customerName+
                "\ncustomerAddress="+customerAddress +
                "\nEmailAddress="+emailAddress +
                "\nContact First Name"+firstName;
    }

    public boolean isValidContactData(){
        return notEmpty(customerName) && notEmpty(customerAddress) && notEmpty(emailAddress)&& notEmpty(firstName);
    }

    private boolean notEmpty(String s){
      return s != null && s.trim().length() > 0;
    }

}
