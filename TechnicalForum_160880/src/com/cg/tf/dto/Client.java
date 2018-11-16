package com.cg.tf.dto;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="query_master")
public class Client {
    
	
	
	@Id
	@Column(name="query_id")
	@NotNull(message="Enter Query Id")
	private int query_id;
	
	
	@Column(name="technology")
	@NotEmpty(message="Enter technology name")
	private String technology;
	
	
	

	@Column(name="query_raised_by")
	@NotEmpty(message="Enter query person name")
    private String querypersonName;
	

	@Column(name="query")
	@NotEmpty(message="Enter query")
    private String query;
	

	@Column(name="solutions")
    private String solution;
	

	@Column(name="solution_given_by")
    private String solutionproviderName;
    
    
    
    
	public Client(int query_id, String technology, String querypersonName,
			String query, String solution, String solutionproviderName) {
		super();
		this.query_id = query_id;
		this.technology = technology;
		this.querypersonName = querypersonName;
		this.query = query;
		this.solution = solution;
		this.solutionproviderName = solutionproviderName;
	}




	public Client() {
		// TODO Auto-generated constructor stub
	}




	public int getQuery_id() {
		return query_id;
	}




	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}




	public String getTechnology() {
		return technology;
	}




	public void setTechnology(String technology) {
		this.technology = technology;
	}




	public String getQuerypersonName() {
		return querypersonName;
	}




	public void setQuerypersonName(String querypersonName) {
		this.querypersonName = querypersonName;
	}




	public String getQuery() {
		return query;
	}




	public void setQuery(String query) {
		this.query = query;
	}




	public String getSolution() {
		return solution;
	}




	public void setSolution(String solution) {
		this.solution = solution;
	}




	public String getSolutionproviderName() {
		return solutionproviderName;
	}




	public void setSolutionproviderName(String solutionproviderName) {
		this.solutionproviderName = solutionproviderName;
	}




	@Override
	public String toString() {
		return "Client [query_id=" + query_id + ", technology=" + technology
				+ ", querypersonName=" + querypersonName + ", query=" + query
				+ ", solution=" + solution + ", solutionproviderName="
				+ solutionproviderName + "]";
	}
	
	
	
}
