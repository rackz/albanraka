/**
 * 
 */
package Raka;

/**
 *Alban raka
 *RandomGenerator.java
 *Generating random numbers from the congruetial method
 *11/11/2016
 */

import java.util.Scanner;

public class RandomGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scan = new Scanner(System.in);
		
		int X0=12;
		
		final int a=1246;
		final int c=456;
		final int m=50;
		
		int X1;
		int X2;
		int X3;
		int X4;
		int X5;
		int X6;
		int X7;
		int X8;
		int X9;
		int X10;
		
		X1=(a*X0+c)%m;
		X2=(a*X1+c)%m;
		X3=(a*X2+c)%m;
		X4=(a*X3+c)%m;
		X5=(a*X4+c)%m;
		X6=(a*X5+c)%m;
		X7=(a*X6+c)%m;
		X8=(a*X7+c)%m;
		X9=(a*X8+c)%m;
		X10=(a*X9+c)%m;
		
		System.out.println(X1);
		System.out.println(X2);
		System.out.println(X3);
		System.out.println(X4);
		System.out.println(X5);
		System.out.println(X6);
		System.out.println(X7);
		System.out.println(X8);
		System.out.println(X9);
		System.out.println(X10);
		
	}

}
