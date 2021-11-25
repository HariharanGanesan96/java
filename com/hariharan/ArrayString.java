package com.hariharan;

import java.util.Random;
import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String[] array= {"a","b","c","d","e","f","g","h","i","j"};
    
   for(int i=0;i<array.length;i++) {
	   if(i%2==0) {
		   System.out.print(array[i]+" ");
	   }
   }
   System.out.println();
	  String [] arr=new String[10];
	  
	  
	  
	Scanner data=new Scanner(System.in);
	 for(int i=0;i<array.length;i++) {
		 char j=data.next().charAt(0);
		 arr[i]=String.valueOf(j);
		 System.out.print(arr[i]+" ");
		 }
	}

}
