package br.com.alura.manager.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

	private static List<Company> companyList = new ArrayList<>();
	private static Map<Integer, Company> idToCompany = new HashMap<>();
	
	public void add(Company company) {
		Database.companyList.add(company);
		Database.idToCompany.put(company.getId(), company);
	}

	public void delete(Integer id) {
		companyList.remove(idToCompany.get(id));	
	}
	
	public void edit(Integer id, String newName, Date newDate){
		Company company = this.getCompanyById(id);
		company.setName(newName);
		company.setDate(newDate);
	}
	
	public static List<Company> getCompanyList() {
		return companyList;
	}
	
	public Company getCompanyById(Integer id) {
		for (Company company : companyList) {
			if(company.getId().equals(id))
				return company;
		}
		return null;
	}
	
	
}
