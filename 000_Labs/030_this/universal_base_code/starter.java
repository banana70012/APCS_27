/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		int dupes = 0;
		int count = 1;
		
		PooleDwarf d1 = new PooleDwarf(randName(),(int)(Math.random()+1*99));
		PooleDwarf d2 = new PooleDwarf(randName(),(int)(Math.random()+1*99));
		PooleDwarf d3 = new PooleDwarf(randName(),(int)(Math.random()+1*99));
		PooleDwarf d4 = new PooleDwarf(randName(),(int)(Math.random()+1*99));
		PooleDwarf d5 = new PooleDwarf(randName(),(int)(Math.random()+1*99));
		PooleDwarf d6 = new PooleDwarf(randName(),(int)(Math.random()+1*99));
		PooleDwarf d7 = new PooleDwarf(randName(),(int)(Math.random()+1*99));
		if(d1.isSameName(d2.getName())){
			dupes++;
		}
		if(d1.isSameName(d3.getName())){
			dupes++;
		}
		if(d1.isSameName(d4.getName())){
			dupes++;
		}
		if(d1.isSameName(d5.getName())){
			dupes++;
		}
		if(d1.isSameName(d6.getName())){
			dupes++;
		}
		if(d1.isSameName(d7.getName())){
			dupes++;
		}

		System.out.println(dupes+" dwarfs had the name "+d1.getName());
	}
}
