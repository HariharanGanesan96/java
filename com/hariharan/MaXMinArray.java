package com.hariharan;

import java.util.Arrays;
import java.util.Collections;

public class MaXMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array= {10,34,65,88,32};
		int max=array[0];
		int min=array[0];
		for (int i =1;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
			if(min>array[i]) {
				min=array[i];
			}
				
			}
		
     System.out.println("Max value ="+max);
     System.out.println("Min value ="+min);
     
     Arrays.sort(array);
		System.out.println("Max number is = "+array[array.length-1]);
		System.out.println("min number is = "+array[0]);
		
	Arrays.sort(array,Collections.reverseOrder());
	
	System.out.println(Arrays.toString(array));
	}
	}


