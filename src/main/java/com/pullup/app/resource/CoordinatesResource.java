/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.resource;

import com.pullup.app.delegate.CoordinatesDelegate;
import com.pullup.app.dto.request.PullerRouteRequest;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author MACARENA
 */
@Path("coord")
public class CoordinatesResource {
    
    @Inject
    private CoordinatesDelegate delegate; 
    
    @Path("registerRoute")
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response registerPullerRoute(PullerRouteRequest request){
        return delegate.registerPullerRoute(request);
    }
    
    
    @Path("pullerRoute")
    @POST
    @Produces("application/json")
    public Response changePullerRouteStatus(@QueryParam("routeId")String routeId, 
                                            @QueryParam("onRoute")boolean onRoute){
        return delegate.changePullerRoute(routeId, onRoute); 
    }
}
