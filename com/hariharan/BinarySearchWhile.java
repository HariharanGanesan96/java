package com.hariharan;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     
	System.out.println("Enter the array length");
	int len=scan.nextInt();
	
	int [] array=new int[len];
	System.out.println("Enter array value");
	
	for(int i=0;i<array.length;i++) {
		array[i]=scan.nextInt();
		if(array[i]<0) {
			System.out.println("Invaild input");
			System.exit(0);
		}	
	}
	
	Arrays.sort(array); 
	System.out.println(Arrays.toString(array));
	
		System.out.println("Enter the index value need to find");
		int remov=scan.nextInt();
		
		binary(0,array.length,remov,array);
	}

	private static void binary(int first, int last, int remov, int [] array) {
		// TODO Auto-generated method stub
		
	int mid=last/2;
	while(first<last) {
		if(remov==array[mid]) {
			System.out.println("index value ="+mid);
			break;
					}
		else if(remov<array[mid]){
			last=mid-1;	
		}
		else {
			first=mid+1;
		}
		mid=(first+last)/2;
		if(first>=last) {
			System.out.println("element is not fount");
		}
	}
		
	}
	

}
