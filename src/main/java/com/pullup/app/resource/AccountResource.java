/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.resource;

import com.pullup.app.delegate.AccountDelegate;
import com.pullup.app.dto.request.LoginRequest;
import com.pullup.app.dto.request.RegistrationRequest;
import com.pullup.app.exception.RegistrationException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

/**
 *
 * @author MACARENA
 */
@Path("account")
public class AccountResource {
    
    @Inject
    private AccountDelegate delegate; 
    
    @Inject
    private transient Logger log; 
    
    @Path("register")
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response register(RegistrationRequest request){
        Response payload = null; 
        try{
            payload = delegate.registerUser(request); 
        }catch(RegistrationException ex){
            log.severe("Could not register new user: " + ex.getMessage());
        }
        return payload; 
    }
    
    @Path("auth")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    public Response login(LoginRequest request){
        return delegate.login(request); 
    }
}
