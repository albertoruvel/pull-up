/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.delegate;

import com.pullup.app.dto.request.CreatePullupRequest;
import com.pullup.app.dto.request.LoginRequest;
import com.pullup.app.dto.request.RegistrationRequest;
import com.pullup.app.exception.RegistrationException;

import javax.ws.rs.core.Response;

/**
 *
 * @author MACARENA
 */
public interface AccountDelegate {
    public Response registerUser(RegistrationRequest request) throws RegistrationException; 
    public Response login(LoginRequest request); 
    public Response registerPullupResource(CreatePullupRequest request);
}
