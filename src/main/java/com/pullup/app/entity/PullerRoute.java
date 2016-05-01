/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author MACARENA
 */
@Entity(name = "pullerroute")
@Table(name="pullerroute")
public class PullerRoute implements Serializable{
    
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "radio")
    private double radio; 
    
    @Column(name = "puller_id")
    private String pullerId; 
    
    @Transient
    private List<RoutePoint> points; 
    
     @Column(name = "active")
    private boolean active; 

    public PullerRoute(String id, int radio) {
        this.id = id;
        this.radio = radio;
    }

    public PullerRoute() {
        id = UUID.randomUUID().toString(); 
        points = new ArrayList<RoutePoint>(); 
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<RoutePoint> getPoints() {
        return points;
    }

    public void setPoints(List<RoutePoint> points) {
        this.points = points;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPullerId() {
        return pullerId;
    }

    public void setPullerId(String pullerId) {
        this.pullerId = pullerId;
    }
    
    
}
