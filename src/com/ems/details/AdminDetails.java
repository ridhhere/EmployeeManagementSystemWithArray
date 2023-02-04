package com.ems.details;

import java.util.Scanner;

import com.ems.client.EmployeeClient;
import com.ems.dao.impl.EmployeeDAOImpl;
import com.ems.pojo.Employee;

public class AdminDetails {
	public void adminMenu() {
		Scanner sc = new Scanner(System.in);
		//while loop to keep app running
		while(true) {
		System.out.println("------------------------------------------------------------");
		System.out.println("          Welcome to Admin Dashboard !!!");
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("             Press 1 - Add Employee");
		System.out.println("             Press 2 - View All Employee");
		System.out.println("             Press 3 - View Employee");
		System.out.println("             Press 4 - Update Employee");
		System.out.println("             Press 5 - Delete Employee ");
		System.out.println("             Press 6 - Back");
		System.out.println("------------------------------------------------");
		int choice=sc.nextInt();
			//switch case for user to select the Option
			switch(choice){
				case 1:
					EmployeeDAOImpl.addEmployee();
					break;
				case 2:
					Employee [] viewAllEmployee=EmployeeDAOImpl.viewAllEmployee();
					System.out.println("------------------------------------------------------------");
					System.out.println("          Welcome to Employee List !!!");
					System.out.println("------------------------------------------------------------");
					System.out.println("Employee ID | Employee Name | Address | Email | Salary       ");
					System.out.println("------------------------------------------------------------");
					if(viewAllEmployee!=null) {
						for(Employee emp:viewAllEmployee) {
							System.out.println("\t"+emp.getEid()+"\t"+emp.getEname()+"\t"+emp.getEadd()+"\t"+emp.getEmail()+"\t"+emp.getSalary());
						}
					}

					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					EmployeeClient.empClientApp();
					break;
				default:
					System.out.println("Enter Valid Choice Between 1-6 !!");					
			}// end of switch
		}//end while loop
	}
}
