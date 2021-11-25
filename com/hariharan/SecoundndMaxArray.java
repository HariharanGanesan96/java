package com.hariharan;
import java.util.Arrays;
import java.util.Scanner;

public class SecoundndMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      
      System.out.println("Enter array size");
      
      int length=scan.nextInt();
      if(length<0) {
    	  System.out.println("Invalid input");
      }
      int [] array=new int[length];
      
      for(int i=0;i<array.length;i++) {

      System.out.println("Enter array index value of "+i);
      array[i]=scan.nextInt();
      if(array[i]<0) {
    	  System.out.println("Invalid input");
      }
 
	}
      int max1=0, max2=0,max3=0,min=array[0];
      for(int i=0;i<array.length;i++) {
    	  if(max1<array[i]) {
    		  max3=max2;
    		  max2=max1;
    		  max1=array[i];	  
    	  }
    	  else if(max2<array[i]){
    	      max3=max2;
    		  max2=array[i];
    	  }   	  
    	  else if(max3<array[i]){
    		  max3=array[i];
    	  }
    	   if(min>array[i]) {
    		  min=array[i];
    	  }
      }
      System.out.println(Arrays.toString(array)+"\n");
      System.out.println("First max value ="+ max1+"\n");
      System.out.println("second max value ="+max2+"\n");
      System.out.println("Third max value ="+max3+"\n");
      System.out.println("first min value ="+min+"\n");
      System.out.println("Product value 2nd max and min "+max2+" X "+min+" = "+ max2*min);
      

}
}