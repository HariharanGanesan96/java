package com.hariharan;
import java.util.Arrays;
import java.util.Scanner;
public class orderNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("enter the input");
     
     int number=scan.nextInt();
     
     String number1=String.valueOf(number);
     char[] cha=number1.toCharArray();
     Arrays.sort(cha);
     
     for(int i=cha.length-1;i>=0;i--) {
    	 System.out.print(cha[i]);
     }
       	}

}
