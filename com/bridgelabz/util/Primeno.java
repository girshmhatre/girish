package com.bridgelabz.util;

import java.util.*;
public class Primeno
{
  public static void main(String arg[]){
  int no,i,a=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the number")
  no=sc.nextInt();
  for(i=1;i<=no;i++){
      if(no%i==0)  
     	 a++;
  }
    if(a==2){
     System.out.println("prime no");
  }
   else{
      System.out.println("not prime");
    }
  }
}
