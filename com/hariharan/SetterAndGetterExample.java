package com.hariharan;

import java.util.Scanner;

public class SetterAndGetterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    GetterAndSetter Cus=new GetterAndSetter();
    Cus.setCusName("Hariharn");
    Cus.setld(908089923);
    System.out.println(Cus.getCusName());
    System.out.println(Cus.getid());
    
    
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter custmer ID");
    int newid=scan.nextInt();
    Cus.setld(newid);
    System.out.println(Cus.getid());
    
	}

}
