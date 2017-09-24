//package com.bridgelabz.util;
public class  MathFunction{
public static double mHarmonic(int number1){
        int i = 1;
        double mHarmonic = 0;	
	while(i <= number1){
             	mHarmonic = mHarmonic + 1/i ;
		System.out.print("1/"+i+"+");
                i++;
	}	
   System.out.println();
  return mHarmonic;
  }

public static double mSin(int angle){
 double radians = Math.toRadians(angle);
 double sin = Math.sin(radians);
 return sin;
}

public static double mcos(int angle){
 double radians = Math.toRadians(angle);
 double cos = Math.cos(radians);
 return cos;
}

    public static String mBinary(int number) {

        int nNumber = number;

        String binary = "";

        int mReminder;

        while(nNumber > 0) {
            mReminder = nNumber % 2;
            nNumber = nNumber / 2;
            binary+=mReminder;
        }
        return binary;
    }
 public static double findSqrt(int number,double epsilon1){
        double mNumber = number;
      
        double t = mNumber;

        while (Math.abs(t - mNumber/t) > epsilon1*t) {
            t = (mNumber/t + t) / 2.0;
        }

        return t;
    }

 public static boolean isPrime(int number) {
        boolean isPrimeNumber = false;
        int flag = 0;
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    flag++;
                }
            }
            if (flag == 2) {
                isPrimeNumber = true;
                return isPrimeNumber;
            }
            else
                return isPrimeNumber;
        }
        else
            return isPrimeNumber;
    }
 public static long factorial(int number){
        long mNumber = 1;
        while(number >= 1){
            mNumber = mNumber * number;
            number--;
        }
        return mNumber;
    }
public static double futureVal(double doller,double rate,double period){
   double mFutureValue = doller * (Math.pow((1 + rate), period));

        return mFutureValue;
    }
 	
public static double presentVal(double doller,double rate,double period){
   double mPresentValue = doller / (Math.pow((1 + rate), period));

        return mPresentValue;
    }
 	
public static void main(String[] args){
		
	int number=Integer.parseInt(args [0]);
        int number1=Integer.parseInt(args [1]);
        int number2=Integer.parseInt(args [2]);
        double epsilon = 1e-15;  
	System.out.println("harmonic: "+mHarmonic(number));
        System.out.println("sin: "+mSin(number));
        System.out.println("cos: "+mcos(number));
        System.out.println("Binary: "+mBinary(number));
        System.out.println("prime no: "+isPrime(number));
        System.out.println("factorial: "+factorial(number));
        System.out.println("findSqrt: "+findSqrt(number,epsilon));
        System.out.println("FutureValue: "+futureVal(number,number1,number2));
        System.out.println("presentValue: "+presentVal(number,number1,number2));
   }
}
