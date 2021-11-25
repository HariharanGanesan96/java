package com.hariharan;

import java.util.Scanner;

public class dublicatevalue {

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
			int sum=0;
			for(int i=0;i<array.length;i++) {
				
				for(int j=i+1;j<array.length-1;j++) {
					if (array[i]==array[j]) {
						sum-=j;
						break;
					}
				}
				sum+=i;
			}
			System.out.println(sum);
	}

}
