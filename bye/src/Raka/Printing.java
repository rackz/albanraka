/**
 * 
 */
package Raka;

import java.text.DecimalFormat;
import java .util.Scanner;

/**
 *Alban Raka
 *03/11/2016
 *Printing.java 
 *This program prompts the user for the number of copies to print and then displays the price per copy and the total price for the job
 */
public class Printing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("0.00");
		
		int number;
		
		System.out.print("enter number of copies to be printed: ");
		number=sc.nextInt();
		
		if (number<99){
	    System.out.println("Price per copy is: 0.30");
	    System.out.println("your total is: " + df.format(0.30*number));
		} 
	    else if (number<499){
	    	System.out.println("price per copy is: 0.28");
	    	System.out.println("your total is; " + df.format("0.28*number"));
	    	}
		
	    else if (number<749){
	    	System.out.println("Price per copy is 0.27");
	    	System.out.println("your total is: " + df.format(0.27*number));
	    }
	    
	    else if (number<1000){
	    	System.out.println("price per copy is 0.26");
	    	System.out.println("your total is: " + df.format(0.26*number));
	    	
	    }
	    
	    else if (number<1000){
	    	System.out.println("price per copy is 0.25");
	    	System.out.println("Your total is: " + df.format(0.25));
	    }
		
	}
	
}
