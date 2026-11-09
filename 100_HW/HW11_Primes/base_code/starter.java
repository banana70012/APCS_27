/*
 *	Author:AJ Conroy
 *  Date:
*/

import java.util.Scanner;


class starter {
	
	public static boolean checkPrime(int n){
		int count2 = n-1;
		while(count2>1){
			if(n%count2==0){
				return true;
			}
			count2--;
		}
		return false;
	}
	public static void printPrime(int n){
		int count = n;
		while(count>1){
			if(checkPrime(count)){
				System.out.println(count+ " is prime!");
			}
			else{
				System.out.println(count+ " is not prime!");
			}
			count--;
		}
	}
	public static void main(String args[]) {
		Scanner jimmy = new Scanner(System.in);
		System.out.print("Please input a number: ");
		printPrime(jimmy.nextInt());
	}
}
