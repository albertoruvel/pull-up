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
@Entity(name = "pullupplan")
public class PullupPlan implements Serializable{
    
    @Id
    @Column(name = "id")
    private String id; 
    
    @Column(name = "expiration")
    private String expiration; 
    
    @Column(name = "plan_type")
    private PlanType planType; 
    
    @Column(name = "plan_cost")
    private double planCost; 

    public PullupPlan(String expiration, PlanType planType, double planCost) {
        this.expiration = expiration;
        this.planType = planType;
        this.planCost = planCost;
    }

    public PullupPlan() {
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public void setPlanType(PlanType planType) {
        this.planType = planType;
    }

    public double getPlanCost() {
        return planCost;
    }

    public void setPlanCost(double planCost) {
        this.planCost = planCost;
    }
    
    
    
    public static enum PlanType{
        
        ANUAL(1), MONTHLY(2); 
        
        int value; 
        
        PlanType(int value){
            this.value = value; 
        }
        
        public int getValue(){
            return this.value; 
        }
        
        @Override 
        public String toString(){
            if(value == 1)
                return "ANUAL"; 
            else return "MONTHLY"; 
        }
        
    }
}
