/******************************************************************************
 *  
 *  Purpose: a coin flip and print out Head or Tails.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class Flip{

  public static void main(String arg[]){
	
	// n variable stores the number entered by the user as the input
	int n = Integer.parseInt(arg[0]);  
	int count1 = 0;
	int count2 = 0;
	
			for(int i = 0 ; i < n ; i++){
			//Math.random()return a value between 0.0 and 1.0
			System.out.println(Math.random());
			//if randome value is less than 0.5 then print head and cunt1 increase
			if(Math.random() < 0.5){
				System.out.println("Head");
				count1++;
			}
			// randome value is greater than 0.5 then print tail and count2 increase
			else {
				System.out.println("tail");
				count2++;
			}
		} 
		//claculat the percentage of Heads vs Tails
		System.out.println(count1);
		double head = (count1 / n) * 100;
		double tail = (count2 / n) * 100;
		System.out.println(head+"% vs "+tail+"%");
	}
}