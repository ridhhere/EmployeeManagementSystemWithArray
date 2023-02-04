package com.ems.dao.impl;

import java.util.Scanner;

import com.ems.pojo.Employee;

public class EmployeeDAOImpl {
	static Scanner sc = new Scanner(System.in);
	static Employee addUserArray[]=null;
	
	public static void addEmployee() {
		System.out.println("How Many User You Want to Add?");
		int size=sc.nextInt();
		//size of the array
		addUserArray = new Employee[size];
		for(int i=0; i<size;++i) {
			//Enter details using scanner
			System.out.println("Enter Employee ID");
			int id=sc.nextInt();
			System.out.println("Enter Employee Name");
			String name=sc.next();
			System.out.println("Enter Employee Address");
			String address=sc.next();
			System.out.println("Enter Employee Email");
			String email=sc.next();
			System.out.println("Enter Employee Salary");
			int salary=sc.nextInt();
			//Save employee in an object
			Employee emp=new Employee(id,name,address,email,salary);
			//Save employee object in array
			addUserArray[i]=emp;
			System.out.println("Employee Has Been Added SuccesFully");
		}
		
	}
	
	public static Employee[] viewAllEmployee() {
		return addUserArray;
	}
	
	public Employee viewEmployee(int eno) {
		return null;
	}
	
	public void updateEmp(int eno) {
		
	}
	
	public boolean deleteEmployee(int eno) {
		return false;
	
	}

}
