/******************************************************************************
 *  
 *  Purpose: Calculate the Monthly Payment and Total Interest on a Car Loan.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class CarLoan {
    public static void main(String[] args) {
		// Principal, Year and Rate variable stores the Principal, Year and Rate entered by the user as the input
        double principal = Double.parseDouble(args[0]);
        double years = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);
		
		// monthly interest rate
        double r = rate / 12 / 100;
		// number of months
        double n = 12 * years;      

        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
        double interest = payment * n - principal;

        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
    }

}