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
import com.pullup.app.repository.EnterpriseRepository;

public class EnterpriseRepositoryImpl implements EnterpriseRepository{

	public  EnterpriseRepositoryImpl(){}
	
	@PersistenceContext
    private EntityManager em; 
    
    @Resource
    private UserTransaction utx; 
	
	
	@Override
	public void add(Enterprise enterprise) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "pullup_pu" );
	      em= emfactory.createEntityManager( );
	      em.getTransaction( ).begin( );
	      enterprise.setName( "Softtek" );
	      enterprise.setStreet("salud");
	      enterprise.setInt_number("12345");
	      enterprise.setOut_number("234");
	      enterprise.setNeighborhood("Toluca");
	      enterprise.setState("Juarez");
	      enterprise.setCountry("Brazil");
	      
	      em.persist( enterprise );
	      em.getTransaction( ).commit( );

	      em.close( );
	      emfactory.close( );
	}

	@Override
	public void get(Enterprise enterprise) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "pullup_pu" );
	      em= emfactory.createEntityManager( );
	      
	      Query query = em.createQuery("Select e from enterprise e");
	      List<Enterprise> result = (List<Enterprise>)query.getResultList();
	      
		
	}

}
