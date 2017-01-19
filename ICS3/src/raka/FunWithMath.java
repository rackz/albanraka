/**
 * 
 */
package raka;

import java.util.Scanner;

/**
 *Alban Raka
 *FunWithMath.java
 *This program adds, subtracts, multiply, and divides two numbers
 *19/01/17
 *
 */
public class FunWithMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         System.out.println("Enter your two numbers");
         int num1 = scan.nextInt();
         int num2 = scan.nextInt();
         int chooser;
         System.out.println("What would you like to do?");
         System.out.println("If you want to add press 1");
         System.out.println("If you want to subtract press 2");
         System.out.println("If you want to multiply press 3");
         System.out.println("If you want to divide press 4");
         chooser=scan.nextInt();
         if(chooser==1){
        	 Add(num1 , num2);
         }
         else if(chooser==2){
        	 Subtract(num1 , num2);
         }
         else if(chooser==3){
        	Multiply(num1 , num2);
         }
         else{
        	 Divide(num1 , num2);
         }
 		
		
	}
    
	/**
	 * This method adds the two numbers
	 */
	public static void Add(int num1, int num2){
		int total= (num1 + num2);
		System.out.print(total);
	}
	/**
	 * This method subtracts the two numbers 
	 */
	public static void Subtract(int num1, int num2){
		int total= (num1-num2);
		System.out.print(total);
	
	}
	/**
	 * This method multiply's the two numbers
	 */
	public static void Multiply(int num1, int num2){
		int total= (num1*num2);
		System.out.print(total);
	
	}
	/**
	 * This method divides the two numbers
	 */
	public static void Divide(int num1, int num2){
		int total= (num1/num2);
		System.out.print(total);
	}
}
