package com.cg.tf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





import org.springframework.web.servlet.ModelAndView;

import com.cg.tf.dto.Client;
import com.cg.tf.service.IQueryService;


@Controller
public class QueryController {
	
	
	@Autowired
	IQueryService queryservice;	


	
	@RequestMapping(value = "search", method = RequestMethod.GET)   						
	public ModelAndView showQuery() {
			List<Client> queryData =  queryservice.getQueryDetails();       					
			return new ModelAndView("welcome", "data", queryData);				
	}
	

	@RequestMapping(value = "show", method = RequestMethod.GET)   						
	public ModelAndView showQuery() {
			List<Client> queryData =  queryservice.getQueryDetails();       					
			return new ModelAndView("welcome", "data", queryData);				
	}
	
	
	
	
}
