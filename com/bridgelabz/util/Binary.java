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
    int reminder;
    int array[] = new int[8];
    
	while(mDecimal>0){
        reminder = mDecimal%2;
		mDecimal = mDecimal/2;
        array[i]=reminder;
		i++;
	}
	if(32-i!=0){		//checking if binary no is of 4 byte or not
	int padding=32-i;
	while(padding!=0){      //if not of 4 byte then padd with 0's to make it 
		System.out.print(0);	//4 byte
		padding--;
	}
	}
   for(i=0;i<array.length;i++){
		System.out.print(array[i]);
	}
		System.out.println(" ");
	}
}
