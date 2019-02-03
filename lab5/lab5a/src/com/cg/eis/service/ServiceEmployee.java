package com.cg.eis.service;
public class ServiceEmployee implements EmployeeService{
     String designation;
     double salary;


	public ServiceEmployee(String designation, double salary) {
		super();
		this.designation = designation;
		this.salary = salary;
	}


	@Override
	public String schemeType() {
		// TODO Auto-generated method stub
		
		if(designation.equals("SystemAssociate")||(salary>5000&&salary<20000))
		return "scheme C";
		if(designation.equals("Programmer")||(salary>20000&&salary<40000))
			return "scheme B";
		if(designation.equals("Manager")||(salary>=40000))
			return "scheme A";
		if(designation.equals("Clerk")||salary<5000)
			return "No scheme";
		
		return "Entered wrong designation";
		
	}





}
