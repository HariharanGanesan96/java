package com.hariharan;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length");
		int len=scan.nextInt();
		
		int [] array=new int[len];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter array index value of "+i);
			array[i]=scan.nextInt();
		}
		
		System.out.println("Enter the element value need to remove");
		
		int ele=scan.nextInt();
		
		boolean boo= false;
		for(int i=0;i<array.length-1;i++) {
			if(ele==array[i]) {
				boo=true;
			}
			if(boo) {
				array[i]=array[i+1];	
				}	
		}
		
		if(boo==false) {
			System.out.println("invalid input");
			System.exit(0);
		}
		array[array.length-1]=0;
	     System.out.println(Arrays.toString(array));
	     
}
}
