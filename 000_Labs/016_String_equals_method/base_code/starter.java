/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner the_bestest_scanner_of_all = new Scanner(System.in);
		System.out.println("Would you like to be a silly sigma, dummy, or smart?");
		String that_thing_I_am_supposed_to_get_from_the_user_which_would_aid_in_the_completion_of_this_assignment = the_bestest_scanner_of_all.nextLine();
		if(that_thing_I_am_supposed_to_get_from_the_user_which_would_aid_in_the_completion_of_this_assignment.equalsIgnoreCase("dummy")){
			System.out.println("Wow, you really are dumb 🤯");
		}
		else if(that_thing_I_am_supposed_to_get_from_the_user_which_would_aid_in_the_completion_of_this_assignment.equalsIgnoreCase("silly sigma")){
			System.out.println("Stop!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		else if(that_thing_I_am_supposed_to_get_from_the_user_which_would_aid_in_the_completion_of_this_assignment.equalsIgnoreCase("Smart")){
			System.out.println("Only a dummy would chose that option!");
		}
		else{
			System.out.println("How did you manage to type in something wrong you dummy!!!!!!!!!!! 😡😡😡😡😡😡");
		}
	}
}
