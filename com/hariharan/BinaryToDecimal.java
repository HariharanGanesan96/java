package com.hariharan;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the Binary value");
	     int binary=scan.nextInt();
   	     ToDecimal(binary);
	}
	private static void ToDecimal(int binary) {
		// TODO Auto-generated method stub
		int temp=0,decimal=0,n=0;
		while(binary!=0) {
			temp=binary%10;
			if(temp>1 || n>3 ) {
				System.out.println("invalid input");
				System.exit(0);
			}
			decimal+=(int) (temp*(Math.pow(2, n)));
			binary/=10;
			n++;
		}
		System.out.println(decimal);
	}

}
