/******************************************************************************
 *  
 *  Purpose:Convert the Decimal into Binary
.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class Binary{
     public static void main(String arg[]){
     int mDecimal = Integer.parseInt(arg[0]);
     int i=0;
     int b;
     int array[] = new int[8];
       while(mDecimal>0){
         b = mDecimal%2;
	 mDecimal = mDecimal/2;
         a[i]=b;
	 i++;
   
    }
   for(i=0;i<array.length;i++)
   {
   
      System.out.print(array[i]);
   }
   System.out.println();
  }
}
