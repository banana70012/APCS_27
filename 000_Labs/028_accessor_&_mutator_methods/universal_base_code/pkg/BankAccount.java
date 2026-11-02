/*
 *	Author:  Ato theJ Conroy
 *  Date: 
*/

package pkg;
import java.util.*;
import java.util.Random;
public class BankAccount {
	private String name;
	private double balence;
	private int accountnumber = (int)(Math.random()*501+50);	
	private boolean canopen = true;
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
	public BankAccount(String n, double b){
		name = n;
		balence = b;
		accountnumber++;
	}
	public void setOwner(String n){
		name = n;
	}
	public void deposit(double d){
		if(canopen){
			balence = balence+d;
		}
		else{
			System.out.println("You cannot deposit, this account is closed!");
		}
	}
	public String getOwner(){
		return name;
	}
	public double getBalance(){
		return balence;
	}
	public void withdraw(double d){
		if(canopen){
			if(balence-d<=balence){
				balence=balence-d;
			}
			else{
				System.out.println("You do not have enough money!");
			}
		}
		else{
			System.out.println("You cannot withdraw, this account is closed!");
		}
	}
	public void closeAccount(){
		System.out.println(name+"'s account is now closed!");
		canopen = false;
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