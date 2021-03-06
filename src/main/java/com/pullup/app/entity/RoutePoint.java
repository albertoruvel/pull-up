/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.entity;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author MACARENA
 */
@Entity(name = "routerpoint")
@Table(name = "routerpoint")
public class RoutePoint implements Serializable{
    
    @Id
    @Column(name = "id")
    private String id; 
    
    @Column(name = "latitude")
    private double latitude;
    
    @Column(name = "longitude")
    private double longitude;
    
    @Column(name = "route_id")
    private String routeId; 

    public RoutePoint() {
        this.id = UUID.randomUUID().toString(); 
    }

    public RoutePoint(double latitude, double longitude, String routeId) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.routeId = routeId;
        this.id = UUID.randomUUID().toString(); 
    }
    
    

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }
    
    
}
