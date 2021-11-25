package com.hariharan;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		    System.out.println("enter no of rows");
		    pattern(scan.nextInt());
	}
	public static void pattern(int nextInt) {
		for(int i=0;i<=nextInt;i++) {
			int sum=0;
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
				sum+=j;
				if(j==i && sum!=0) {
					System.out.println(sum+" ");
				}
			}
			System.out.println();
		}
		
	}
}
