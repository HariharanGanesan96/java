package com.hariharan;

import java.util.Scanner;

public class FahrenheitToCentigrade {
	
	public static double convertTocentigrade(double i) {
		i=((i-32)*5)/9;
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the input value");
	     double fval=scan.nextDouble();
	     if(fval<0) {
	    	 System.out.println("invalid input");
	    	 System.exit(0);
	     }
	     double output=convertTocentigrade(fval);
	     System.out.printf("%.2f",output);
       
	}

}
