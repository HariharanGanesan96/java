package com.hariharan;

import java.util.Scanner;

public class CountArray {
	public static void main(String[] args) {
	  
		 Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the length value");
	     int length=scan.nextInt();
	     System.out.println("Enter the input value");
	     int value=scan.nextInt();
	     int count=0;
	     int [] array=new int[length];
	     for (int i=0;i<length;i++) {
	    	 array[i]=scan.nextInt();
	    	 if(array[i]<0) {
	    		 System.out.println("inavlid input");
	    		 System.exit(0);
	    	 }    
	     }
	     for(int i=0;i<length;i++) {
	    	 if (value==array[i]) {
	    		 count++;
	    	 }
	     }
	     System.out.println(count);
	}

}
