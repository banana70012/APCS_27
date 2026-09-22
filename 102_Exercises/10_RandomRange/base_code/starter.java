/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please give the first number: ");
	int one = sc.nextInt();
	sc.nextLine();
	System.out.print("Please give the second number: ");
	int two = sc.nextInt();
	sc.nextLine();
	System.out.println("Here are 5 numbers printed in that range:");
	System.out.println((int)(Math.random()*(two-one)+one)+", "+(int)(Math.random()*(two-one)+one)+", "+(int)(Math.random()*(two-one)+one)+", "+(int)(Math.random()*(two-one)+one)+", "+(int)(Math.random()*(two-one)+one));
	}
}
