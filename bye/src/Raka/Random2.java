/**
 * 
 */
package Raka;

/**
 *Alban raka
 *Random2.java
 *11/11/2016
 *rolling 2 dices one is the user and the other is the computer
 */
import java.util.Scanner;

public class Random2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner scan=new Scanner (System.in);	}
	{
	  int dice1;
	  int dice2;
	  
	  
	  dice1=(int)(Math.random()*11)+1;
	  
	  dice2=(int)(Math.random()*11)+1;
	  
	   if (dice1>dice2)
		   System.out.println(" You won ");
	   
	   else if (dice1==dice2)
	       System.out.println(" Tie ");
	   
	   else if (dice1<dice2)
		   System.out.println(" You lost ");
		   
		   	   
		   
	    
	
	          
	       
		   
  }
}