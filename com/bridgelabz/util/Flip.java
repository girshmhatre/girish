/******************************************************************************
 *  
 *  Purpose: A Coin Flip and Print Head or Tails.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class Flip{

  public static void main(String arg[]){
	
	// n variable stores the number entered by the user as the input
	int time = Integer.parseInt(arg[0]);  
	int count1 = 0;
	int count2 = 0;
	
	for(int i = 0 ; i < time ; i++){
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
		double head = (count1 * 100) / n;
		double tail = (count2 * 100) / n;
		System.out.println(head+"% vs "+tail+"%");
	}
}
