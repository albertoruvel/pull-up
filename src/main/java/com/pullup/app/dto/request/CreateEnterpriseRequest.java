/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.dto.request;

/**
 *
 * @author MACARENA
 */
public class CreateEnterpriseRequest {
    private String name;
    
    private String street; 
    
    private String int_number;
    
    private String out_number;
    
    private String neighborhood;
    
    private String state;
    
    
    private String country;
    
    private String pullupPlanId; 

    public CreateEnterpriseRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getInt_number() {
        return int_number;
    }

    public void setInt_number(String int_number) {
        this.int_number = int_number;
    }

    public String getOut_number() {
        return out_number;
    }

    public void setOut_number(String out_number) {
        this.out_number = out_number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPullupPlanId() {
        return pullupPlanId;
    }

    public void setPullupPlanId(String pullupPlanId) {
        this.pullupPlanId = pullupPlanId;
    }
    
    
}
