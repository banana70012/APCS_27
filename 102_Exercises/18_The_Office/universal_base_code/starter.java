/*
 *	Author: AJ Conroy
 *  Date: 10/21/26
 * 	Collaborator(s): none 
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Employee dwight = new Employee(1987,"Dwight","Schrute",4416.66);
		Employee jim = new Employee(2474,"Jim","Halpert",4416.66);	
		Employee pam = new Employee(2011,"Pam","Beesly",2250);		
		Employee sammy = new Employee(4343,"Sammy","Durbas",0);
		dwight.raiseSalary(1000000);
		jim.raiseSalary(1000);
		pam.raiseSalary(10);
		sammy.raiseSalary(1);
		dwight.employeeToString();
		System.out.print("Dwight's annual Salary: $");
		System.out.println(dwight.getAnnualSalary());
		jim.employeeToString();
		System.out.print("Jim's annual Salary: $");
		System.out.println(jim.getAnnualSalary());
		pam.employeeToString();
		System.out.print("Pam's annual Salary: $");
		System.out.println(pam.getAnnualSalary());
		sammy.employeeToString();
		System.out.print("Sammy's annual Salary: $");
		System.out.println(sammy.getAnnualSalary());
	}
}
