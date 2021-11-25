package com.hariharan;

import java.util.Scanner;

public class MaxFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner data=new Scanner(System.in);
      float a=data.nextFloat();
      float b=data.nextFloat();
      float c=data.nextFloat();
      String result=(a>b && a>c)? "a":(b>c)?"b":"c";
      System.out.println(result);
      
	}

}
