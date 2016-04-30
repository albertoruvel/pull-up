package com.pullup.app.repository.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import com.pullup.app.entity.PullupPlan;
import com.pullup.app.repository.PullupPlanRepository;
import java.util.logging.Logger;
import javax.inject.Inject;

public class PullupPlanRepositoryImpl implements PullupPlanRepository {

    public PullupPlanRepositoryImpl() {
    }

    @PersistenceContext
    private EntityManager em;

    @Resource
    private UserTransaction utx;
    
    @Inject
    private transient Logger log; 

    @Override
    public void add(PullupPlan pullupplan) {
        try{
            utx.begin();
            em.persist(pullupplan);
            utx.commit();
        }catch(Exception ex){
            log.severe("Could not add pullup plan:" + ex.getMessage());
            
        }
    }

    @Override
    public void get(PullupPlan pullupplan) {

    }

}
