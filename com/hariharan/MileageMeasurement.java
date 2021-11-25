package com.hariharan;

import java.util.Scanner;

public class MileageMeasurement {
	public static void main(String[] args) {
  
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the CC value");
		
		int cc=scan.nextInt();
		if(cc<100 || cc>220) {
			System.out.println("invaild input");
		}
		else if(cc>=100 && cc<=125) {
			System.out.println("Mileage is 75");
		}
		else if(cc>=126 && cc<=135) {
			System.out.println("Mileage is 70");
		}
		else if(cc>=136 && cc<=150) {
			System.out.println("Mileage is 60");
		}
		else if(cc>=151 && cc<=200) {
			System.out.println("Mileage is 50");
		}
		else  {
			System.out.println("Mileage is 35");
		}
   
  
	}
}
