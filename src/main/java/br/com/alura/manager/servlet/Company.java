package br.com.alura.manager.servlet;

public class Company {

	private Integer id;
	private String name;
	
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
	
	
}
