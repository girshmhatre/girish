/******************************************************************************
 *  
 *  Purpose: Calcuate the  power of 2.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class Harmonic{
  	public static void main(String[] args){
  	int n=Integer.parseInt(args [0]);
	  int i=1;
  	 float sum=0;
		 for(i=1;i<=n;i++){
			System.out.println("1/"+i);
			System.out.println("+");
			sum=sum+(float)1/i;
		}
	System.out.println(sum);
	}
}
  