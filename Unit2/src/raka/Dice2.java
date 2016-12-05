/**
 * 
 */
package raka;

/**
 *Alban Raka
 *16/11/2016
 *Dice2.java
 *Roll 2 dices one is the user the other is the computer until you want to end
 */

import java.util.Scanner;

public class Dice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan= new Scanner(System.in);
		
        int count= 0;
		while (count<2){
		int dice1= (int)(Math.random()*11)+2;
		int dice2= (int)(Math.random()*11)+2;
		  
		  dice1=(int)(Math.random()*11)+1;
		  
		  dice2=(int)(Math.random()*11)+1;
		  
		   if (dice1>dice2)
			   System.out.println(" You won ");
		   
		   else if (dice1==dice2)
		       System.out.println(" Tie ");
		   
		   else if (dice1<dice2)
			   System.out.println(" You lost ");
		   
		   System.out.println("Would you like to play again");
		           String maybe=scan.next();
		           if (maybe.equals("yes")){
	}
		           else{
		        	   count = 2;
		                	           
		           }
}
	}
}