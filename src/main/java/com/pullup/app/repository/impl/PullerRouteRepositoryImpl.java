package com.pullup.app.repository.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import com.pullup.app.entity.PullerRoute;
import com.pullup.app.repository.PullerRouteRepository;

public class PullerRouteRepositoryImpl implements PullerRouteRepository{
	
	public PullerRouteRepositoryImpl(){}

	 @PersistenceContext
	    private EntityManager em; 
	    
	    @Resource
	    private UserTransaction utx; 
	
	@Override
	public void add(PullerRoute route) {
		
	}

	@Override
	public void get(PullerRoute route) {
		
	}

}
