/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pullup.app.repository.impl;

import com.pullup.app.entity.User;
import com.pullup.app.repository.UserRepository;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author MACARENA
 */
public class UserRepositoryImpl implements UserRepository{

    @Inject
    private transient Logger log; 
    
    @PersistenceContext
    private EntityManager em; 
    
    @Resource
    private UserTransaction utx; 
    
    public UserRepositoryImpl() {
    }

    @Override
    public String add(User user) {
        log.info("Adding new user");
        try{
            utx.begin();
            em.persist(user);
            utx.commit();
            em.close(); 
        }catch(Exception ex){
            log.severe("Exception: " + ex.getMessage()); 
        }
        return user.getId(); 
    }

    @Override
    public void update(User user) {
        
    }
    
    @Override 
    public User getUserByEmail(String email){
        Query query =  em.createQuery("SELECT u FROM user u WHERE u.email = :email"); 
        query.setParameter("email", email); 
        User user = null;
        try{
            user = (User)query.getSingleResult(); 
        }catch(NoResultException ex){
            log.info("Entity not found: " + ex.getMessage());
        }
        return user; 
    }
    
}
