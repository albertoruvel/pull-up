package com.pullup.app.repository.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import com.pullup.app.entity.UserSecurity;
import com.pullup.app.repository.UserSecurityRepository;

public class UserSecurityRepositoryImpl implements UserSecurityRepository {
	
	public UserSecurityRepositoryImpl(){}
	
	@PersistenceContext
    private EntityManager em; 
    
    @Resource
    private UserTransaction utx; 
	
	@Override
	public void add(UserSecurity usersecurity) {
		
		
	}

	@Override
	public void get(UserSecurity usersecurity) {
	
		
	}

}
