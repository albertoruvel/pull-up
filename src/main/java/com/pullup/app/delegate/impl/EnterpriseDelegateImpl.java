/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.delegate.impl;

import com.pullup.app.delegate.EnterpriseDelegate;
import com.pullup.app.dto.request.CreateEnterpriseRequest;
import com.pullup.app.dto.request.CreatePullupPlanRequest;
import com.pullup.app.dto.response.RegistrationResponse;
import com.pullup.app.entity.Enterprise;
import com.pullup.app.entity.PullupPlan;
import com.pullup.app.repository.EnterpriseRepository;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

/**
 *
 * @author MACARENA
 */
public class EnterpriseDelegateImpl implements EnterpriseDelegate{

    @Inject
    private EnterpriseRepository repository; 
    
    
    @Override
    public Response registerPullupPlan(CreatePullupPlanRequest request) {
        PullupPlan plan = new PullupPlan(); 
        plan.setExpiration(request.getExpiration());
        plan.setPlanType(PullupPlan.PlanType.getPlan(request.getPlanType()));
        plan.setPlanCost(request.getPlanCost().doubleValue());
        repository.addPullupPlan(plan);
        return Response.ok()
                .build(); 
    }
    
  
 
    @Override
    public Response registerEnterprise(CreateEnterpriseRequest request) {
        //create an enterprise 
        Enterprise enterprise = getEnterprise(request); 
        repository.add(enterprise);
        Response response = null; 
        response = Response.ok(new RegistrationResponse(true, enterprise.getId()))
                .build(); 
        return response; 
    }
    
    private Enterprise getEnterprise(CreateEnterpriseRequest request){
        Enterprise e = new Enterprise(); 
        e.setCountry(request.getCountry());
        e.setInt_number(request.getInt_number());
        e.setName(request.getName());
        e.setNeighborhood(request.getNeighborhood());
        e.setOut_number(request.getOut_number());
        e.setPullupPlanId(request.getPullupPlanId());
        e.setState(request.getState());
        e.setStreet(request.getStreet());
        return e; 
    }
    
}
