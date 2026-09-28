/*
 *	Author: AJ Conroy
 *  Date: 9/24/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner that_thing_that_i_am_supposed_to_obtain_from_the_user = new Scanner(System.in);
		System.out.println("PICK A INT NOW!!!!!!!!!!!!!!!!!!! (1-1000): ");
		int	number = that_thing_that_i_am_supposed_to_obtain_from_the_user.nextInt();
		int random = (int)(Math.random()*1001);
		if(number == random){
			System.out.println("YOU CHEAT! YOU GOT IT!");
		}
		else{
			System.out.println("Haha LOL you didnt get it. The number was "+random+" you dummy!");
		}
	}
}
