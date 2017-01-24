/**
 * 
 */
package raka;

import java.util.Scanner;
import hsa_new.Console;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/**
 *
 *
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import hsa_new.Console;

import java.util.Scanner;

public class ISUproject {
	static Console c = new Console();

	/**
	 * ICS3U
	 *Alban Raka
	 *ISUproject.java
	 *24/01/2017
	 *This program tests your knowledge on fitness
	 */
	
	
	/**
	 * This method will display the rules
	 */
	public static void rules1(){
		c.println("Welcome to the fitness quiz");
		c.println("1.No searching for answers on google.");
		c.println("2.Keep your eyes on your own screen");	
		c.println("3.Read each question carefully");	
		c.println("4.To answer a question type the letter you think is correct");	
		c.println("5.You must get 10 out of 15 correct to pass");
	}
		
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		rules1();
		Thread.sleep(8000);
        c.clear();
        
        
		String[][] questions = new String[6][15];
		questions[0][0] = "What does chest press work?";
		questions[0][1] = "What is a healthy meal after a workout?";
		questions[0][2] = "What does lat pull down work?";
		questions[0][3] = "What does leg curl work?";
		questions[0][4] = "What does Incline press work?";
		questions[0][5] = "What is a non healthy meal?";
		questions[0][6] = "What does the 12 minute run work?";
		questions[0][7] = "What does push ups work?";
		questions[0][8] = "How much hours of sleep should you get a day?";
		questions[0][9] = "What does leg press work?";
		questions[0][10] = "What does dunbell press work?";
		questions[0][11] = "What does preachers curl work?";
		questions[0][12] = "Smoking cigarretts every day can cause?";
		questions[0][13] = "How much calories should a 16 year old male consume a day?";
		questions[0][14] = "What do crunches work?";
		questions[1][0] = "a)Biceps";
		questions[2][0] = "b)Abs";
		questions[3][0] = "c)Chest";
		questions[4][0] = "d)Calves";
		questions[5][0] = "c";
		questions[1][1] = "a)Hamburger";
		questions[2][1] = "b)Pizza";
		questions[3][1] = "c)Salad";
		questions[4][1] = "d)Ice cream";
		questions[5][1] = "c";
		questions[1][2] = "a)Back";
		questions[2][2] = "b)Chest";
		questions[3][2] = "c)Calves";
		questions[4][2] = "d)triceps";
		questions[5][2] = "a";
		questions[1][3] = "a)biceps";
		questions[2][3] = "b)hamstring";
		questions[3][3] = "c)Calves";
		questions[4][3] = "d)Back";
		questions[5][3] = "b";
		questions[1][4] = "a)Abs";
		questions[2][4] = "b)Chest";
		questions[3][4] = "c)Calves";
		questions[4][4] = "d)Back";
		questions[5][4] = "d";
		questions[1][5] = "a)Pizza";
		questions[2][5] = "b)Salad";
		questions[3][5] = "c)Chicken";
		questions[4][5] = "d)Eggs";
		questions[5][5] = "a";
		questions[1][6] = "a)cardio";
		questions[2][6] = "b)Flexibility";
		questions[3][6] = "c)Muscular indurcance";
		questions[4][6] = "d)Blood pressure";
		questions[5][6] = "a";
		questions[1][7] = "a)Flexibility";
		questions[2][7] = "b)Muscular indurance";
		questions[3][7] = "c)Cardio";
		questions[4][7] = "d)Cavles";
		questions[5][7] = "b";
		questions[1][8] = "a)8 hours";
		questions[2][8] = "b)5 hours";
		questions[3][8] = "c)12 hours";
		questions[4][8] = "d)24 hours";
		questions[5][8] = "a";
		questions[1][9] = "a)Calves";
		questions[2][9] = "b)Quads";
		questions[3][9] = "c)Gluteals";
		questions[4][9] = "d)Biceps";
		questions[5][9] = "b";
		questions[1][10] = "a)Abs";
		questions[2][10] = "b)Chest";
		questions[3][10] = "c)Calves";
		questions[4][10] = "d)triceps";
		questions[5][10] = "d";
		questions[1][11] = "a)biceps";
		questions[2][11] = "b)triceps";
		questions[3][11] = "c)Back";
		questions[4][11] = "d)Shoulders";
		questions[5][11] = "a";
		questions[1][12] = "a)Heart attacks";
		questions[2][12] = "b)Lung cancer";
		questions[3][12] = "c)Artheritist";
		questions[4][12] = "d)Muscle strength";
		questions[5][12] = "b";
		questions[1][13] = "a)2,400 to 3,200";
		questions[2][13] = "b)1,800 to 2,000";
		questions[3][13] = "c)4,000 to 6,000";
		questions[4][13] = "d)3,000 to 4,500";
		questions[5][13] = "a";
		questions[1][14] = "a)biceps";
		questions[2][14] = "b)triceps";
		questions[3][14] = "c)Back";
		questions[4][14] = "d)Abs";
		questions[5][14] = "d";

		String showResults = "";
		int score = 0;
		do {
			for (int i = 0; i < 15; i++) {
				if (printQuestion(questions, i) == true) {
					c.println("Correct");
					score=score+1;
				}
				else
						c.println("Wrong");
				}
			}
		 while (showResults.equals(score));
		c.println((score/15)*100);
	}

	public static boolean printQuestion(String[][] questions, int quesNum) {
		c.println(questions[0][quesNum]);
        c.println(questions[1][quesNum]);
        c.println(questions[2][quesNum]);
        c.println(questions[3][quesNum]);
        c.println(questions[4][quesNum]);
		String answer = c.readLine();
		if (answer.equals(questions[5][quesNum]))
			return true;
		else 
			return false;

	}

}
