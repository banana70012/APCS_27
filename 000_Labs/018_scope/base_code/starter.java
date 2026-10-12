/*
 *	Author: AJ Conroy
 *  Date:
*/

import java.util.*;

public class starter {
    public static void main(String[] args) {
        int number = 10;
        String message = "";
        int bonus = 0;

        if (number > 5) {
            message = new String("Number is greater than 5!");
        }

        System.out.println(message);

        if (number < 20) {
            bonus = 5;
            number = number + bonus;
        }

        System.out.println("Bonus was: " + bonus);
        int x = 0;
        if (x == 0) {
            System.out.println("x is zero!");
        }
        

        number = 100;
        System.out.println("Final number: " + number);
    }
}
