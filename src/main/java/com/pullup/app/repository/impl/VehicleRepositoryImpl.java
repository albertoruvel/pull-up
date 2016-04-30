package com.pullup.app.repository.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import com.pullup.app.entity.Vehicle;
import com.pullup.app.repository.VehicleRepository;

public class VehicleRepositoryImpl implements VehicleRepository{
	
	public VehicleRepositoryImpl(){
	}
	 @PersistenceContext
	    private EntityManager em; 
	    
	    @Resource
	    private UserTransaction utx; 
	
	@Override
	public void add(Vehicle car){}
	
	@Override
	public void get(Vehicle car){}

}
