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
     int Decimal = Integer.parseInt(arg[0]);
     int i=0;
     int b;
     int a[] = new int[8];
       while(Decimal>0){
         b = Decimal%2;
	 Decimal = Decimal/2;
         a[i]=b;
	 i++;
   
    }
   for(i=0;i<a.length;i++)
   {
     if(i==4)
      System.out.print(" ");
      System.out.print(a[i]);
   }
   System.out.println();
  }
}
