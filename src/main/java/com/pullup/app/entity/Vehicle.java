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

@Entity(name = "vehicle")
public class Vehicle implements Serializable{
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "brand")
    private String brand;
    
    @Column(name = "plates")
    private String plates; 

    public Vehicle(String brand, String plates) {
        this.brand = brand;
        this.plates = plates;
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }
    
    
}
