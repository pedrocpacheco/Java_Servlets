package br.com.alura.manager.classes;

import java.util.Date;

public class Company {

	private Integer id;
	private String name;
	private Date date = new Date();
	
	public Company(Integer id, String name) {
		this.id = id;
		this.name = name;
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
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
