package com.hariharan;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter no of rows");
	    pattern(scan.nextInt());
	}
	public static void pattern(int nextInt) {
		for(int i=1;i<=nextInt;i++) {
			for(int j=1;j<=nextInt;j++) {
				if(i+j>=6) {
				System.out.print("* ");
			}
				else {
				System.out.print("  ");
		}
			}
			System.out.println();
		
	}
	}
}
