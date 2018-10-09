package com.crm.YellCRM.database;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "accounts")
public class Accounts {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name="billing_address_postcode")
    private String billingAddressPostcode;

    @Column(name="date_entered")
    private LocalDateTime datEntered;

    @Column(name="date_modified")
    private LocalDateTime dateModified;

    @Column(name="modified_user_id")
    private String modifiedUserId;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="description")
    private String description;

    @Column(name="deleted")
    private int deleted;

    @Column(name="assigned_user_id")
    private String assignedUserId;

    @Column(name="account_type")
    private String accountType;

    @Column(name="industry")
    private String industry;

    @Column(name="annual_revenue")
    private String annualRevenue;

    @Column(name="phone_fax")
    private String phoneFax;

    @Column(name="billing_address_street")
    private String billingAddressStreet;

    @Column(name="billing_address_city")
    private String billingAddressCity;

    @Column(name="billing_address_state")
    private String billingAddressState;

    @Column(name="billing_address_postalcode")
    private String billingAddressPostalcode;

    @Column(name="billing_address_country")
    private String billingAddressCountry;

    @Column(name="rating")
    private String rating;

    @Column(name="phone_office")
    private String phoneOffice;

    @Column(name="phone_alternate")
    private String phoneAlternate;

    @Column(name="website")
    private String website;

    @Column(name="ownership")
    private String ownership;

    @Column(name="employees")
    private String employees;

    @Column(name="ticker_symbol")
    private String tickerSymbol;

    @Column(name="shipping_address_street")
    private String shippingAddressStreet;

    @Column(name="shipping_address_city")
    private String shippingAddressCity;

    @Column(name="shipping_address_state")
    private String shippingAddressState;

    @Column(name="shipping_address_postalcode")
    private String shippingAddressPostalcode;

    @Column(name="shipping_address_country")
    private String shippingAddressCountry;

    @Column(name="parent_id")
    private String parentId;

    @Column(name="sic_code")
    private String sicCode;

    @Column(name="campaign_id")
    private String campaignId;

    public LocalDateTime getDatEntered() {
        return datEntered;
    }

    public void setDatEntered(LocalDateTime datEntered) {
        this.datEntered = datEntered;
    }

    public LocalDateTime getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }

    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public String getAssignedUserId() {
        return assignedUserId;
    }

    public void setAssignedUserId(String assignedUserId) {
        this.assignedUserId = assignedUserId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getPhoneFax() {
        return phoneFax;
    }

    public void setPhoneFax(String phoneFax) {
        this.phoneFax = phoneFax;
    }

    public String getBillingAddressStreet() {
        return billingAddressStreet;
    }

    public void setBillingAddressStreet(String billingAddressStreet) {
        this.billingAddressStreet = billingAddressStreet;
    }

    public String getBillingAddressCity() {
        return billingAddressCity;
    }

    public void setBillingAddressCity(String billingAddressCity) {
        this.billingAddressCity = billingAddressCity;
    }

    public String getBillingAddressState() {
        return billingAddressState;
    }

    public void setBillingAddressState(String billingAddressState) {
        this.billingAddressState = billingAddressState;
    }

    public String getBillingAddressPostalcode() {
        return billingAddressPostalcode;
    }

    public void setBillingAddressPostalcode(String billingAddressPostalcode) {
        this.billingAddressPostalcode = billingAddressPostalcode;
    }

    public String getBillingAddressCountry() {
        return billingAddressCountry;
    }

    public void setBillingAddressCountry(String billingAddressCountry) {
        this.billingAddressCountry = billingAddressCountry;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPhoneOffice() {
        return phoneOffice;
    }

    public void setPhoneOffice(String phoneOffice) {
        this.phoneOffice = phoneOffice;
    }

    public String getPhoneAlternate() {
        return phoneAlternate;
    }

    public void setPhoneAlternate(String phoneAlternate) {
        this.phoneAlternate = phoneAlternate;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getShippingAddressStreet() {
        return shippingAddressStreet;
    }

    public void setShippingAddressStreet(String shippingAddressStreet) {
        this.shippingAddressStreet = shippingAddressStreet;
    }

    public String getShippingAddressCity() {
        return shippingAddressCity;
    }

    public void setShippingAddressCity(String shippingAddressCity) {
        this.shippingAddressCity = shippingAddressCity;
    }

    public String getShippingAddressState() {
        return shippingAddressState;
    }

    public void setShippingAddressState(String shippingAddressState) {
        this.shippingAddressState = shippingAddressState;
    }

    public String getShippingAddressPostalcode() {
        return shippingAddressPostalcode;
    }

    public void setShippingAddressPostalcode(String shippingAddressPostalcode) {
        this.shippingAddressPostalcode = shippingAddressPostalcode;
    }

    public String getShippingAddressCountry() {
        return shippingAddressCountry;
    }

    public void setShippingAddressCountry(String shippingAddressCountry) {
        this.shippingAddressCountry = shippingAddressCountry;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getSicCode() {
        return sicCode;
    }

    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getBillingAddressPostcode() {
        return billingAddressPostcode;
    }

    public void setBillingAddressPostcode(String billingAddressPostcode) {
        this.billingAddressPostcode = billingAddressPostcode;
    }

}