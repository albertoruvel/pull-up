package com.pullup.app.repository.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import com.pullup.app.entity.PullupRequest;
import com.pullup.app.repository.PullupRequestRepository;

public class PullupRequestRepositoryImpl implements PullupRequestRepository {

    public PullupRequestRepositoryImpl() {
    }

    @PersistenceContext
    private EntityManager em;

    @Resource
    private UserTransaction utx;

    @Override
    public void add(PullupRequest request) {

    }

    @Override
    public void get(PullupRequest request) {

    }

}
