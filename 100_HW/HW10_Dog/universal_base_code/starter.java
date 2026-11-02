/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog dog1 = new Dog("cheeseburger");
		dog1.setAge(76);
		Dog dog2 = new Dog("cheeseburger smeeburger","burgerdog");
		if(dog1.isSleeping()){
			System.out.println("Sleeping");
		}
		else{
			dog1.bark();
			dog2.bark();
		}
	}
}
