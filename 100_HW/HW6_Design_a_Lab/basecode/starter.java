/*
 *	Author:AJ Conroy
 *  Date:10/4/26
 * 	Collaborator:none
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        Scanner i_like_cheeseburgers_and_fries = new Scanner(System.in);
        System.out.print("Which head style do you want(1-3): ");
        int head = i_like_cheeseburgers_and_fries.nextInt();
        i_like_cheeseburgers_and_fries.nextLine();
        System.out.print("Which torso style do you want(1-3): ");
        int torso = i_like_cheeseburgers_and_fries.nextInt();
        i_like_cheeseburgers_and_fries.nextLine();
        System.out.print("Which leg style do you want(1-3): ");
        int leg = i_like_cheeseburgers_and_fries.nextInt();
        i_like_cheeseburgers_and_fries.nextLine();
        
        if(head==1){
        System.out.println("________________");
        System.out.println("|    0      0   |");
        System.out.println("|       _       |");
        System.out.println("________________");
        }
        else if(head==2){
        System.out.println("________________");
        System.out.println("|    👁️    👁️  |");
        System.out.println("|       👄      |");
        System.out.println("________________");
        }
        else if(head==3){
        System.out.println("________________");
        System.out.println("|               |");
        System.out.println("|               |");
        System.out.println("________________");
        }
        else{
        System.out.println("N/A");
        }
        
        if(torso==1){
        System.out.println("  ___________");
        System.out.println("__|         |___");
        System.out.println("  |         |");
        System.out.println("  ___________");
        }
        else if(torso==2){
        System.out.println("        |");
        System.out.println("    |___|___|");
        System.out.println("        |");
        System.out.println("        |");
        }
        else if(torso==3){
        System.out.println("        👕");
        }
        else{
        System.out.println("N/A");
        }

        if(leg==1){
        System.out.println(" _         _");
        System.out.println("| |       | |");
        System.out.println("| |       | |");
        System.out.println("|_|       |_|");
        }
        else if(leg==2){
        System.out.println(" |         |");
        System.out.println(" |         |");
        System.out.println(" |         |");
        System.out.println(" |         |");
        }
        else if(leg==3){
        System.out.println(" 🦵        🦵");
        }
        else{
        System.out.println("N/A");
        }
    }
}
