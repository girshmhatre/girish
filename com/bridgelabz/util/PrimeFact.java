/******************************************************************************
 *  
 *  Purpose:Compute the prime factorial.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class PrimeFact{
   public static void main(String arg[]){
	int n = Integer.parseInt(arg[0]);
        int i = 2;
         while(n>1){
          if(n%i==0){
	 System.out.println(i+"");
         n=n/i;
 	}
else
i++;
}
}
}
  
     
