/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.dto.request;

import java.math.BigDecimal;

/**
 *
 * @author MACARENA
 */
public class CreatePullupPlanRequest {
    private String expiration; 
    private String planType;    
    private BigDecimal planCost; 

    public CreatePullupPlanRequest() {
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public BigDecimal getPlanCost() {
        return planCost;
    }

    public void setPlanCost(BigDecimal planCost) {
        this.planCost = planCost;
    }
    
    
}
