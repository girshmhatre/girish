/****************************************************************************** 
 *  Purpose: Temperature convert fehreanhit into celsius or viceversa.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

 package com.bridgelabz.util;

import java.util.Scanner;
class tempconversion
{
public static void main(String args[])
   {
     float fh,cl;
    
     Scanner in=new Scanner(System.in);
     System.out.printf("enter the temprature value of fahrenheit\n");
     fh=in.nextFloat();
     cl=5*(fh-32)/9;
     System.out.printf("celsius=" + cl);

     System.out.printf("\n\nenter the temprature value of Celsius ");
     cl=in.nextFloat();
     fh=(cl*9/5)+32;
     System.out.printf("fahrenheit=" + fh);
    }
}
