/******************************************************************************
 *  
 *  Purpose: .
 *
 *  @author  Girish Mhatre
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class GamlingSimulator{
	
  public static void main(String arg[]){
	  
	int Stake = Integer.parseInt(arg[0]);
	int Goal = Integer.parseInt(arg[1]);
	int Trail = Integer.parseInt(arg[2]);
	int won = 0,  loss = 0;
    int bets = 0;
 	
 	for(int i = 0 ; i < Trail ; i++){
      	int cash = Stake;
	while(cash > 0 && cash < Goal){
		bets++;
	if(Math.random()<0.5)
		cash++;
			
	else
    	cash--;
	}
    if(cash==Goal)won++;
	if(cash==0)loss++;
    }
	
	System.out.println(" Wins " + won +" trail " + Trail +" loss " + loss);
	System.out.println("Percentage is" + (100 * won) / Trail);
	System.out.println(" avg no of bets" +(1.0* bets) / Trail);
	}
}	
