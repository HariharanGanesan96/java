package com.hariharan;

import java.util.Arrays;
import java.util.Scanner;

public class SearchFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int [] array= {20,10,23,56,67,78,54,45,59,52};
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("Enter the element need find the index");
		
		int element=scan.nextInt();
		
		Arrays.sort(array);
		
		int midlength=array.length/2;
		
		int [] arr=Arrays.copyOf(array,midlength);
		
		int [] arr1=Arrays.copyOfRange(array, midlength, array.length);
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(Arrays.toString(array));
		
		int index=-1;
		
		
		
		if(element==array[midlength]) {
			index=midlength;
		}
		else if (element<array[midlength]) {
		for(int i=0;i<midlength;i++) {
			if(element==array[i]) {
				index=i;
			}
		}
		}
		else if (element>array[midlength]) {
			for(int i=midlength+1;i<array.length;i++) {
				if(element==array[i]) {
					index=i;
				}
			}
		}
			
//		
//		for(int i=0;i<array.length;i++) {
//			if(element==array[i]) {
//				index=i;
//				break;
//			}
//		}
		if(index>=0) {
        System.out.println("index value of selected element is = "+index);
	}
		else {
			System.out.println("invalid input");
		}
	}

}
