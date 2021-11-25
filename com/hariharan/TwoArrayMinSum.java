package com.hariharan;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayMinSum {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int index=-1,index1=-1,index2=-1,sum=0;
		System.out.println("Enter the array length");
		int len=scan.nextInt();
		
		int [] array=new int[len];
		System.out.println("Enter array 1 value");
		for(int i=0;i<array.length;i++) {
			
			array[i]=scan.nextInt();
			if(array[i]<0) {
				System.out.println("Invaild input");
				System.exit(0);
			}	
		}
		
		int min=array[0];
		
        int [] array1=new int[len];
        System.out.println("Enter array 2 value");
		for(int i=0;i<array1.length;i++) {
			array1[i]=scan.nextInt();
			if(array1[i]<0) {
				System.out.println("Invaild input");
				System.exit(0);
			}
	}
		int min1=array1[0],min2=array[1];
		for(int i=0;i<array.length;i++) {
			if(min>=array[i]) {
				min=array[i];
				index=i;
				
			}
			if(min1>=array1[i]) {
				min1=array1[i];
				index1=i;
				
			}
			else if(min2>=array1[i]) {
				min2=array1[i];
				
			}
		}
				
		
		if(index==index1) {
			sum=min+min2;
		}
		else {
			sum=min+min1;
		}
		
		System.out.println(Arrays.binarySearch(array1,min1));
		System.out.println(Arrays.binarySearch(array,min));
		System.out.println("array one ="+Arrays.toString(array));
		System.out.println("array two ="+Arrays.toString(array1));
		System.out.println("output sum is ="+sum);
		

}
}
