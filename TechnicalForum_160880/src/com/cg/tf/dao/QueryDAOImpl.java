package com.cg.tf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.tf.dto.Client;


@Repository("querydao")
public class QueryDAOImpl implements IQueryDAO {
	
	
	
	@PersistenceContext
	EntityManager em;																										


	@Override
	public List<Client> getQueryDetails() {
		// TODO Auto-generated method stub
		
		
		
		Query queryGet = em.createQuery("FROM Client");																			
		List<Client> queryDetails = queryGet.getResultList();																		
		return queryDetails;	
		
	}

}
