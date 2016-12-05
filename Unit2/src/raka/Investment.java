/**
 * 
 */
package raka;

/**
 *Alban Raka
 *15/11/2016
 *Investment.java
 *This program calculates the amount of years that it will take for a $2500 investment to be worth at least $5000 if compounded annually at 7.5%
 */

import java.util.Scanner;

public class Investment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
		int Invest = 2500;
		int finalInvest = 5000;
		double currentInvest = Invest;
		
		
		double years = 1;
		
		while (currentInvest<=finalInvest){
		years = years + 1;
		currentInvest = currentInvest * 1.075;
		}
	    System.out.println("It'll take you " + (int) years + " years");
	}

}
