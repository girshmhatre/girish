/******************************************************************************
 *  
 *  Purpose: Determine the Wind chill and Print the Wind Temperature and Wind speed.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class WindChill {
	
    public static void main(String[] args) {
		// t, v and w  variable stores the Temperature, Speed and Wind Chil entered by the user as the input
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
		// claculate the Wind chill
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
    }

}
