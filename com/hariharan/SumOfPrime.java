package com.hariharan;

import java.util.Scanner;

public class SumOfPrime {
   
	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		// Array length input from user
		System.out.println("Enter array length");
		int length=scan.nextInt();
		
		if(length<0) {
			System.out.println("invalid input");
			System.exit(0);
		}
		
		int [] input=new int[length];
		
		for (int i=0;i<input.length;i++) {
			System.out.println("Enter the array index value of"+i);
			input[i]=scan.nextInt();
			
			if(input[i]<0) {
				System.out.println("invalid input");
				System.exit(0);
			}
		}
		
		System.out.println("Sum of prime number in the array ="+sumprime(input,length));
	}

	public static int sumprime(int[] input, int length) {
      int sum=0;
      for(int i=0;i<input.length;i++) {
    	  
    	 if( primenum(input[i])){
    		 sum+=input[i];
    	 }
      }
		
		return sum;
	}

	public static boolean primenum(int data) {
		if (data==0 || data==1) {
			return false;
		}
		for(int i=2;i<(data/2)+1;i++) {
			if(data % i==0) {
				return false;
			}		
		}
		return true;
	}
}
