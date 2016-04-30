/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.resource;

import com.pullup.app.repository.UserRepository;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author MACARENA
 */
@Path("health")
public class HealthResource {
    
    @Inject
    private UserRepository repository; 
    
    @GET
    @Produces("text/plain")
    public String health(){
        return "Pull-Up --version 1.0"; 
    }
}
