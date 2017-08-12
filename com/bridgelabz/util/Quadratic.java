/******************************************************************************
 *  
 *  Purpose: Calcuate the Quadratic equation.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.util.Scanner;
public class Quadratic{

    public static void main(String[] args){
     
        int a, b, c;
        double root1, root2, delta;
        Scanner s = new Scanner(System.in);
        System.out.println("Given quadratic equation:ax^2 + bx + c");
		// taking the a,b,c vlaue from user 
        System.out.print("Enter a:");
        a = s.nextInt();
        System.out.print("Enter b:");
        b = s.nextInt();
        System.out.print("Enter c:");
        c = s.nextInt();
		//calculate the quadratic equation
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
		//calculate the delta value
        delta = b * b - 4 * a * c;
        //if delta is greater than 0 then calculate the root1 and root2 and print
		if(delta > 0){
       
            System.out.println("Roots are real and unequal");
            root1 = ( - b + Math.sqrt(delta))/(2*a);
            root2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("First root is:"+root1);
            System.out.println("Second root is:"+root2);
        }
		//delta is equal to 0 then calculate the root1 and print
        else if(delta == 0){
       
            System.out.println("Roots are real and equal");
            root1 = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("Root:"+root1);
        }
		//if delta is not greater than 0 and not equal to 0 then root are imaginary
        else{
        
            System.out.println("Roots are imaginary");
        }
    }
}
