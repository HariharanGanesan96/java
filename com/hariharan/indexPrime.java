package com.hariharan;

import java.util.Scanner;

public class indexPrime {
	
	
	public static int prime(int[] i,int len) {
		int count=0,sum=0;
		for(int j=1;j<len;j++) {
		boolean boo=prime1(j);
		if(boo) {
			sum+=i[j];
			count++;
		}
		}		
	       System.out.println(sum);
	       System.out.println(count);
		return sum/count ;
	}
	public static boolean prime1(int i) {
		i+=1;

		for(int j=2;j<(i/2)+1;j++) {
			if(i%j==0) {
				return false;
			}
		}		
	
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the input value");
	     int length=scan.nextInt();
	     int count=0;
	     int [] array=new int[length];
	     for (int i=0;i<length;i++) {
	    	 array[i]=scan.nextInt();
	    	 if(array[i]<0) {
	    		 System.out.println("inavlid input");
	    		 System.exit(0);
	    	 }    
	     }
	     	     System.out.println(prime(array,length));
	     
	    
	}

}
