/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.delegate.impl;

import com.pullup.app.delegate.CoordinatesDelegate;
import com.pullup.app.dto.request.PointRequest;
import com.pullup.app.dto.request.PullerRouteRequest;
import com.pullup.app.dto.response.RegistrationResponse;
import com.pullup.app.entity.PullerRoute;
import com.pullup.app.entity.RoutePoint;
import com.pullup.app.repository.PullerRouteRepository;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Response;

/**
 *
 * @author MACARENA
 */
public class CoordinatesDelegateImpl implements CoordinatesDelegate{

    @Inject
    private PullerRouteRepository repository; 

    public CoordinatesDelegateImpl() {
    }
    
    @Override
    public Response registerPullerRoute(PullerRouteRequest request) {
        PullerRoute route = getRoute(request); 
        repository.add(route);
        
        //add all points 
        for (RoutePoint req : route.getPoints()) {
            repository.addRoutePoint(req); 
        }
        return Response.ok(new RegistrationResponse(true, route.getId()))
                .build(); 
    }

    private PullerRoute getRoute(PullerRouteRequest request) {
        PullerRoute r = new PullerRoute(); 
        r.setRadio(request.getRadio());
        r.setPullerId(request.getPullerId());
        //create route points 
        for (PointRequest req : request.getPoints()) {
            r.getPoints().add(new RoutePoint(req.getLat(), req.getLon(), r.getId())); 
        }
        return r; 
    }

    @Override
    public Response changePullerRoute(String routeId, boolean onRoute) {
        Response response = null; 
        //get the route 
        PullerRoute route = null; 
        
        route = repository.get(routeId); 
        if(route != null){
            //update 
            repository.updatePullerRoute(routeId, onRoute); 
            response = Response.ok()
                    .build(); 
        }else{
            response = Response.status(Response.Status.BAD_REQUEST)
                    .build(); 
        }
        return response; 
    }
    
}
