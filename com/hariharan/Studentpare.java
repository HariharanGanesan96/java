package com.hariharan;

import java.util.Scanner;

public class Studentpare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      
      System.out.println("enter input values");
      
      String input=scan.nextLine();
      
      String[] str=input.split(",");
      
      Student1 obj=new Student1();
      
      System.out.println(obj.getSno());
      
      Student1 obj1=new Student1(Integer.parseInt(str[0]),str[1],str[2],Integer.parseInt(str[3]));
      
      System.out.println(obj.getName());
      
      System.out.println(obj1.getName());
	}

}
