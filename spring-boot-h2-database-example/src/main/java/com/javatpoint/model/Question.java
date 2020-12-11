package com.javatpoint.model;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;  
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty; 

@Entity
@Table
public class Question {
	@GeneratedValue
	@Id
	@Column
	private int id;
	
	@Column
	@JsonProperty("name")
	private String name;
	
	@Column
	@JsonProperty("rollno")
	private Integer rollno;
	
	@JsonProperty("name")
	public String getName() {
	return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
	this.name = name;
	}

	@JsonProperty("rollno")
	public Integer getRollno() {
	return rollno;
	}

	@JsonProperty("rollno")
	public void setRollno(Integer rollno) {
	this.rollno = rollno;
	}
}
