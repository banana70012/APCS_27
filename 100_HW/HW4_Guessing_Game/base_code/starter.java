/*
 *	Author: AJ Conroy
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner you_had_one_job_scanner = new Scanner(System.in);
		int randomoption = (int)(Math.random()*3);
		System.out.println("The goal of this glorious game is to guess a word with two hints!(Metro Edition)");
		if(randomoption == 0){
			System.out.println("It's the line to Chatsworth!");
			System.out.print("What is your guess?: ");
			String ans = you_had_one_job_scanner.nextLine();
			if(ans.equalsIgnoreCase("g")||ans.equalsIgnoreCase("g line")){
				System.out.println("You got it!");
			}
			else{
				System.out.print("Nope, try again: ");
				ans = you_had_one_job_scanner.nextLine();
			if(ans.equalsIgnoreCase("g")||ans.equalsIgnoreCase("g line")){
				System.out.println("You got it!");
			}
			else{
				System.out.println("Nope, it was the G line!");
			}
			}
		}
		if(randomoption==1){
			System.out.print("It's the most used station in the system: ");
			String ans = you_had_one_job_scanner.nextLine();
			if(ans.equalsIgnoreCase("7th street metro center")){
				System.out.println("You got it!");
			}
			else{
				System.out.println("It's in Downtown LA");
				if(ans.equalsIgnoreCase("7th street metro center")){
				System.out.println("You got it!");
				}
				else{
					System.out.println("No, it was 7th Street Metro Center");
				}
			}
		}

		if(randomoption==2){
			System.out.print("When was the Metro opened: ");
			String ans = you_had_one_job_scanner.nextLine();
			if(ans.equalsIgnoreCase("1993")){
				System.out.println("You got it!");
			}
			else{
				System.out.println("It's in the 90's");
				if(ans.equalsIgnoreCase("1993")){
				System.out.println("You got it!");
				}
				else{
					System.out.println("No, it was in 1993");
				}
			}
		}
		
	}
}
