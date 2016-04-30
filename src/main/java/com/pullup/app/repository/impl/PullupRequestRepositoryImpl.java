package com.pullup.app.repository.impl;

import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.UserTransaction;

import com.pullup.app.entity.PullupRequest;
import com.pullup.app.entity.User;
import com.pullup.app.repository.PullupRequestRepository;

public class PullupRequestRepositoryImpl implements PullupRequestRepository {

    public PullupRequestRepositoryImpl() {
    }
    
    @Inject
    private transient Logger log; 
    
    @PersistenceContext
    private EntityManager em;

    @Resource
    private UserTransaction utx;

    @Override
    public void add(PullupRequest request) {
    
        try{
            utx.begin();
            em.persist(request);
            utx.commit();
        }catch(Exception ex){
            log.severe("Exception: " + ex.getMessage()); 
        }

    }

    @Override
    public PullupRequest getRequestCordinate(String requestCordinate) {
            Query query =  em.createQuery("SELECT u FROM PullupRequest u WHERE u.requestCordinate = :requestCoordinates"); 
            query.setParameter("requestCoordinates", requestCordinate); 
            PullupRequest reqC = null;
            try{
                reqC= (PullupRequest)query.getSingleResult(); 
            }catch(NoResultException ex){
                log.info("Entity not found: " + ex.getMessage());
            }
            return reqC; 

    }

}
