package com.hariharan;

import java.util.Scanner;

public class Inputsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		System.out.println("Enter the String input value");
		String inputString=data.next();
		System.out.println("Enter the starting indrx value");
		int startindex=data.nextInt();
		System.out.println("Enter the end index value");
		int endindex=data.nextInt();
		System.out.println(inputString.substring(startindex, endindex));
	}

}
