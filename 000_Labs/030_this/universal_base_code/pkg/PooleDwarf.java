/*
 *	Author:  AJ Conroy
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name = name;
		this.age = age;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return this.age;
	}

	/*	Mutator Methods	*/
	public void setName(String nane){
		this.name=name;
	}
	
	public void setAge(int age){
		this.age = age;
	}

	public boolean isSameName(String name){
		return this.name.equalsIgnoreCase(name);
	}
}

