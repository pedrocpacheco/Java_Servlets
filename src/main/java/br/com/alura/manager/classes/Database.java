package br.com.alura.manager.classes;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class Database {

	private static List<Company> companyList = new ArrayList<>();
	
	public void add(Company company) {
		Database.companyList.add(company);
	}

	public void delete(Integer id) {
		System.out.println(100);
		System.out.println("ID: " + id);
		Iterator<Company> it = companyList.iterator();
		
		while(it.hasNext()) {
			Company comp = it.next();
			
			if(comp.getId().equals(id)) {
				it.remove();
			}
			
		}
		
	}
	
	public static List<Company> getCompanyList() {
		return companyList;
	}
	
	
}
