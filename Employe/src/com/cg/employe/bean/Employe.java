package com.cg.employe.bean;

public class Employe {

	private String EmpId;
	private String EmpName;
	private String EmpSalary;
	private String DeptNo;
	
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(String empSalary) {
		EmpSalary = empSalary;
	}
	public String getDeptNo() {
		return DeptNo;
	}
	public void setDeptNo(String deptNo) {
		DeptNo = deptNo;
	}
	public Employe(String empId, String empName, String empSalary, String deptNo) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSalary = empSalary;
		DeptNo = deptNo;
	}
	
	public Employe() {
		
	}
	@Override
	public String toString() {
		return "Employe [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + ", DeptNo=" + DeptNo
				+ "]";
	}
	

	
	
}
