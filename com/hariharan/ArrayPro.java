package com.hariharan;
import java.util.*;
public class ArrayPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int[] Array1=new int[5];
    
    Random rans=new Random();
    for(int i=0;i<Array1.length;i++) {
    Array1[i]= rans.nextInt(100);
    	System.out.print(Array1[i]+" ");
    }
    System.out.println();
    
  //  Array1[0]=10;
    //Array1[1]=20;
   // Array1[2]=30;
   // Array1[3]=40;
    //Array1[4]=50;
    
    for(int j=0;j<Array1.length;j++) {
    	Array1[j]+=Array1[j];
    	System.out.print(Array1[j]+" ");
    }
		
	}

}
