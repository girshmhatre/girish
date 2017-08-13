/****************************************************************************** 
 *  Purpose: Roll die.
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
 public class RollDie{
	public static void main(String arg[]){
	int n = Integer.parseInt(arg[0]);	
	int i;
	int count1 = 0;
	int count2 = 0;
	int count3 = 0;
	int count4 = 0;
	int count5 = 0;
	int count6 = 0;

	for(i = 0 ; i < n ; i++){
	int a = (1 + (int) (Math.random() * 6 ));
		if(a == 1)count1++;
		if(a == 2)count2++;
		if(a == 3)count3++;
		if(a == 4)count4++;
		if(a == 5)count5++;
		if(a == 6)count6++;
	}
      if(count1>=count2 && count1>=count3 && count1>=count4 && count1>=count5 && count1>=count6 )
        System.out.println("1 =" +count1);
	if(count2>=count1 && count2>=count3 && count2>=count4 && count2>=count5 && count2>=count6 )
        System.out.println("2 =" +count2);
	if(count3>=count1 && count3>=count2 && count3>=count4 && count3>=count5 && count3>=count6 )
        System.out.println("3 =" +count3);
         if(count4>=count1 && count4>=count2 && count4>=count3 && count4>=count5 && count4>=count6 )
        System.out.println("4 ="+count4);
	if(count5>=count1 && count5>=count2 && count5>=count3 && count5>=count4 && count5>=count6 )
        System.out.println("5 ="+count5);
	if(count6>=count1 && count6>=count2 && count6>=count3 && count6>=count4 && count6>=count5 )
        System.out.println("6 ="+count1);
}
}
