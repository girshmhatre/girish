/******************************************************************************
 *  
 *  Purpose:Compute the sin x using Taylor Series.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
 
public class Sin{
	
	public static int Factorial(int fact){
	int mFactorial = 1;
    for(int i=fact;i>0;i--){
        mFactorial*=i;
    }
    return mFactorial;
	}
	public static void main(String arg[]){
    double x = Double.parseDouble(arg[0]);
    double n = Double.parseDouble(arg[1]);
    x = x % (2 * Math.PI);
    int power = 3;
    int flag = 0;
    int sinx = 0;
    sinx += x;
    while(n>0){
    if(flag == 0){
        sinx -= (Math.pow(x, power)/Factorial(power));
	    n++;
		power+=2;
	    flag=1;
	}
	else{
		sinx += (Math.pow(x,power)/Factorial(power));
	    n++;
		power+=2;
	    flag=0;
	}
    }
		System.out.println("sinx" +sinx);      
    }
}			
