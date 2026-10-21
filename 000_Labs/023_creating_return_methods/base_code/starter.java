/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int That_mathpow_rip_off_that_I_am_supposed_to_program_for_credit(int dafirstone, int dasecondone){
		int count = 1;
		int ans = 0;
		while(dasecondone!=count){
			ans = ans+dafirstone*dafirstone;
			count++;
			
		}
		return ans;
	}
	public static void main(String args[]) {
	Scanner APCS_27_000_Labs_023_creating_return_methods_base_code_starter_java_I_am_losing_my_sanity = new Scanner(System.in);
	System.out.print("Please input the first number:");
	int uno = APCS_27_000_Labs_023_creating_return_methods_base_code_starter_java_I_am_losing_my_sanity.nextInt();
	APCS_27_000_Labs_023_creating_return_methods_base_code_starter_java_I_am_losing_my_sanity.nextLine();
	System.out.print("Please input the second number:");
	int dos = APCS_27_000_Labs_023_creating_return_methods_base_code_starter_java_I_am_losing_my_sanity.nextInt();
	System.out.println("The first number to the power of the second one is: "+That_mathpow_rip_off_that_I_am_supposed_to_program_for_credit(uno, dos));

		
	}
}
