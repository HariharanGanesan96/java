package com.hariharan;

import java.util.Scanner;

public class SuperMarket {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vegName=new Scanner(System.in);
		int kg,price,totalAmount = 0;
		while(true) {
			System.out.println(" Enter the name of the vegitable");
			String[] Vegnames= {"Spinach","Kale","Broccoli","Sweet potatoes"};
			System.out.println("Spinach,Kale,Broccoli,Sweet potatoes");
			String input=vegName.nextLine().toLowerCase();
			System.out.println("Enter the kilos");
			kg=vegName.nextInt();
			switch (input) {
			 
			case "spinach":
				         totalAmount=kg*10;
				         break;
			case "kale":
		         totalAmount=kg*20;
		         break;
			case "broccoli":
		         totalAmount=kg*30;
		         break;
			case "sweet potatoes":
		         totalAmount=kg*40;
		         break;
		    default :
		    	System.out.println(" nothing is selected");
				   break;
			}
			break;
		}
		System.out.println("Total amount :"+totalAmount);	
	}
}
