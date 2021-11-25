package com.hariharan;

import java.util.Scanner;

public class Waterflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the boat speed");
	     double bootspeed=scan.nextInt();
	     System.out.println("Enter the water speed");
	     double waterspeed=scan.nextInt();
	     System.out.println("Enter the distance");
	     double distance=scan.nextInt();
	     double time=0;
	     	     
	     time=distance/(bootspeed+waterspeed); 
	     
	     System.out.printf("%.2f",time);
	}

}
