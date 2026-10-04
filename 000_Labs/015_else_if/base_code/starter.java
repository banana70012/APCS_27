/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner this_scanner_is_made_to_have_one_job_and_one_job_only = new Scanner(System.in);
		int the_number_that_everyone_trusted = (int)(Math.random()*1000+1);
		System.out.print("Please input a number (1-1000): ");
		int the_number_that_stinks = this_scanner_is_made_to_have_one_job_and_one_job_only.nextInt();
		this_scanner_is_made_to_have_one_job_and_one_job_only.nextLine();
		if(the_number_that_stinks == the_number_that_everyone_trusted){
			System.out.println("Wow you guessed the number correctly");
		}
		else if(the_number_that_everyone_trusted>the_number_that_stinks){
			System.out.println("Your guess was less than the number which was "+the_number_that_everyone_trusted);
		}
		else if(the_number_that_everyone_trusted<the_number_that_stinks){
			System.out.println("Your guess was more than the number which was "+the_number_that_everyone_trusted);
		}
		
	}
}
