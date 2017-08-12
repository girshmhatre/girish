/******************************************************************************
 *  
 *  Purpose: Determine the Day of Week.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class DayOfWeek {
	
    public static void main(String[] args) { 
		// month, day and year variable stores the month, day and year entered by the user as the input
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;

        System.out.println(d0);
    }

}