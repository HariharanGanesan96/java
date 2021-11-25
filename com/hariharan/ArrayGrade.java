package com.hariharan;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayGrade {
  
	public static int calculategrade(int[] array,int length) {
		int sum=0,average=0;
		if(length>0) {
		for(int i=0;i<array.length;i++) {
			if(array[i]>0) {
			sum+=array[i];
			}
			else {
				System.out.println("inavlid input");
				System.exit(0);
			}
		}
		}
		else {
			System.out.println("invalid input");
			System.exit(0);
		}
		average=sum/length;
		System.out.println("Average value "+average);
		
		 if(average>99) {
        	 System.out.println("output -1");
         }
         
         else if(average>80) {
        	 System.out.println("First Grade University");
         }
         else if(average>60) {
        	 System.out.println("Secound Grade University");
         }
         else if(average>0) {
        	 System.out.println("Third Grade University");
         }
         else {
        	 System.out.println("invalid input");
        	 System.exit(0);
         }
		return average;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter the length");
         int length=Integer.parseInt(scan.nextLine());
         
         int [] marks=new int[length];
         System.out.println("Enter the marks");
         for(int i=0;i<marks.length;i++) {
        	 marks[i]=Integer.parseInt(scan.nextLine());
         }
               
         
         int average=(calculategrade(marks, length));
         
        
	}

}
