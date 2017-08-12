/******************************************************************************
 *  
 *  Purpose: find second largest and second smallest elements in unsorted array.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
public class Unsorted{

    public static void main(String arg[]){

	int array[]=new int[]{3,6,1,8,5,4};
	int max1=array[0];       
	int max2=0;
	int min1=array[0];
	int min2=0;

      	for(int i=1;i<array.length;i++){
		// if current element is larger than first then update bth first and second
                    if(max1<=array[i]){
					max2=max1;
					max1=array[i];
				}
			}
		System.out.println("2nd largest element is:"+ max2);
	
		for(int i=1;i<array.length;i++){
		// if current element is smaller than first then update bth first and second
					if(min1>=array[i]){
              		min2=min1;
					min1=array[i];
				}
			}
		System.out.println("2nd Smallest Element is:"+min2);
	}
}
         