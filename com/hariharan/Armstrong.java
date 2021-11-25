package com.hariharan;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input :");
		Scanner data=new Scanner(System.in);
		int input=data.nextInt(),temp;
		temp=input;
		int length=String.valueOf(input).length();
		int out=0;
		while(input !=0) {
			int rem=input%10;
			out+=Math.pow(rem, length);
			input/=10;
		}
		
		String result=(temp==out)? "Arm strong number":"Not arm Strong";
		System.out.println(result);

	}

}
