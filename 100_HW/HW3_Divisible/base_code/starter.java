/*
 *	Author: AJ Conroy
 *  Date: 9/14/26
 * 	Collaborator: None
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please give the first integer: ");
		int int1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Please give the second integer: ");
		int int2 = sc.nextInt();
		sc.nextLine();

		if(int1%2==0){
			System.out.println(int1+" is divisible by 2!");
		}
		else{
			System.out.println(int1+" is not divisible by 2!");
		}
		
		if(int1%3==0){
			System.out.println(int1+" is divisible by 3!");
		}
		else{
			System.out.println(int1+" is not divisible by 3!");
		}

		if(int1%4==0){
			System.out.println(int1+" is divisible by 4!");
		}
		else{
			System.out.println(int1+" is not divisible by 4!");
		}
		
		if(int1%5==0){
			System.out.println(int1+" is divisible by 5!");
		}
		else{
			System.out.println(int1+" is not divisible by 5!");
		}
		
		System.out.println(" ");

		if(int2%2==0){
			System.out.println(int2+" is divisible by 2!");
		}
		else{
			System.out.println(int2+" is not divisible by 2!");
		}
		
		if(int2%3==0){
			System.out.println(int2+" is divisible by 3!");
		}
		else{
			System.out.println(int2+" is not divisible by 3!");
		}

		if(int2%4==0){
			System.out.println(int2+" is divisible by 4!");
		}
		else{
			System.out.println(int2+" is not divisible by 4!");
		}
		
		if(int2%5==0){
			System.out.println(int2+" is divisible by 5!");
		}
		else{
			System.out.println(int2+" is not divisible by 5!");
		}
	}
}
