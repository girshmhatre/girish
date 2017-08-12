/******************************************************************************
 *  
 *  Purpose: Determines the year is a leap year or not leap year.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
  
 public class LeapYear{
    
    public static void main(String arg[]){
	
	int Year = Integer.parseInt(arg[0]);
	boolean isLeapYear;
      
	//divisible by 4
	isLeapYear = (Year % 4 == 0);

	//divisible by 4 and not 100
	isLeapYear = isLeapYear && (Year % 100 != 0);
    
	//divisible by 4 and 100 unless divisible by 400
	isLeapYear = isLeapYear || (Year % 400 == 0);

	System.out.println(isLeapYear);
    }
}