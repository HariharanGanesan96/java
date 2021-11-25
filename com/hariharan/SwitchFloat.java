package com.hariharan;

import java.util.Scanner;

public class SwitchFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	     Scanner data = new Scanner(System.in);
	     int input=data.nextInt();
	     switch(input) {
	     case 'v':
	    	 System.out.println("violet");
	    	 break;
	     case 'i':
	    	 System.out.println("indigo");
	    	 break;
	     case 'b':
	    	 System.out.println("blue");
	    	 break;
	     case 'g':
	    	 System.out.println("green");
	    	 break;
	     case 'y':
	    	 System.out.println("yellow");
	    	 break;
	     case 'o':
	    	 System.out.println("orange");
	    	 break;
	     case 'r':
	    	 System.out.println("red");
	    	 break;
	     default :
	    	 System.out.println("invalid color");
	     }
	}

}
