/**
 * 
 */
package raka;

import java.text.DecimalFormat;

import java.util.Scanner;

/**
 *Alban Raka
 *25/10/2016
 *project.java
 *time taken for a java project
 */
public class project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        
		Scanner scan= new Scanner(System.in);
		
		DecimalFormat df= new DecimalFormat ("0.00");
		
		
		double designing;
		double coding;
		double debugging;
		double testing;
		double time;
		
		
		
		System.out.print("How many hours do you spend designing: ");
		designing=scan.nextDouble();
		System.out.print("How many hours do you spend coding: ");
		coding=scan.nextDouble();
		System.out.print("How many hours do you spend debugging: ");
		debugging=scan.nextDouble();
		System.out.print("How many hours do you spend testing: ");
		testing=scan.nextDouble();
		System.out.format("\n");
		
		
		time = ( designing + coding + debugging + testing);
	} 

}
