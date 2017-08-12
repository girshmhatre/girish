
/******************************************************************************
 *  
 *  Purpose: Performs various Trignometric calculation and convert Degrees into Radians.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
 
 public class Trig { 

    public static void main(String[] args) {
		
		//Degrees variable stores the Degrees entered by the user as the input
        double degrees = Double.parseDouble(args[0]);
		//convert the degrees into radians  
        double radians = Math.toRadians(degrees);
		System.out.println("Radians"+radians);
		//calculate the sin value
        double s = Math.sin(radians);
        System.out.println("sin(" + degrees + ") = " + s);
		//claculate the cos value
        double c = Math.cos(radians);
        System.out.println("cos(" + degrees + ") = " + c);
		//calculate the tan value
        double t = Math.tan(radians);
        System.out.println("tan(" + degrees + ") = " + t);
        System.out.println(s + " / " + c + " = " + s / c);

        double r = s*s + c*c;
        System.out.println(s*s + " + " + c*c + " = " + r);
    }
}