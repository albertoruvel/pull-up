package com.pullup.app.repository.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import com.pullup.app.entity.RoutePoint;
import com.pullup.app.repository.RoutePointRepository;

public class RoutePointRepositoryImpl implements RoutePointRepository{

	public RoutePointRepositoryImpl(){}
	
	@PersistenceContext
    private EntityManager em; 
    
    @Resource
    private UserTransaction utx; 
    
	@Override
	public void add(RoutePoint routepoint) {
		
	}

	@Override
	public void get(RoutePoint routepoint) {
		
	}

}
