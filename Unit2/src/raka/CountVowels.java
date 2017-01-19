/**
 * 
 */
package raka;

/**
 *Alban Raka
 *06/12/2016
 *CountVowels.java
 *This program counts the vowels when you write a statement
 */

import java.util.Scanner;

public class CountVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);	
        
		int vowel=0;
		String sentence;

        System.out.println("Enter sentence: ");
		sentence=scan.nextLine();


		for (int i = 1; i < sentence.length(); i++){
			if   (sentence.charAt(i) == 'a') 
				vowel++;
			else if(sentence.charAt(i) == 'e') 
				vowel++;
			else if(sentence.charAt(i)=='i')
				vowel++;
			else if(sentence.charAt(i)=='o')
				vowel++;
			else if(sentence.charAt(i)=='u')      
				vowel++;

		}
		System.out.println("The number of vowels in java programming assignment is: " +vowel+".");


			

		}

	
	}


