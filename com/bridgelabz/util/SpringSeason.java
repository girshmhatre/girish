/******************************************************************************
 *  
 *  Purpose: Determines check the Spring Season.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

 package com.bridgelabz.util;
    
 public class SpringSeason {
 
    public static void main(String[] args) { 
        // month and day variable stores the month and day entered by the user as the input
        int month = Integer.parseInt(args[0]);
        int day   = Integer.parseInt(args[1]);
		//give the output true and false
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                         || (month == 4 && day >=  1 && day <= 30)
                         || (month == 5 && day >=  1 && day <= 31)
                         || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
    }
}