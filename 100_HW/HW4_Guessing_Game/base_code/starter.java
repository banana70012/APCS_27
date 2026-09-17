/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int randomoption = (int)(Math.random()*4);
		String ans = "";
		System.out.println("The goal of this glorious game is to guess a word with two hints!(Metro Edition)");
		if(randomoption == 1){
			System.out.println("It's the line to Chatsworth!");
			System.out.print("What is your guess?: ");
			ans = input.nextLine();
			if(ans.equalsIgnoreCase("g")||ans.equalsIgnoreCase("g line")){
				System.out.println("You got it!");
			}
			else{
				System.out.print("Nope, try again: ");
				ans = input.nextLine();
			if(ans.equalsIgnoreCase("g")||ans.equalsIgnoreCase("g line")){
				System.out.println("You got it!");
			}
			else{
				System.out.println("Nope, it was the G line!");
			}
			}
		}

		
	}
}
