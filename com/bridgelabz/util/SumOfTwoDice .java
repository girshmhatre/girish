/******************************************************************************
 *  
 *  Purpose: Print the Sum of Two Dice.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

class SumOfTwoDice { 

    public static void main(String[] args) {
        int SIDES = 6;
        int Die1 = 1 + (int) (Math.random() * SIDES);//The number on the first Die
        int Die2 = 1 + (int) (Math.random() * SIDES);//The number on the second Die
		
        int sum = Die1 + Die2; //Sum of the tw dice
        System.out.println(sum);
    }
}