package com.bridgelabz.util;

import java.util.*;
public class Primeno
{
	public static void main(String arg[]){
	int no = Integer.parseInt(arg[0]);
	int i,a = 0;

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
