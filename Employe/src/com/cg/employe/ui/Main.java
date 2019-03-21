package com.cg.employe.ui;

import java.util.Map;
import java.util.Scanner;

import com.cg.employe.bean.Employe;
import com.cg.employe.service.EmployeService;
import com.cg.employe.service.EmployeServiceImpl;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employe employe = new Employe();
		
		EmployeServiceImpl service = new EmployeServiceImpl();
		
		System.out.println("Welcome to XYZ Company");
		
		//System.out.println("Following are the enteries of the employies");
		
		//service.getEmployeList().entrySet().stream().forEach(System.out::println);
		
		System.out.println("Enter EmpId");
		String empId = scan.next();
		employe.setEmpId(empId);
		
		System.out.println("Enter EmpName");
		String empName = scan.next();
		employe.setEmpName(empName);
		
		System.out.println("Enter EmpSalary");
		String empSalary = scan.next();
		employe.setEmpSalary(empSalary);
		
		System.out.println("Enter DeptNo");
		String deptNo = scan.next();
		employe.setDeptNo(deptNo);
		
		Map<Integer, Employe> emp= service.createEmploye(employe);
		System.out.println(emp);
		emp.entrySet().stream().forEach(System.out::println);
		
		
		
		
		
		
		
	}
}
