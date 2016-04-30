/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.entity;

import java.io.Serializable;
import java.util.UUID;
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
    
    @Column(name = "street")
    private String street; 
    
    @Column(name = "int_number")
    private String int_number;
    
    @Column(name = "out_number")
    private String out_number;
    
    @Column(name = "neighborhood")
    private String neighborhood;
    
    @Column(name = "state")
    private String state;
    
    @Column(name = "country")
    private String country;
    
    @Column(name = "pullup_plan_id")
    private String pullupPlanId; 

    public Enterprise(String name, String street, String int_number, String out_number, String neighborhood,String state,
    		String country, String pullupPlanId) {
        this.name = name;
        this.street = street;
        this.int_number = int_number;
        this.out_number = out_number;
        this.neighborhood = neighborhood;
        this.state = state;
        this.country = country;
        this.pullupPlanId = pullupPlanId;
    }

    public Enterprise() {
        id = UUID.randomUUID().toString(); 
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

    public String getPullupPlanId() {
        return pullupPlanId;
    }

    public void setPullupPlanId(String pullupPlanId) {
        this.pullupPlanId = pullupPlanId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
