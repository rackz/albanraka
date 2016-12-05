/**
 * 
 */
package raka;

import java.util.Scanner;

/**
 *Alban Raka
 *23/11/2016
 *GuessingGame2.java
 *User chooses a number then the computer checks if it matchs the random number and loops again if you lose and stops until you win
 */
public class GuessingGame2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan= new Scanner(System.in);
	        
	        int number;
	        int CorrectGuess = (int)(Math.random()*20)+1;
	        int counter;
	        counter= 0;
	        System.out.println("Enter a number between 1-20: ");
	        number=scan.nextInt();
	        
	  
	        
	        if (CorrectGuess == number);
	        System.out.println("You won");
	        
	        if (number!=CorrectGuess)
	        	System.out.println("Better luck  next time");
	        else
	        	System.out.println("Computers number: " + CorrectGuess);
	        
	        System.out.println("Players number: " + number);
	}

}
