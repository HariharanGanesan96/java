package com.hariharan;

import java.util.Arrays;
import java.util.Scanner;

public class Loops {
	
	public static void main(String[] args) {
	
		int sum=0;
			Scanner data=new  Scanner(System.in);
		int[] arr=new int[5];
		
		// For loop method
		for (int i=0;i<arr.length;i++) {
			System.out.println("enter the inputs");
			arr[i]=data.nextInt();
			sum+=arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("For loop sum value ="+sum);
		System.out.println();
		
		//while loop
		int i=0;
		sum=0;
		while(i<5) {
			System.out.println("enter the inputs");
			arr[i]=data.nextInt();
			sum+=arr[i];
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("While loop sum value ="+sum);
		System.out.println();
		
		
		// do while loop
		
		i=0;
		sum=0;
		do {
			System.out.println("enter the inputs");
			arr[i]=data.nextInt();
			sum+=arr[i];
			i++;
		}while(i<5);
		System.out.println("Do While loop sum value ="+sum);
		
		
	}

}
