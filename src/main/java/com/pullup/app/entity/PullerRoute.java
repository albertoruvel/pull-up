/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author MACARENA
 */
@Entity(name = "pullerroute")
public class PullerRoute implements Serializable{
    
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "radio")
    private int radio; 
    /*
    @OneToMany(cascade = CascadeType.PERSIST, 
            mappedBy = "route_id")*/

    public PullerRoute(String id, int radio) {
        this.id = id;
        this.radio = radio;
    }

    public PullerRoute() {
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
