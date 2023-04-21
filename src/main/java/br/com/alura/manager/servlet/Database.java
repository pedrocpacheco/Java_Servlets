package br.com.alura.manager.servlet;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private static List<Company> companyList = new ArrayList<>();
	
	public void add(Company company) {
		companyList.add(company);
	}

	
	public static List<Company> getCompanyList() {
		return companyList;
	}
	
	
}
