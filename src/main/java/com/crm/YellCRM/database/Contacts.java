package com.crm.YellCRM.database;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CONTACTS")
public class Contacts implements Serializable {

    @Id
    @Column(name = "ID",unique=true,nullable = false)
    private String id;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "salutation",nullable = false)
    private String emailAddress;

    @Column(name = "phone_mobile",nullable = false)
    private String phoneNumber;

    @Column(name = "assigned_user_id",nullable = false)
    private String customerName;

    @Column(name = "department",nullable = false)
    private String customerEmailAddress;

    @Column(name = "primary_address_city",nullable = false)
    private String customerAddress;

    @Column(name = "primary_address_postalcode",nullable = false)
    private String customerPinCode;

    @Column(name = "phone_work",nullable = false)
    private String customerTelephone;

    @Column(name = "assistant",nullable = false)
    private String customField1;

    @Column(name = "description",nullable = false)
    private String customField2;

    @Column(name = "title",nullable = false)
    private String customField3;

    @Column(name = "lead_source",nullable = false)
    private String customField4;

    public String getId() {
        return id;
    }

    public Contacts setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Contacts setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Contacts setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Contacts setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contacts setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Contacts setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public Contacts setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
        return this;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public Contacts setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    public String getCustomerPinCode() {
        return customerPinCode;
    }

    public Contacts setCustomerPinCode(String customerPinCode) {
        this.customerPinCode = customerPinCode;
        return this;
    }

    public String getCustomerTelephone() {
        return customerTelephone;
    }

    public Contacts setCustomerTelephone(String customerTelephone) {
        this.customerTelephone = customerTelephone;
        return this;
    }

    public String getCustomField1() {
        return customField1;
    }

    public Contacts setCustomField1(String customField1) {
        this.customField1 = customField1;
        return this;
    }

    public String getCustomField2() {
        return customField2;
    }

    public Contacts setCustomField2(String customField2) {
        this.customField2 = customField2;
        return this;
    }

    public String getCustomField3() {
        return customField3;
    }

    public Contacts setCustomField3(String customField3) {
        this.customField3 = customField3;
        return this;
    }

    public String getCustomField4() {
        return customField4;
    }

    public Contacts setCustomField4(String customField4) {
        this.customField4 = customField4;
        return this;
    }
}
