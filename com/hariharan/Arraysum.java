package com.hariharan;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] arr=new int[5];
		Scanner data=new Scanner(System.in);
		for (int i=0;i<arr.length;i++) {
			arr[i]=data.nextInt();
			sum+=arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		 
		int i=0;
		while(i<5) {
			sum+=data.nextInt();
			i++;
		}
		System.out.println(sum);
		
		i=0;
		
		do {
			sum+=data.nextInt();
			i++;
		}while(i<5);
		
		System.out.println(sum);

	}

}
