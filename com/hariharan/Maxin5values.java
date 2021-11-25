package com.hariharan;

public class Maxin5values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array= {10,30,50,16,43};
		for (int i=0;i<array.length;i++) {
			if(array[0]<array[i]) {
				int temp=array[0];
				array[0]=array[i];
				array[i]=temp;
			}
		}
		System.out.println(array[0]);

	}

}
