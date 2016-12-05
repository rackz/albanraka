/**
 * 
 */
package raka;

/**
 *Alban Raka
 *24/11/2016
 *ElapsedTimeCalculator.java
 *This program checks how much time has passed by
 */

import java.util.Scanner;

import java.text.DecimalFormat;

public class ElapsedTimeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
        int h;
        int e;
        String time;
        double price = 0.00;
        
        DecimalFormat df = new DecimalFormat ("0");
        
        System.out.println("Enter your starting hour");
        h = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter if it is am or pm");
        time = scan.nextLine();
        
        System.out.println("Enter the number of elapsed hours");
        e = scan.nextInt();
        
        if (h+e >=12){
            System.out.println("The time is: " + (h +e - 12) + time);}
        
        else if(h+e <=12){
            System.out.println("The time is: " + (h + e + 12) + time);
	}

}}
