package com.pullup.app.repository.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import com.pullup.app.entity.PullupPlan;
import com.pullup.app.repository.PullupPlanRepository;

public class PullupPlanRepositoryImpl implements PullupPlanRepository {

	public PullupPlanRepositoryImpl(){}
	
	   @PersistenceContext
	    private EntityManager em; 
	    
	    @Resource
	    private UserTransaction utx; 
	
	@Override
	public void add(PullupPlan pullupplan) {
		
	}

	@Override
	public void get(PullupPlan pullupplan) {
		
	}

}
