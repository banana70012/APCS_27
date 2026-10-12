/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner S_Dawg = new Scanner(System.in);
	int randomnum = (int)(Math.random()*1000+1);
	int guess = 0;
	while(guess!=randomnum){
		
		System.out.print("Please input an int(1-1000) to guess: ");
		guess = S_Dawg.nextInt();
		S_Dawg.nextLine();
		if(guess>randomnum){
			System.out.println("lower");
		}
		else if(guess<randomnum){
			System.out.println("higher");
		}
		else{

		}
		System.out.println(" ");
	}
	System.out.println("You got it!");


		
	}
}
