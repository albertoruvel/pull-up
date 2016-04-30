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
    private String userId; 

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(String token, boolean success, String message, String userId) {
        this.token = token;
        this.success = success;
        this.message = message;
        this.userId = userId; 
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    
}
