/**
 * 
 */
package raka;

/**
 *Alban Raka
 *15/11/2016
 *PrimeFactors.java
 *This program displays a PrimeFactors application that prompts the user for a positive integer and then displays that integers prime factors
 */
import java.util.Scanner;

public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		double number;


		System.out.print("Enter number");
		number=scan.nextInt();

		int count= 2;

		while (count<= number){

			if (number%count==0){
				System.out.println(count);
				number=number/count;
			}
			else
				count= count+1;
		}

	}
}