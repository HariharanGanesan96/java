package com.hariharan;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
		
		// Array length input from user
		System.out.println("Enter the year");
		int year=scan.nextInt();
		
		switch(checkleapyear(year)) {
		case 0:
			System.out.println("Its not leap year");
			break;
		case 1:
			System.out.println("Its a leap year");
			break;
		default :
			System.out.println("Invalid input");
			System.exit(0);
		}
	}

	public static int checkleapyear(int year) {
		
		if (year<0) {
			return -1;
		}
		
		int div=year%4;
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
			
			return 1;
		}}}
		
		return 0;
		
	}
}


