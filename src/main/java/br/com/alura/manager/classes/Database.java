package br.com.alura.manager.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Database {

	private static List<Company> companyList = new ArrayList<>();
	
	public void add(Company company) {
		Database.companyList.add(company);
	}

	public void delete(Integer id) {
		Iterator<Company> it = companyList.iterator();
		
		while(it.hasNext()){
			Company company = it.next();
		
			if(company.getId() == id)
				companyList.remove(0);
		}
		
	}
	
	public static List<Company> getCompanyList() {
		return companyList;
	}
	
	
}
