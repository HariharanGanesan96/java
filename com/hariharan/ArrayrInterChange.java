package com.hariharan;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayrInterChange {
	
	public static void interchangeArray(int[] inputarray, int length) {
		for(int i=0,j=(inputarray.length-1);i<(inputarray.length)/2;i++,j--) {
				int temp=inputarray[i];
				inputarray[i]=inputarray[j];
				inputarray[j]=temp;
			
		}
		 System.out.println("After interchange"+Arrays.toString(inputarray));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the array length");
        int length=Integer.parseInt(scan.nextLine());
        
        if(length<0) {
    		System.out.println("invalid input");
    		System.exit(0);
    	}
        int [] inputarray=new int[length];
        
        System.out.println("Enter array values");
        
        for(int i=0;i<inputarray.length;i++) {
        	inputarray[i]=Integer.parseInt(scan.nextLine());
        	if(inputarray[i]<0) {
        		System.out.println("invalid input");
        		System.exit(0);
        	}
	    }
        System.out.println("Before interchange "+Arrays.toString(inputarray));
        interchangeArray(inputarray,length);

}

	
}
