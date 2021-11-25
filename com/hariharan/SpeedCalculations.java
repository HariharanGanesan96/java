package com.hariharan;

import java.util.Scanner;

public class SpeedCalculations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    System.out.println("enter distance you travelled in km");
    double distance=input.nextInt();
    System.out.println("enter the time yo traveled in hours");
    double time=input.nextInt();
    double speed=distance/time;
    System.out.println(speed+"Kmsph");   
    double dval=344.342532;
    System.out.format("double :%.2f",dval);
	}

}
