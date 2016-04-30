package com.pullup.app.repository.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.UserTransaction;

import com.pullup.app.entity.Enterprise;
import com.pullup.app.entity.PullupPlan;
import com.pullup.app.repository.EnterpriseRepository;
import java.util.logging.Logger;
import javax.inject.Inject;

public class EnterpriseRepositoryImpl implements EnterpriseRepository {

    public EnterpriseRepositoryImpl() {
    }

    @PersistenceContext
    private EntityManager em;

    @Resource
    private UserTransaction utx;
    
    @Inject
    private transient Logger log; 

    @Override
    public void add(Enterprise enterprise) {

    }

    @Override
    public void get(Enterprise enterprise) {

    }

    @Override
    public void addPullupPlan(PullupPlan plan) {
        try{
            utx.begin();
            em.persist(plan);
            utx.commit();
            em.close(); 
        }catch(Exception ex){
            log.severe("Could not add plan: " + ex.getMessage()); 
        }
    }

}
