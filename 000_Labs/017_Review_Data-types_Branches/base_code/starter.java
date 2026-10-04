/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner bibbityboppidyboo = new Scanner(System.in);
		System.out.print("What is your name:");
		String name = bibbityboppidyboo.nextLine();
		System.out.println("What is your role: King, Lord, or Peasant");
		String role = bibbityboppidyboo.nextLine();
		if(role.equalsIgnoreCase("king")){
			System.out.println("How generic");
		} 
		else if(role.equalsIgnoreCase("lord")){
			System.out.println("I guess thats better than choosing king!");
		}
		else if(role.equalsIgnoreCase("peasant")){
			System.out.println("So, you want a challenge!");
		}
		else{
			System.out.println("Haha you made a typo");
		}

		System.out.println("You have 20 points to spend on the following traits: Strength, Luck, Intelligence, Agility , and Charisma.");
		int points = 20;
		boolean isdumb = false;
		System.out.println("You have "+points+" left!");
		System.out.print("How many would you like to spend on Strength(0-10): ");
		int strength = bibbityboppidyboo.nextInt();
		bibbityboppidyboo.nextLine();
		if(!(strength<=points&&strength<=10&&strength>=0)){
			System.out.println("Wow, how did you put that in wrong! Your Intelligence = zero! Your strength has been assigned automatically");
			strength = 0;
			isdumb = true;
		}
		points = points-strength;
		System.out.println("You have "+points+" left!");
		System.out.print("How many would you like to spend on Luck(0-10): ");
		int luck = bibbityboppidyboo.nextInt();
		bibbityboppidyboo.nextLine();
		if(!(luck<=points&&luck<=10&&luck>=0)){
			System.out.println("Wow, how did you put that in wrong! Your Intelligence = zero! Your luck has been assigned automatically");
			luck = 0;
			isdumb = true;
		}
		points = points-luck;
		int intelligence;
		System.out.println("You have "+points+" left!");
		if(isdumb==false){
		System.out.print("How many would you like to spend on Intelligence(0-10): ");
		intelligence = bibbityboppidyboo.nextInt();
		bibbityboppidyboo.nextLine();
		if(!(intelligence<=points&&intelligence<=10&&intelligence>=0)){
			System.out.println("Wow, how did you put that in wrong! Your Intelligence = zero! Your intelligence has been assigned automatically");
			intelligence = 0;
			
		}
	}
	else{
		System.out.println("Hahaha you cannot choose your intelligence because you SUCK!");
		intelligence = 0;
	}
	points = points-intelligence;
		System.out.println("You have "+points+" left!");
		System.out.print("How many would you like to spend on Agility(0-10): ");
		int agility = bibbityboppidyboo.nextInt();
		bibbityboppidyboo.nextLine();
		if(!(agility<=points&&agility<=10&&agility>=0)){
			System.out.println("Wow, how did you put that in wrong! Your agility = zero! Your strength has been assigned automatically");
			agility = 0;
			isdumb = true;
		}
		points = points-agility;
		System.out.println("You have "+points+" left!");
		System.out.print("How many would you like to spend on Charisma(0-10): ");
		int charisma = bibbityboppidyboo.nextInt();
		bibbityboppidyboo.nextLine();
		if(!(charisma<=points&&charisma<=10&&charisma>=0)){
			System.out.println("Wow, how did you put that in wrong! Your Intelligence = zero! Your charisma has been assigned automatically");
			charisma = 0;
			isdumb = true;
		}
		points = points-charisma;

		System.out.println("----------------------------------------");
		System.out.println("You are "+role+" "+name+" of the lands");
		System.out.println("You have the following traits:");
		System.out.println("Strength: "+strength);
		System.out.println("Luck: "+luck);
		System.out.println("Intelligence: "+intelligence);
		System.out.println("Agility: "+agility);
		System.out.println("Charisma: "+charisma);
		System.out.println("Good luck on your quest!");

	}
}
