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
 class PoweOf2{
     public static void main(String arg[]){ 
	int n = Integer.parseInt(arg[0]);
	int i = 0;
	int powerofTwo = 1;
		while(i<=n){
		 	System.out.println(i+" "+powerofTwo);
			powerofTwo = 2 * powerofTwo;
			i = i + 1;	
			}
		}
	}