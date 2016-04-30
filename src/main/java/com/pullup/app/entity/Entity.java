/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.entity;

import java.util.UUID;
import javax.persistence.Id;

/**
 *
 * @author MACARENA
 */
public abstract class Entity {
    
    @Id
    private String id; 

    public Entity() {
        this.id = UUID.randomUUID().toString();
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
