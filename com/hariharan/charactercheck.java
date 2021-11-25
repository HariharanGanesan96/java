package com.hariharan;

import java.util.Scanner;

public class charactercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char a='a',b='a';
      String result=(a==b)? "Charcter are equal":"Character are not equal";
     System.out.println(result);
     Scanner data=new Scanner(System.in);
     
     char c=data.nextLine().charAt(0);
     System.out.println(c);
     
     
	}

}
