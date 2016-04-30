/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.repository.impl;

import com.pullup.app.entity.User;
import com.pullup.app.repository.UserRepository;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author MACARENA
 */
public class UserRepositoryImpl implements UserRepository{

    public UserRepositoryImpl() {
    }
    
    @PersistenceContext
    private EntityManager em; 
    
    @Resource
    private UserTransaction utx; 

    @Override
    public void add(User user) {
        
    }

    @Override
    public void update(User user) {
        
    }
    
}
