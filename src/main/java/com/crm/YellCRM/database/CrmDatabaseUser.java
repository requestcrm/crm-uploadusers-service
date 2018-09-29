package com.crm.YellCRM.database;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CRMUSERS")
public class CrmDatabaseUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID",unique=true,nullable = false)
    private Integer id;

    @Column(name = "FIRSTNAME",nullable = false)
    private String firstName;

    @Column(name = "LASTNAME",nullable = false)
    private String lastName;


    @Column(name = "CITY",nullable = false)
    private String city;


    @Column(name = "EMAILADDRESS",nullable = false)
    private String emailId;


    @Column(name = "PHONENUMBER",nullable = false)
    private String mobileNo;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
