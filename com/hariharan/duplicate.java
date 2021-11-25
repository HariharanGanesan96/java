package com.hariharan;

import java.util.Arrays;
import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
       
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
			int n=0;
			int [] output=new int[len-1];
			  int count=0;
			for(int i=0;i<array.length;i++) {
				int index=0;
				for(int j=i+1;j<array.length-1;j++) {
					if(array[j]==array[i]) {
						index=1;
						count--;
						break;
					}
				}
				count++;
				if(index==0) {
					output[n]=array[i];
					n++;
				}	
			}
			Arrays.sort(output);
			System.out.println(Arrays.toString(output));
			System.out.println("\n"+"Total count = "+count);
	}

}
