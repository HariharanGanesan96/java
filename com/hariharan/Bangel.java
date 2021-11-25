package com.hariharan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bangel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Give First circle two input values");
     Scanner scan=new Scanner(System.in);
     int x1=scan.nextInt();
     int y1=scan.nextInt();
     System.out.println("Give 2nd circle two input values");
     int x2=scan.nextInt();
     int y2=scan.nextInt();
     System.out.println("Give 2nd circle radius values");
     int r1=scan.nextInt();
     int r2=scan.nextInt();
     float distance=(float) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    		
     System.out.printf("%.2f",distance);
     System.out.println();
     DecimalFormat df=new DecimalFormat("#.##");
    int sum=r1+r2;
    if(sum==distance) {
    	System.out.println("tuches");
    }		
    else if(sum<distance) {
    	System.out.println("not tuches");
    	    }
    else {
    	System.out.println("intersect");
    }
    
	}

}
