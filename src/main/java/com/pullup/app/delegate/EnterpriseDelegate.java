/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.delegate;

import com.pullup.app.dto.request.CreateEnterpriseRequest;
import com.pullup.app.dto.request.CreatePullupPlanRequest;
import com.pullup.app.dto.request.CreatePullupRequest;

import javax.ws.rs.core.Response;

/**
 *
 * @author MACARENA
 */
public interface EnterpriseDelegate {
    public Response registerPullupPlan(CreatePullupPlanRequest request); 
    public Response registerEnterprise(CreateEnterpriseRequest request);
    
}
