package com.hariharan;

import java.util.Arrays;
import java.util.Random;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] array=new int[5];
	Random rand=new Random();
	for(int i=0;i<array.length;i++) {
		array[i]=rand.nextInt(100);
		System.out.print(array[i]+" ");
	}
	System.out.println();
	
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));
}
}