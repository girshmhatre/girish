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
	int array[] = {2,3,1,4,5,6,3,4,6,7};
	
        for(int i = 0 ; i < 10 ; i++){
		for(int j = i + 1 ; j < 10 ; j++){
			
		if(array[i] == array[j]);
			System.out.println("Repetad Element" + array[i]);		  
	    }
		}
	}
}           
         




















