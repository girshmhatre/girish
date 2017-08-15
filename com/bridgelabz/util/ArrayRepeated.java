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
    public static void main(String args[]){
        int[] array = {4,2,3,1,6,7,6,4,8,1};
        int count = 0;
		//Check the Repeated Element
        for(int i = 0;i < 10;i++){
            for(int j = i + 1;j < 10;j++){
                if(array[i] == array[j]){
                    System.out.println(array[i]);
                    count++;
                }
                if(count == 1)
                    break;
            }
            if(count == 1)
                break;
        }
    }
}          
         




















