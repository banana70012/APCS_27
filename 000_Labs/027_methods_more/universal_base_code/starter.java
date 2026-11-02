/*
 *	Author:  Ato theJ Conroy
 *  Date: 22/10/26
*/

import pkg.*;
import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String name;
		Scanner scannerscannerscannerscannerscannerscannerscannerscannerscannerscanner = new Scanner(System.in);
		System.out.println("Welcome to the Scam.T.M! Please give us all your money!");
		System.out.println("Please create an STM account! What info do we need?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Name");
		System.out.println("3 - Name and Intitial Deposit(Recommended)");
		int ans = scannerscannerscannerscannerscannerscannerscannerscannerscannerscanner.nextInt();
		scannerscannerscannerscannerscannerscannerscannerscannerscannerscanner.nextLine();
		BankAccount jimmy;
		if(ans==1){
			System.out.println("Fine");
			jimmy = new BankAccount();
		}
		else if(ans==2){
			System.out.println("Please input your name: ");
			name = scannerscannerscannerscannerscannerscannerscannerscannerscannerscanner.nextLine();
			jimmy = new BankAccount(name);
			
		}
		else{
			System.out.println("Please input your name: ");
			name = scannerscannerscannerscannerscannerscannerscannerscannerscannerscanner.nextLine();
			System.out.println("Please input your intitial deposit(recomended =>$1,000,000,000): ");
			int intitial = scannerscannerscannerscannerscannerscannerscannerscannerscannerscanner.nextInt();
			scannerscannerscannerscannerscannerscannerscannerscannerscannerscanner.nextLine();
			jimmy = new BankAccount(name,intitial);
		}
		System.out.println("Would you like to see your account balence?(y/n): ");
		String ans2 = scannerscannerscannerscannerscannerscannerscannerscannerscannerscanner.nextLine();
		if(ans2.equalsIgnoreCase("y")){
			jimmy.checkBalance();
		}
		else{
			System.out.println("Alright fine!");
		}
		System.out.println("Would you like to see your account information?(y/n): ");
		ans2 = scannerscannerscannerscannerscannerscannerscannerscannerscannerscanner.nextLine();
		if(ans2.equalsIgnoreCase("y")){
			jimmy.displayAccountInfo();
		}
		else{
			System.out.println("Alright fine!");
		}
		System.out.println("Thank you for using the STM!");
		
	}
}
