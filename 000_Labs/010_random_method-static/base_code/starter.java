/*
 *	Author:  AJ Conroy
 *  Date: 9/15/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("A int between 0 - 9: "+ (int)(Math.random()*10));
		System.out.println("A int between 0 - 100: "+ (int)(Math.random()*101));
		System.out.println("A double between 2.5 - 3.5: "+ (Math.random()+2.5));
		System.out.println("A double between 14 - 589: "+ (Math.random()*575+14));

	}
}
