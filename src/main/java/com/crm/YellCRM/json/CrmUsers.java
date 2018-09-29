package com.crm.YellCRM.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonSerialize
public class CrmUsers {

    @JsonProperty("CrmUsers")
    private List<CrmUser> crmUsers;

    public List<CrmUser> getCrmUsers() {
        return crmUsers;
    }

    public void setCrmUsers(List<CrmUser> crmUsers) {
        this.crmUsers = crmUsers;
    }

}
