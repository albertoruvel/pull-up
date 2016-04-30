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
@Entity(name = "security")
public class UserSecurity implements Serializable{
    
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "token")
    private String token;
    
    @Column(name = "expiration")
    private String expiration; 
    
    @Column(name = "user_id")
    private String userId; 

    public UserSecurity(String token, String expiration) {
        this.token = token;
        this.expiration = expiration;
    }

    public UserSecurity() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
    
    
}
