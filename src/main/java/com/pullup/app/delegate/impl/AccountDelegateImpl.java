/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.delegate.impl;

import com.pullup.app.delegate.AccountDelegate;
import com.pullup.app.dto.request.CreatePullupRequest;
import com.pullup.app.dto.request.LoginRequest;
import com.pullup.app.dto.request.RegistrationRequest;
import com.pullup.app.dto.response.AuthenticationResponse;
import com.pullup.app.entity.PullupRequest;
import com.pullup.app.entity.Enterprise;
import com.pullup.app.entity.User;
import com.pullup.app.entity.Vehicle;
import com.pullup.app.exception.RegistrationException;
import com.pullup.app.repository.EnterpriseRepository;
import com.pullup.app.repository.UserRepository;
import com.pullup.app.repository.VehicleRepository;
import com.pullup.app.repository.PullupRequestRepository;

import java.security.SecureRandom;
import java.util.Date;
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
    private VehicleRepository vehicleRepository; 
    
    @Inject
    private EnterpriseRepository enterpriseRepository; 
    
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
            //register user vehicle 
            Vehicle vehicle = getVehicle(request); 
            //add vehicle
            vehicleRepository.add(vehicle);
            //set vehicle id 
            user.setVehicleId(vehicle.getId());
            //get the enterprise 
            Enterprise enterprise = enterpriseRepository.get(request.getEnterpriseId()); 
            if(enterprise != null){
                //set enterprise id 
                user.setEnterpriseId(enterprise.getId());
                //add it 
                String userId = userRepository.add(user);
                //create an authentication token 
                final String token = createAuthToken(userId, request.getEmail());
                //create a response 
                authResponse = new AuthenticationResponse(token, true, "Successfuly registered to Pull-Up :)", userId);
                //build a response 
                payload = Response.ok(authResponse)
                        .build();
            }else{
                authResponse = new AuthenticationResponse("N/A", false, "Enterprise does not exists", "N/A");
                payload = Response.ok(authResponse)
                        .build(); 
            }
            
        }else{
            //the user exists
            //return a user already registered response 
            authResponse = new AuthenticationResponse("N/A", false, "A user with this email is already registered", "N/A"); 
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
        //TODO: CHECK ENTERPRISE ID 
        user.setLastName(request.getLastName());
        user.setName(request.getName());
        user.setPassword(request.getPassword());
        user.setPhone(request.getPhone());
        //user.setPictureUrl(pictureUrl);
        user.setRegistrationDate(new Date().toString());
        user.setRole(User.UserRole.getRole(request.getRole()));
        Vehicle vehicle = getVehicle(request);
        user.setVehicleId(vehicle.getId());
        return user; 
    }
    
    private Vehicle getVehicle(RegistrationRequest request){
        Vehicle vehicle = new Vehicle(); 
        vehicle.setBrand(request.getBrand());
        vehicle.setModel(request.getModel());
        vehicle.setPlates(request.getPlates());
        return vehicle; 
    }

    @Override
    public Response login(LoginRequest request) {
        Response response = null; 
        AuthenticationResponse payload = null; 
        User user = null; 
        
        user = userRepository.getUserByEmail(request.getEmail());
        if (user != null) {
            if (request.getPassword().equals(user.getPassword())) {
                //user is authenticated
                payload = new AuthenticationResponse();
                //creates a token 
                final String token = createAuthToken(user.getId(), user.getEmail());
                payload.setToken(token);
                payload.setSuccess(true);
                payload.setMessage("Welcome to Pull-Up");
                response = Response.ok(payload)
                        .build();
            }else{
                payload = new AuthenticationResponse();
            payload.setToken("N/A");
            payload.setMessage("Email &/or password are incorrect");
            payload.setSuccess(false);
            response = Response.ok(payload)
                    .build();
            }
        } else {
            //user not found 
            payload = new AuthenticationResponse();
            payload.setToken("N/A");
            payload.setMessage("Email &/or password are incorrect");
            payload.setSuccess(false);
            response = Response.ok(payload)
                    .build();
        }

        
        return response; 
    }
    
    
    
    @Override
    public Response registerPullupResource(CreatePullupRequest request) {
        Response response = null;  
        
        PullupRequestRepository pRequest = PullupRequest.setRiderId(request.getRiderId());
        if (pRequest != null) {
        	pRequest = (PullupRequestRepository) getRiderId(request);
        	String riderId = PullupRequestRepository.add(pRequest);
                response = Response.ok(pRequest)
                        .build();
            }else{
      
            }        
        return response; 
    }

private PullupRequest getRiderId(CreatePullupRequest request){
   PullupRequest pRequest = new PullupRequest(); 
   pRequest.setRiderId((request.getRiderId()));
    return pRequest; 
		}
	
}
