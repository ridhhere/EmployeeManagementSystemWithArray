package com.ems.details;

import java.util.Scanner;

import com.ems.client.EmployeeClient;

public class EmployeeDetails {
	public void empMenu() {
		Scanner sc = new Scanner(System.in);
		//while loop to keep app running
		while(true) {
		System.out.println("------------------------------------------------------------");
		System.out.println("          Welcome to Employee Dashboard !!!");
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("             Press 1 - View All Employee");
		System.out.println("             Press 2 - View Employee");
		System.out.println("             Press 3 - Update Employee");
		System.out.println("             Press 4 - Back");
		System.out.println("------------------------------------------------");
		int choice=sc.nextInt();
			//switch case for user to select the Option
			switch(choice){
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					EmployeeClient.empClientApp();
					break;
				default:
					System.out.println("Enter Valid Choice Between 1-4 !!");					
			}// end of switch
		}//end while loop
	}
}
