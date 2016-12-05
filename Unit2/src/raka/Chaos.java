/**
 * 
 */
package raka;

/**
 *Alban Raka
 *01/12/2016
 *Chaos.java
 *This program prompts the user for a starting value and then performs this experiment
 */

import java.util.Scanner;

public class Chaos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner (System.in);
        
        Double sum;
        
        System.out.print("Enter any number");
        
        sum = scan.nextDouble();
        
        for(int i=0; i<50; i++){
        sum = 2* sum *(1 - sum);
        System.out.println(sum);
        }
	}

}
