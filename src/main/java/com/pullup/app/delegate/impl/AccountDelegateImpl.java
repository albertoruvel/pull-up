/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.delegate.impl;

import com.pullup.app.delegate.AccountDelegate;
import com.pullup.app.dto.request.RegistrationRequest;
import com.pullup.app.dto.response.AuthenticationResponse;
import com.pullup.app.entity.User;
import com.pullup.app.exception.RegistrationException;
import com.pullup.app.repository.UserRepository;
import java.security.SecureRandom;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

/**
 *
 * @author MACARENA
 */
public class AccountDelegateImpl implements AccountDelegate{

    @Inject
    private UserRepository userRepository; 
    
    @Inject
    private transient Logger log; 
    
    @Override
    public Response registerUser(RegistrationRequest request) throws RegistrationException {
        Response payload = null; 
        AuthenticationResponse authResponse = null; 
        
        //check whether the user is registered or not 
        User user = userRepository.getUserByEmail(request.getEmail()); 
        if(user == null){
            //user does not exists
            //create a user 
            user = getUser(request); 
            //add it 
            String userId = userRepository.add(user);
            //create an authentication token 
            final String token = createAuthToken(userId, request.getEmail()); 
            //create a response 
            authResponse = new AuthenticationResponse(token, true, "Successfuly registered to Pull-Up :)"); 
            //build a response 
            payload = Response.ok(authResponse)
                    .build(); 
        }else{
            //the user exists
            //return a user already registered response 
            authResponse = new AuthenticationResponse("N/A", false, "A user with this email is already registered"); 
            payload = Response.ok(authResponse)
                    .build(); 
        }
        
        return payload; 
    }
    
    private String createAuthToken(String id, String email){
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[32];
        random.nextBytes(bytes);
        return new String(bytes);
    }

    private User getUser(RegistrationRequest request) {
        User user = new User(); 
        user.setEmail(request.getEmail());
        user.setEnterpriseId(request.getEnterpriseId());
        user.setLastName(request.getLastName());
        user.setName(request.getName());
        user.setPassword(request.getPassword());
        user.setPhone(request.getPhone());
        //user.setPictureUrl(pictureUrl);
        return user; 
    }
    
}
