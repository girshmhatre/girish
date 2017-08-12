/******************************************************************************
 *  
 *  Purpose: .Doing the Integer operation
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class IntOpt{

    public static void main(String arg[]){
	//a,b,c variable stores the number entered by the user as the input
	int a = Integer.parseInt(arg[0]);
	int b = Integer.parseInt(arg[1]);
	int c = Integer.parseInt(arg[2]);
	int d=0;
	
	d = a + b * c;
    System.out.println("a+b*c:"+d);
        
	d = a * b + c;
  	System.out.println("a*b+c:"+d);

	d = c + a / b;
	System.out.println("c+a/b:"+d);

	d = a % b + c;
	System.out.println("a%b+c:"+d);
    }
}