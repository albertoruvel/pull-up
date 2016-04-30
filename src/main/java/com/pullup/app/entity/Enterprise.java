/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



/**
 *
 * @author MACARENA
 */
@Entity(name = "enterprise")
public class Enterprise implements Serializable{
    @Id
    @Column(name = "id")
    private String id; 
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "address")
    private String address; 
    
    @Column(name = "pullup_plan_id")
    private String pullupPlanId; 

    public Enterprise(String name, String address, String pullupPlanId) {
        this.name = name;
        this.address = address;
        this.pullupPlanId = pullupPlanId;
    }

    public Enterprise() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPullupPlanId() {
        return pullupPlanId;
    }

    public void setPullupPlanId(String pullupPlanId) {
        this.pullupPlanId = pullupPlanId;
    }
    
    
}
