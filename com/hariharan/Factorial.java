package com.hariharan;

import java.util.Scanner;

public class Factorial {
	public static void factorial(int input) {
		int output=1;
		for (int i=1;i<=input;i++) {
			output *=i;
		}
		System.out.println("Factorial value of "+input+" is = "+output);
	  }
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the input :");
		Scanner data=new Scanner(System.in);
		int input =data.nextInt();
		factorial(input);

	}

}
