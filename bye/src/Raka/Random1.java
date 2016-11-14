/**
 * 
 */
package Raka;

/**
 *Alban Raka
 *14/11/2016
 *Random1.java
 *Ask the user for there name, 70% of the time its there favourite name and 30% of the time it is not
 */
import java.util.Scanner;

public class Random1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner scan=new Scanner(System.in);
		
		
		int x = (int) (Math.random() *100)+1;
		System.out.print("Enter a name");
		String name=scan.nextLine();
		if (x<=29)
			System.out.println(name+" is not your favourite name ");
		
		else if (x>=30)
			System.out.println(name+" is your favourite name ");
		
	}

}
