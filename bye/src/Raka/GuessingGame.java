/**
 * 
 */
package Raka;

/**
 *Alban raka
 *GuessingGame.java
 *Guessing a number between 1 & 20
 *11/11/2016
 */

import java.util.Scanner;

public class GuessingGame {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan= new Scanner(System.in);
        
        int number;
        int CorrectGuess = (int)(Math.random()*20)+1;
        		
        System.out.println("Enter a number between 1-20: ");
        number=scan.nextInt();
        
        if (CorrectGuess == number);
        System.out.println("You won");
        
        if (number>CorrectGuess)
        	System.out.println("Better luck  next time");
        
        else
        	System.out.println("Computers number: " + CorrectGuess);
        System.out.println("Players number: " + number);
	}

}
