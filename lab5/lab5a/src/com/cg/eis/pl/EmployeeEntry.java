package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.ServiceEmployee;

public class EmployeeEntry {
	public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	int id=2;
	System.out.println("Enter details");
	String name= sc.nextLine();
	String designation=sc.nextLine();
	double salary=sc.nextDouble();
	ServiceEmployee serviceemployee=new ServiceEmployee(designation,salary);
	String insuranceScheme=serviceemployee.schemeType();
	Employee employee=new Employee(id,name,salary,designation,insuranceScheme);
	System.out.println(employee.toString());
	
	
	
	
	}	
	
}
