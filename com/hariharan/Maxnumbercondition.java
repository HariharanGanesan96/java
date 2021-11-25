package com.hariharan;

public class Maxnumbercondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=10,b=80,c=5,d=25,e=45;
    
    if(a>b && a>c && a>d && a>e) {
    	System.out.println(" a is greater");
    }
    else if(b>c && b>d && b>e) {
    	System.out.println(" b is greater");
    }
    else if(c>d && c>e) {
    	System.out.println(" c is greater");
    }
    else if(d>e) {
    	System.out.println(" d is greater");
    }
    else {
    	System.out.println(" e is greater");
    }
	}

}
