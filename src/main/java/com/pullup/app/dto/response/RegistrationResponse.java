/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.dto.response;

/**
 *
 * @author MACARENA
 */
public class RegistrationResponse {
    private boolean success; 
    private String id; 

    public RegistrationResponse(boolean success, String id) {
        this.success = success;
        this.id = id;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RegistrationResponse() {
    }
    
    
}
