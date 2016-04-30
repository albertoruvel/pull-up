/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.resource;

import com.pullup.app.delegate.EnterpriseDelegate;
import com.pullup.app.dto.request.CreateEnterpriseRequest;
import com.pullup.app.dto.request.CreatePullupPlanRequest;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author MACARENA
 */
@Path("enterprise")
public class EnterpriseResource {
    
    @Inject
    private EnterpriseDelegate delegate; 
    
    @Path("registerEnterprise")
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response registerEnterprise(CreateEnterpriseRequest request){
        return delegate.registerEnterprise(request); 
    }
    
    @Path("registerPlan")
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response createPullupPlan(CreatePullupPlanRequest request){
        return delegate.registerPullupPlan(request); 
    }
}
