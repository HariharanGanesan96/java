package com.hariharan;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimsArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the array row");
		int row=scan.nextInt();
		System.out.println("enter the array column");
		int col=scan.nextInt();
        
		int [][] array1=new int[row][col];
		int [][] array2=new int [row][col];
		
		  System.out.println("enter the array1 input");
		for (int i=0;i<array1.length;i++) {
			for (int j=0;j<array1[i].length;j++) {
				array1[i][j]=scan.nextInt();
			}
		}
		
		 System.out.println("enter the array2 input");

		for (int i=0;i<array1.length;i++) {
			for (int j=0;j<array1[i].length;j++) {
				array2[i][j]=scan.nextInt();
			}
		}
	
		int [][] array3=new int [row][col];
		
		for (int i=0;i<array1.length;i++) {
			for (int j=0;j<array1[i].length;j++) {
				array3[i][j]=array1[i][j]-array2[i][j];
			}
		}
		System.out.println("array 1 input :" +Arrays.deepToString(array1));
		System.out.println("array 2 input :" +Arrays.deepToString(array2));
		System.out.println("array output :"+Arrays.deepToString(array3));
	
	}

}
