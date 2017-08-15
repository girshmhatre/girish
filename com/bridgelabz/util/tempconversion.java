/****************************************************************************** 
 *  Purpose: Temperature convert fehreanhit into celsius or viceversa.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class tempconversion
{
public static void main(String args[])
   {
     float fahrenheit = Float.parseFloat(args[]);
	 float celsius = Float.parseFloat(args[]);
    
     cl=5*(fh-32)/9;
     System.out.printf("celsius=" + cl);

   
     fh=(cl*9/5)+32;
     System.out.printf("fahrenheit=" + fh);
    }
}
