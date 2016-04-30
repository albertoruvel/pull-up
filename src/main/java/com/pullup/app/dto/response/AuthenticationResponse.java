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
public class AuthenticationResponse {
    private String token; 
    private boolean success; 
    private String message; 

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(String token, boolean success, String message) {
        this.token = token;
        this.success = success;
        this.message = message;
    }

    
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
