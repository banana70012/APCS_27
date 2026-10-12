/*
 *	Author:  AJ
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner Sammy_is_a_big_dumb_idiot = new Scanner(System.in);
		System.out.print("Please input a name: ");
		String name = Sammy_is_a_big_dumb_idiot.nextLine();
		System.out.print("How many times should this be repeated: ");
		int repeat = Sammy_is_a_big_dumb_idiot.nextInt();
		Sammy_is_a_big_dumb_idiot.nextLine();
		int count = 0;
		while(count!=repeat){
			System.out.println(name);
			count++;
		}
		
	}
}
