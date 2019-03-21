package com.cg.employe.service;

import java.util.List;
import java.util.Map;

import com.cg.employe.bean.Employe;
import com.cg.employe.dao.EmployeDao;
import com.cg.employe.dao.EmployeDaoImpl;

public class EmployeServiceImpl implements EmployeService {
	
	EmployeDaoImpl dao = new EmployeDaoImpl();

	


	@Override
	public Employe delete(int id, Employe employe) {
		return null;
	}

	@Override
	public Map<Integer, Employe> createEmploye(Employe employe) {
		return dao.createEmploye(employe);
	}

	
	
	

}
