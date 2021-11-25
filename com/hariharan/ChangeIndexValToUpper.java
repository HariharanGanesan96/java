package com.hariharan;
import java.util.Scanner;
public class ChangeIndexValToUpper {
	public static void main(String[] args) {
		
		Scanner data=new Scanner(System.in);
		System.out.println("Enter the String input");
		String stringInput=data.next();
		char[] inputarray=stringInput.toCharArray();
		
		// index input from user
		int[] cha=new int[4];
		System.out.println("Enter index value need to change, give upto 4 values");
		for(int i=0;i<cha.length;i++) {
		 cha[i]= data.nextInt();
		}
		
		int count=0;
        // program logic
		for(int i=0;i<inputarray.length;i++) {
			for(int j=0+count;j<cha.length;j++) {
				if(i==cha[j]) {
					inputarray[i]=stringInput.toUpperCase().charAt(i);	
					count++;
					break;
					}
			}
		}
		stringInput=String.valueOf(inputarray);
		System.out.println(stringInput);
	}
}
