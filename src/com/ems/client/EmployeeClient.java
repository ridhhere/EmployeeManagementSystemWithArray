package com.ems.client;

import java.util.Scanner;

import com.ems.details.AdminDetails;
import com.ems.details.EmployeeDetails;

public class EmployeeClient {
	
	public static void empClientApp() {
		Scanner sc = new Scanner(System.in);
		AdminDetails adminDetails=new AdminDetails();
		EmployeeDetails employeeDetails=new EmployeeDetails();
		//while loop to keep app running
		while(true) {
		System.out.println("------------------------------------------------------------");
		System.out.println("          Welcome to Employee Management System!!!");
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("             Press 1 - Admin");
		System.out.println("             Press 2 - Register");
		System.out.println("             Press 3 - Employee");
		System.out.println("--------------------------------------------");
		int choice=sc.nextInt();
			//switch case for user to select the Option
			switch(choice){
				case 1:
					adminDetails.adminMenu();
					break;
				case 2:
					break;
				case 3:
					employeeDetails.empMenu();
					break;
				default:
					System.out.println("Enter Valid Choice Between 1-3 !!");					
			}// end of switch
		}//end while loop
	}//end main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empClientApp();
	}

}
