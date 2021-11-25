package com.hariharan;

public class SumOfdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int input=3456,sum=0;
    while(input!=0) {
    	sum+=input%10;
    	input/=10;
    }
    System.out.println("sum of integer digit values ="+sum);
	}

}
