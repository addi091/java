package com.cg.employe.dao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.employe.bean.Employe;
import com.cg.employe.util.Util;

public class EmployeDaoImpl implements EmployeDao{
	
	//Map<Integer, Employe> database;
	Map<Integer, Employe> e;
	Comparator<Employe> sortByName = (Employe e1, Employe e2) -> e1.getEmpName().compareTo(e2.getEmpName());
	//Comparator<Employe> sortByPrice = ()

	public EmployeDaoImpl() {
	//	database = new HashMap<>(Util.getEmployeEntries());
		
	}

	



	public Employe delete(int id, Employe employe) {
		
		return null;
	}

	public Map<Integer, Employe> createEmploye(Employe employe) {

		int id = Integer.parseInt(employe.getEmpId());
		e = new HashMap<Integer, Employe>();
		e.put(101, new Employe("101", "Aditya", "20000", "10"));
		e.put(102, new Employe("102", "Tushar", "40000", "15"));
		e.put(103, new Employe("103", "Mayur", "50000", "20"));
		e.put(id, employe);
		return e;
	}

	


}
