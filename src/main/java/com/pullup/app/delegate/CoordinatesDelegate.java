/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.delegate;

import com.pullup.app.dto.request.PullerRouteRequest;
import javax.ws.rs.core.Response;

/**
 *
 * @author MACARENA
 */
public interface CoordinatesDelegate {
    public Response registerPullerRoute(PullerRouteRequest request); 

    public Response changePullerRoute(String routeId, boolean onRoute);
    
}
