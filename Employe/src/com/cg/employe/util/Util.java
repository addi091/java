package com.cg.employe.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.employe.bean.Employe;

public class Util {
	
	private static Map<Integer, Employe> emmployeentries = new HashMap<>();
	
	public static Map<Integer, Employe> getEmployeEntries() {
		emmployeentries.put(101, new Employe("101", "Aditya", "20000", "10"));
		emmployeentries.put(102, new Employe("102", "Tushar", "40000", "15"));
		emmployeentries.put(103, new Employe("103", "Mayur", "50000", "20"));
		
		return emmployeentries;
		
	}

}
