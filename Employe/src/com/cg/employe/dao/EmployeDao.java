package com.cg.employe.dao;

import java.util.List;
import java.util.Map;

import com.cg.employe.bean.Employe;

public interface EmployeDao {
	
	
	public Map<Integer, Employe> createEmploye(Employe employe);
	
	
	public Employe delete(int id, Employe employe);
	
	

}
