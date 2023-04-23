package br.com.alura.manager.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class Database {

	private static List<Company> companyList = new ArrayList<>();
	private static Map<Integer, Company> idToCompany = new HashMap<>();
	
	public void add(Company company) {
		Database.companyList.add(company);
		Database.idToCompany.put(company.getId(), company);
	}

	public void delete(Integer id) {
		System.out.println(100);
		System.out.println("ID: " + id);
		Company removedCompany = idToCompany.get(id);
		companyList.remove(removedCompany);
		
	}
	
	public static List<Company> getCompanyList() {
		return companyList;
	}
	
	
}
