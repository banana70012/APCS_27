/*
 *	Author:  Ato theJ Conroy
 *  Date: 
*/

package pkg;
import java.util.*;
import java.util.Random;
public class BankAccount {
	private String name;
	private int balence;
	private int accountnumber = (int)(Math.random()*501+50);	
	public BankAccount(){
		name = "Not Provided";
		balence = 0;
		accountnumber++;
	}
	public BankAccount(String n){
		name = n;
		balence = 0;
		accountnumber++;
	}
	public BankAccount(String n, int b){
		name = n;
		balence = b;
		accountnumber++;
	}
	public void checkBalance(){
		System.out.println("___________________________________________");
		System.out.println("Your current balence is $"+balence+".");
		System.out.println("___________________________________________");
	}
	public void displayAccountInfo(){
		System.out.println("___________________________________________");
		System.out.println("Hello "+name+".");
		System.out.println("Your account number is "+accountnumber+"!");
		System.out.println("Your current balence is $"+balence+".");
		System.out.println("___________________________________________");
	}

}