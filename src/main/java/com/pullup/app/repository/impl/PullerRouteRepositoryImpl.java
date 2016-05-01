package com.pullup.app.repository.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import com.pullup.app.entity.PullerRoute;
import com.pullup.app.entity.RoutePoint;
import com.pullup.app.repository.PullerRouteRepository;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class PullerRouteRepositoryImpl implements PullerRouteRepository {

    @PersistenceContext
    private EntityManager em; 
    
    @Resource
    private UserTransaction utx; 
    
    @Inject
    private transient Logger log; 
    
    public PullerRouteRepositoryImpl() {
    }

    @Override
    public void add(PullerRoute route) {
        try{
            utx.begin();
            em.persist(route);
            utx.commit();
        }catch(Exception ex){
            log.severe("Could not add puller route"); 
        }
    }

    @Override
    public PullerRoute get(String id) {
        PullerRoute route = null; 
        Query q = em.createQuery("SELECT r FROM pullerroute r WHERE r.id = :id"); 
        q.setParameter("id", id); 
        try{
            route = (PullerRoute)q.getSingleResult(); 
        }catch(NoResultException ex){
            log.severe("PullerRoute not found: " + ex.getMessage());
        }
        
        return route; 
    }

    @Override
    public void addRoutePoint(RoutePoint req) {
        try{
            utx.begin();
            em.persist(req);
            utx.commit();
        }catch(Exception ex){
            log.severe("Could not add route point: " + ex.getMessage()); 
        }
    }

    @Override
    public void updatePullerRoute(String routeId, boolean onRoute) {
        PullerRoute route = get(routeId); 
        if(route != null){
            route.setActive(onRoute);
            try{
                utx.begin();
                em.merge(route);
                utx.commit();
            } catch(Exception ex){
                log.severe("Could not update route: " + ex.getMessage());
            }
        }
    }

}
