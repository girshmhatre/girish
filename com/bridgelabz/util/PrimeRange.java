/******************************************************************************
 *  
 *  Purpose: Print prime no from specific Range
.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class PrimeRange{
      public static void main(String args[]){
    int Range_start=Integer.parseInt(args[0]);
    int Range_end= Integer.parseInt(args[1]);
    int count;	
	for(int i=Range_start;i<=Range_end;i++)
		{
    		 count = 0;
		for(int j=2;j<=i/2;j++)
		{
		  if(i%j == 0)count++;
                  }
		  if(count == 0)
		System.out.println(" prime no is:"+i);
    		  
	    
	}
    }
}
