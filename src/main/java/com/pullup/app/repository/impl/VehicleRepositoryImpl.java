package com.pullup.app.repository.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import com.pullup.app.entity.Vehicle;
import com.pullup.app.repository.VehicleRepository;
import java.util.logging.Logger;
import javax.inject.Inject;

public class VehicleRepositoryImpl implements VehicleRepository {

    public VehicleRepositoryImpl() {
    }
    @PersistenceContext
    private EntityManager em;

    @Resource
    private UserTransaction utx;

    @Inject
    private transient Logger log;

    @Override
    public void add(Vehicle car) {
        try {
            utx.begin();
            em.persist(car);
            utx.commit();
        } catch (Exception ex) {
            log.severe("Could not add vehicle: " + ex.getMessage());
        }
    }

    @Override
    public void get(Vehicle car) {
    }

}
