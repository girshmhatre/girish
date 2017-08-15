/****************************************************************************** 
 *  Purpose: Temperature convert fehreanhit into celsius or viceversa.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class Tempconversion
{
public static void main(String args[])
   {
     float fahrenheit = Float.parseFloat(args[0]);
	 float celsius = Float.parseFloat(args[1]);
    
     celsius=5*(fahrenheit-32)/9;
     System.out.println("Celsius=" + celsius);

   
     fahrenheit=(celsius*9/5)+32;
     System.out.println("Fahrenheit=" + fahrenheit);
    }
}
