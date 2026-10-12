/*
 *	Author: AJ Conroy
 *  Date: 10/9/26
 * 	Collaborator(s): none
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner john_java = new Scanner(System.in);		
		int money = 100;
		String gambleyes;
		int bet;
		int num1;
		int num2;
		int num3;
		System.out.println("Welcome to slots!");
		System.out.println("1) Each player starts with 100 dollars!");
		System.out.println("2) Put in a wager less than or equal to your total amount of money!");
		System.out.println("3) The slot machine will role 3 numbers: ");
		System.out.println("       1) If all the numbers are the same, you triple your money!");
		System.out.println("       2) If two the numbers are the same, you double your money!");
		System.out.println("       3) If none the numbers are the same, you lose your money!");

		while(money>0){
			System.out.println("You have $"+money+"!");
			System.out.print("Would you like to make a bet? : ");
			gambleyes = john_java.nextLine();
			if(gambleyes.equalsIgnoreCase("y")||gambleyes.equalsIgnoreCase("yes")){
				System.out.print("How much would you like to bet? : ");
				bet = john_java.nextInt();
				john_java.nextLine();
				if(bet>money||bet<=0){
					System.out.println("Nice try!");
					System.out.println("You are kicked out of the casino!");
					break;
				}
				num1 = (int)(Math.random()*9+1);
				num2 = (int)(Math.random()*9+1);
				num3 = (int)(Math.random()*9+1);
				System.out.println("Good luck!");
				System.out.println("Your numbers are: ");
				System.out.println("-------------------");
				System.out.println("|     |     |     |");
				System.out.println("|  "+num1+"  |  "+num2+"  |  "+num3+"  |");
				System.out.println("|     |     |     |");
				System.out.println("-------------------");

				if((num1==num2||num1==num3||num2==num3)&&!(num1==num2&&num2==num3)){
					System.out.println("You doubled your money!");
					money = money+bet*2;
				}
				else if(num1==num2&&num2==num3){
					System.out.println("You tripled your money!");
					money = money+bet*3;
				}
				else{
					System.out.println("You lost your money!");
					money = money-bet;
				}
				System.out.println(" ");
			}
			else{
				System.out.println("Wow, you chicken!");
				System.out.println("(or you typed in something wrong)");
				break;
			}
		}
		System.out.println("You left the casino with $"+money+"!");

	}
}
