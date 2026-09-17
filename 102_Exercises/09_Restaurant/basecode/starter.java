/*
 *	Author:  AJ Conroy
 *  Date: 9/14/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("What would you like to name the resturant: ");
		String resname = sc.nextLine();
		System.out.print("What is your name?: ");
		String name = sc.nextLine();
		System.out.println("----Item 1----");
		System.out.print("What is your first item?: ");
		String item1 = sc.nextLine();
		System.out.print("How much would "+item1+" cost?:");
		double item1c = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many "+item1+"s would you like?: ");
		double item1a = sc.nextDouble();
		sc.nextLine();
		System.out.println("----Item 2----");
		System.out.print("What is your second item?: ");
		String item2 = sc.nextLine();
		System.out.print("How much would "+item2+" cost?:");
		double item2c = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many "+item2+"s would you like?: ");
		double item2a = sc.nextDouble();
		sc.nextLine();
		System.out.println("----Item 3----");
		System.out.print("What is your third item?: ");
		String item3 = sc.nextLine();
		System.out.print("How much would "+item3+" cost?:");
		double item3c = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many "+item3+"s would you like?: ");
		double item3a = sc.nextDouble();
		sc.nextLine();

		System.out.print("How much would you like to tip?: ");
		double tip = sc.nextDouble();
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println(resname);
		System.out.println("Server: "+name);
		System.out.println("-----------------------------------------------");
		System.out.println("Items:               Amount:             Price:");
		System.out.println(item1+"               "+item1a+"           "+item1c);
		System.out.println(" ");
		System.out.println(item2+"               "+item2a+"           "+item2c);
		System.out.println(" ");
		System.out.println(item3+"               "+item3a+"           "+item3c);
		System.out.println("-----------------------------------------------");
		System.out.println("Subtotal: $"+(item1c+item2c+item3c));
		System.out.println("Tip: "+tip+"%");
		System.out.println("Tax = 9.00%");
		System.out.println("Grand total: $"+((item1c+item2c+item3c)+((item1c+item2c+item3c)*(tip/100))+((item1c+item2c+item3c)*(0.09))));
	}
}
