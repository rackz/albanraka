/**
 * 
 */
package raka;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *Alban raka
 *order.java
 *12/10/2016
 *Order application that prompts the employee
 */
public class order {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        DecimalFormat df= new DecimalFormat ("0.00");
        double priceofburger = 1.69;
        double priceoffries = 1.09;
        double priceofsoda = 0.99;
        
        int numberofburgers;
        int numberoffries;
        int numberofsoda;
        
        double amounttendered;
        double change;
        double finaltotal;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of burgers:");
        numberofburgers= scan.nextInt();
         System.out.println("Enter the number of fries:");
         numberoffries= scan.nextInt();
         System.out.println("Enter the number of soda:");
         numberofsoda= scan.nextInt();
       
        System.out.println("Total before tax:" + (df.format(priceofburger* numberofburgers + priceoffries*numberoffries + priceofsoda*numberofsoda)));
        
        double tax = (priceofburger* numberofburgers + priceoffries*numberoffries + priceofsoda*numberofsoda) * 0.065;
       
        System.out.println("Tax:" + (df.format( tax)));  
        
        System.out.println("Final total=" + (df.format(priceofburger* numberofburgers + priceoffries*numberoffries + priceofsoda*numberofsoda*tax)));
        finaltotal= (priceofburger* numberofburgers + priceoffries*numberoffries + priceofsoda*numberofsoda*tax);
        
        System.out.println("Enter amount tendered");
        amounttendered = scan.nextInt();
        
        System.out.println("change $" + (df.format(amounttendered - finaltotal)));
       
	}

}
