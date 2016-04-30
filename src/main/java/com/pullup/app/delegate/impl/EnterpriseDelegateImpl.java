/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.delegate.impl;

import com.pullup.app.delegate.EnterpriseDelegate;
import com.pullup.app.dto.request.CreatePullupPlanRequest;
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
    public Response registerEnterprise() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
