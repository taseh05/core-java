package com.tahaseen.learning;

public class Employee {
	
	String name;
	int empNo;
	Double Salary;
	String designation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getempNo() {
		return empNo;
	}
	public void setempNo(int empNo) {
		this.empNo = empNo;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(String name, int empNo, Double salary, String designation) {
		super();
		this.name = name;
		this.empNo = empNo;
		Salary = salary;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNo=" + empNo + ", Salary=" + Salary + ", designation=" + designation
				+ "]";
	}
	
	

}
