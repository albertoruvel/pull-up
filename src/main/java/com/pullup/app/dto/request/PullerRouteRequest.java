/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.dto.request;

import java.util.List;

/**
 *
 * @author MACARENA
 */
public class PullerRouteRequest {
    private String pullerId; 
    private double radio; 
    private List<PointRequest> points; 

    public PullerRouteRequest(double radio, List<PointRequest> points) {
        this.radio = radio;
        this.points = points;
    }

    public PullerRouteRequest() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public List<PointRequest> getPoints() {
        return points;
    }

    public void setPoints(List<PointRequest> points) {
        this.points = points;
    }

    public String getPullerId() {
        return pullerId;
    }

    public void setPullerId(String pullerId) {
        this.pullerId = pullerId;
    }
    
    
}
