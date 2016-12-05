/**
 * 
 */
package raka;

/**
 *Alban Raka
 *23/11/2016
 *PowersTable.java
 *This program displays a table of powers
 */
import java.util.Scanner;

import java.text.DecimalFormat;

public class PowersTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DecimalFormat df = new DecimalFormat("0");
		Scanner scan = new Scanner(System.in);
		
		int x=1;
		
		System.out.println("X^1\tX^2\tX^3\tX^4\tX^5\t");
		for (int i=1;  i<7; i++)
		System.out.println(df.format(Math.pow(i,1)) + "\t"+df.format(Math.pow(i,2)) + "\t"+df.format(Math.pow(i,3)) + "\t"+df.format(Math.pow(i,4)) + "\t"+df.format(Math.pow(i,5)) + "\t");
		
	}

}
