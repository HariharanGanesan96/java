package com.hariharan;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    
    System.out.println("Enter basic amount");
    
    int basic=scan.nextInt();
    if(basic<0) {
    	System.out.println("Input is too small");
    	System.exit(0);
    }
    else if(basic>36727) {
    	System.out.println("Input is too large");
    	System.exit(0);
    }
    
    int bonus=calculatebonus(basic);
    System.out.println(bonus);
	}

	private static int calculatebonus(int basic) {
		// TODO Auto-generated method stub
		 int bonus=0;
		
		    if(basic>20000) {
		       return bonus=(int)(basic*.17)+1500;
		    }
		    else if(basic>15000) {
		    	 return bonus=(int) (basic*.15)+1200;
		    }
		    else if(basic>12000) {
		    	 return bonus=(int) (basic*.12)+1000;
		    }
		    else {
		       	bonus=(int) (basic*.08)+500;
		    }
		return bonus;
		 
	}

}
