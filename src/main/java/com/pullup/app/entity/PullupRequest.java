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
@Entity(name = "pulluprequest")
public class PullupRequest implements Serializable{
    
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "rider_id")
    private String riderId; 
    
    @Column(name = "puller_id")
    private String pullerId; 
    
    @Column(name = "rdate")
    private String date; 
    
    @Column(name = "accepted")
    private boolean accepted; 
    
    @Column(name = "request_coordinates")
    private String requestCoordinates; 
    
    @Column(name = "pickup_coordinates")
    private String pickupCoordinates; 
    
    @Column(name = "picked_up")
    private boolean pickedUp; 

    public PullupRequest() {
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getPullerId() {
        return pullerId;
    }

    public void setPullerId(String pullerId) {
        this.pullerId = pullerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public String getRequestCoordinates() {
        return requestCoordinates;
    }

    public void setRequestCoordinates(String requestCoordinates) {
        this.requestCoordinates = requestCoordinates;
    }

    public String getPickupCoordinates() {
        return pickupCoordinates;
    }

    public void setPickupCoordinates(String pickupCoordinates) {
        this.pickupCoordinates = pickupCoordinates;
    }

    public boolean isPickedUp() {
        return pickedUp;
    }

    public void setPickedUp(boolean pickedUp) {
        this.pickedUp = pickedUp;
    }
    
    
}
