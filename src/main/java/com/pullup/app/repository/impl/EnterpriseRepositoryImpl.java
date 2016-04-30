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
import javax.persistence.NoResultException;

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
        try{
            utx.begin();
            em.persist(enterprise);
            utx.commit();
        }catch(Exception ex){
            log.severe("Could not add enterprise: " + ex.getMessage());
        }
    }

    @Override
    public Enterprise get(String name) {
        Enterprise enterprise = null; 
        
        Query query = em.createQuery("SELECT e from enterprise e WHERE e.name = :name", Enterprise.class); 
        query.setParameter("name", name); 
        
        try{
            enterprise = (Enterprise)query.getSingleResult(); 
        }catch(NoResultException ex){
            log.severe("No enterprise found with name: " + name);
        }
        return enterprise; 
    }

    @Override
    public void addPullupPlan(PullupPlan plan) {
        try{
            utx.begin();
            em.persist(plan);
            utx.commit();
        }catch(Exception ex){
            log.severe("Could not add plan: " + ex.getMessage()); 
        }
    }

}
