/******************************************************************************
 *  
 *  Purpose: Print the Harmonic series.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class Harmonic{
	
  	public static void main(String[] args){
		// n variable stores the number entered by the user as the input
	int n=Integer.parseInt(args [0]);
	int i = 1;
	double sum = 0;
		
	//  print and calculate the Sum of the Harmonic series
	for(i = 1 ; i <= n ; i++){	 
		System.out.println("1/"+i"+");
		sum=sum+(double)1 / i;
	}
		System.out.println(sum);
	}
}
  