/******************************************************************************
 *  
 *  Purpose: a coin flip and print out Head or Tails.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class Flip{

  public static void main(String arg[]){

//Math.random()return a value between 0.0 and 1.0
     System.out.println(Math.random());
     
       if(Math.random()<0.5)
           System.out.println("Head");
       else 
           System.out.println("tail");
      }
  }