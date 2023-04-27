package br.com.alura.manager.model;

import java.util.Date;

public class Company {

	private Integer id;
	private String name;
	private Date date = new Date();
	
	public Company(Integer id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
