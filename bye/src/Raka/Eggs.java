/**
 * 
 */
package Raka;

import java.util.Scanner;

import java.text.DecimalFormat;
/**
 *Alban Raka
 *03/11/2016
 *Eggs.java
 *
 */
public class Eggs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat ("0.00");

		double egg;

		System.out.println("Enter the number of copies:");egg = scan.nextDouble();
		egg = egg/12;



		if (egg >=11){
			System.out.println("Price per dozen eggs is: $0.35");
			System.out.println("Your total is: " +(df.format(0.35*egg)));
		}
		else if (egg >=6){;
			System.out.println("Price per dozen eggs is: $0.40");
			System.out.println("Your total is: " +(df.format(0.40*egg)));
		}
		else if (egg >=4){
			System.out.println("Price per dozen eggs is: $0.45");
			System.out.println("Your total is: " +(df.format(0.45*egg)));
		}
		else {
			System.out.println("Price per dozen eggs is: $0.50");
			System.out.println("Your total is: " +(df.format(0.50*egg)));

		}}}
