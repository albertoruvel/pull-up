/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.resource;

import com.pullup.app.delegate.AccountDelegate;
import com.pullup.app.dto.request.RegistrationRequest;
import com.pullup.app.exception.RegistrationException;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

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
    @Produces("application/json")
    @Consumes("application/json")
    public Response register(RegistrationRequest request){
        Response payload = null; 
        try{
            payload = delegate.registerUser(request); 
        }catch(RegistrationException ex){
            
        }
        return payload; 
    }
}
