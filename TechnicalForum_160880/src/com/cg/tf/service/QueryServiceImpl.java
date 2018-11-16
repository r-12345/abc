package com.cg.tf.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tf.dao.IQueryDAO;
import com.cg.tf.dto.Client;


@Service("queryservice")
@Transactional
public class QueryServiceImpl implements IQueryService {
	
	
	@Autowired
	IQueryDAO querydao;																				
	

	@Override
	public List<Client> getQueryDetails() {
		// TODO Auto-generated method stub
		return querydao.getQueryDetails();
	}

}
