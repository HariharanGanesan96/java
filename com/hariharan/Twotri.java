package com.hariharan;

import java.util.Scanner;

public class Twotri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Give the size of the box");
	     Scanner scan=new Scanner(System.in);
	     int size=scan.nextInt();
	     int [][] input=new int[size][size];
	     int output1=0,output2=0;    	
	     for (int i=0;i<size;i++) {
	    	 for(int j=0;j<size;j++) {
		    		input[i][j]=scan.nextInt();
	    		if(i==j) {
	    		output1+=input[i][j];
	    	 }
	    		if(i+j==(size-1)) {
	    			output2+=input[i][j];
	    		}
	    	}
	     }
	     System.out.println("output 1 "+output1+"  output 2 "+output2);
	     System.out.println(Math.abs(output1-output2));
	}

}
