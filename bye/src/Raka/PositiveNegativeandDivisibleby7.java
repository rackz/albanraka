/**
 * 
 */
package Raka;

import java.util.Scanner;
/**
 * @author 325102069
 *
 */
public class PositiveNegativeandDivisibleby7 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int number;
		
		System.out.println("Enter a number");
		number = scan.nextInt();
		
		if (number>0)
			System.out.println("your number is a positive");
		
		else
			System.out.println("your number is a negative");
		
		if (number%7==0) {
			System.out.println("your number is divisible by 7");
		}
        
		else
			System.out.println("your number is not divisible by 7");
	}}
