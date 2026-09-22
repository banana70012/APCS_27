/*
 *	Author:AJ Conroy
 *  Date:9/20/26
 * 	Collaborator: 
 * ================================================================
 *  ITALIAN BRAINROT SHOWDOWN -- A One-Shot Battle
 *  Practice: Math.random(), Math class methods, Scanner, variables
 * ================================================================
 * The whole showdown -- training your fighter, the rival's arrival,
 * the clash, and the rizz points you walk away with -- happens in a
 * single, straight-line pass through this program. No branching, no
 * repeating, just one battle told in code.
 */

import java.util.Scanner;

public class starter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("=== ITALIAN BRAINROT SHOWDOWN ===");
        System.out.println("Somewhere in Ohio, a legendary brainrot battle is about to begin...");
        System.out.print("Name your brainrot fighter (e.g. Tralalero Tralala): ");
        String heroName = sc.nextLine();

        System.out.print("How many hours has " + heroName + " trained at the Skibidi Gym (1-10)? ");
        int trainingHours = sc.nextInt();
        sc.nextLine();
        int trainingBonus = trainingHours * 3;
        int rizzPower = (int)(Math.random()*20+10);
        int sigmaSpeed = (int)(Math.random()*20+10);
        int brainrotEnergy = (int)(Math.random()*20+5);
        

        
        System.out.print("Give " + heroName + "'s signature move a name: ");
        String moveName = sc.nextLine();
        int movePower = (int)(Math.random()*15+5);
        
        System.out.println();
        System.out.println("Suddenly, BOMBARDIRO CROCODILO descends from the sky!");
        int rivalHealth = (int)(Math.random()*70+80);
        int rivalPower = (int)(Math.random()*20+15);
        int rivalDefense = (int)(Math.random()*15+5);
       
        double heroPower = Math.sqrt(rizzPower^2+sigmaSpeed^2+brainrotEnergy^2)+movePower;

        
       
        double fateRoll = Math.random()*1.5+0.5;
        boolean maxRizz = fateRoll>1.5;
        

        int rawDamage = (int)(heroPower*fateRoll);
        int finalDamage = Math.max((rawDamage-rivalDefense),10);
       
        int rivalHealthRemaining = Math.max(rivalHealth-finalDamage,0);

       
        double rivalFuryRoll = Math.random()*0.5+1;
        int rivalDamage = (int)(rivalPower*rivalFuryRoll);
       
        int heroHealthRemaining = Math.max(100-rivalDamage,0);

       
        int basePoints = (int)(Math.random()*250+50);

        
        int damageDealt = rivalHealth-rivalHealthRemaining;
        int bonusPoints = Math.min(damageDealt,100);
        int totalRizz = basePoints+bonusPoints;
       
        System.out.println();
        System.out.println("----- BATTLE REPORT -----");
        System.out.println(heroName + "  |  trained " + trainingHours + " hours at the gym");
        
        
        
        System.out.println("  RIZZ " + rizzPower + "  SPEED " + sigmaSpeed + "  BRAINROT ENERGY " + brainrotEnergy);
        

        
        System.out.println("Signature move: " + moveName + " (power " + movePower + ")");
        
       
        
        System.out.println();
        System.out.println("BOMBARDIRO CROCODILO  |  HP " + rivalHealth + "  POWER " + rivalPower + "  DEFENSE " + rivalDefense);
        System.out.println();
        

        
        System.out.println("Fighter power rating: " + heroPower);
        System.out.println("Fate roll: " + fateRoll + "  (maximum rizz achieved? " + maxRizz + ")");
        System.out.println(heroName + " lands " + finalDamage + " damage with " + moveName + "!");
        System.out.println("Rival health remaining: " + rivalHealthRemaining);
        System.out.println();
        

        
        System.out.println("Rival fury roll: " + rivalFuryRoll);
        System.out.println("BOMBARDIRO CROCODILO deals " + rivalDamage + " damage!");
        System.out.println(heroName + "'s health remaining: " + heroHealthRemaining);
        System.out.println();
        

        
        System.out.println("----- THE RIZZ REWARD -----");
        System.out.println("Base points earned: " + basePoints);
        System.out.println("Damage bonus: " + bonusPoints);
        System.out.println("TOTAL RIZZ POINTS: " + totalRizz);
        

    }
}