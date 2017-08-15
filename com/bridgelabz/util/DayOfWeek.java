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

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31*m0)/12) % 7;

        switch (d0){
            case 0: System.out.println("SUNDAY");
                    break;
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("TUESDAY");
                    break;
            case 3: System.out.println("WEDNESDAY");
                    break;
            case 4: System.out.println("THURSDAY");
                    break;
            case 5: System.out.println("FRIDAY");
                    break;
            case 7: System.out.println("SATURDAY");
                    break;
        }
	}

}