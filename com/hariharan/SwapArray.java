package com.hariharan;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {

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
			
			System.out.println(Arrays.toString(array));
			int [] swap=new int[len];
			System.out.println("Enter index value");
			
			for(int i=0;i<swap.length;i++) {
				swap[i]=scan.nextInt();
				if(swap[i]<0) {
					System.out.println("Invaild input");
					System.exit(0);
				}	
			}
			
			System.out.println(Arrays.toString(swap));
			
			int[] reorderarray=new int[len];
			
			for(int i=0;i<array.length;i++) {
				reorderarray[swap[i]]=array[i];
			}
				
			System.out.println(Arrays.toString(reorderarray));
							
					}
	}


