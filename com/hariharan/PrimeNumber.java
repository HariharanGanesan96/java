package com.hariharan;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean primenumber(int input) {
		for(int i=2;i<input/2;i++) {
			if(input%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int data=input.nextInt();
		String result=(primenumber(data))? "is prime number": "is not prime number" ;
		System.out.println(result);
	}

}
