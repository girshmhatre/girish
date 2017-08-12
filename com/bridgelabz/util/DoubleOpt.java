/******************************************************************************
 *  
 *  Purpose: Doing the Double operation.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class DoubleOpt{

    public static void main(String arg[]){
	// a,b,c variable stores the number entered by the user as the input
	double a = Double.parseDouble(arg[0]);
	double b = Double.parseDouble(arg[1]);
	double c = Double.parseDouble(arg[2]);
	double d=0;


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