/****************************************************************************** 
 *  Purpose: Find out the Repeated number in array.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
 
 public class ArrayRepeated {
	public static void main(String arg[]){
	  int a[] = new int[100];
          int i;
         for(i = 0 ; i < 100 ; i++){
	for(int j = i + 1 ; j < 100 ; j++){
		if(a[i] == a[j]);
                  break;
		
	}
	}
System.out.println("Repetad Element" + a[i]);
}
}           
         




















