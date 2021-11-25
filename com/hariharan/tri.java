package com.hariharan;

import java.util.Scanner;

public class tri {

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
		    			continue;
		    		}
		    		else if (j>i) {
		    			output1+=input[i][j];
		    		}
		    		else {
		    			output2+=input[i][j];
		    		}
		    	 }
		    	}
		     System.out.println(output1);
		     System.out.println(output2);
	     	}
}
