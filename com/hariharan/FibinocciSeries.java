package com.hariharan;

  
public class FibinocciSeries {
	  public static void fibnocci(int input) {
		  int a=0,b=1;
		  if(input==1)
		  { System.out.println(" 0 ");
		  }
		  else {
			  System.out.print(" 0 1 ");
		  }
		  
			  for (int i=2;i<input;i++) {
		  
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
		}
	  }
           
	public static void main(String[] args) {
		fibnocci(3);
	}
	
}
