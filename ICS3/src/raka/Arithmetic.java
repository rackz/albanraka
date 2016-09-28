/**
 * 
 */
package raka;

import java.util.Scanner;

/**
 * @author 325102069
 *
 */
public class Arithmetic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
       Scanner scan = new Scanner(System.in);
       int num1, num2, num3, num4, num5;
       
       System.out.println("Enter 5 numbers");
       
       num1= scan.nextInt();
       num2= scan.nextInt();
       num3= scan.nextInt();
       num4= scan.nextInt();
       num5= scan.nextInt();
       
       System.out.println("Your amount is:  " +(num1 + num2 + num3 + num4 + num5));
       System.out.println("Second number - third number is:  "+(num2 - num3));
       System.out.println("First number * Your fifth number is:  "+(num1*num5));
       System.out.println("Fourth number / by your second number is:  "+(num4/num2));
       System.out.println("Fourth number % by your second number is:  "+(num4%num2));
	}

}
