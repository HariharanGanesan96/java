package com.hariharan;

import java.util.Scanner;

public class CountOfEnd3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length");
		int len=scan.nextInt();
		
		int [] array=new int[len];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter array index value of "+i);
			array[i]=scan.nextInt();
			if(array[i]<0) {
				System.out.println("Invaild input");
				System.exit(0);
			}
		}
		
		int count=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%10 ==3) {
				count++;
			}
		}
		System.out.println("Number of integer end with 3 is ="+count);
	}

}
