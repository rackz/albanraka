/**
 * 
 */
package raka;

/**
 *Alban Raka
 *01/12/2016
 *RemoveString.java
 *This program prompts the user for a sentence and a string
 */

import java.util.Scanner;

public class RemoveString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
		
		String sentence;
		String text;
		
		System.out.print("Enter a sentence:");
		sentence=scan.nextLine();
		
		System.out.print("Enter a string:");
		text=scan.nextLine();
		
		System.out.print(sentence.replace(text, ""));
		scan.close();
	}

}
