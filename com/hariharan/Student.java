package com.hariharan;

import java.util.Scanner;

public class Student {
	
		public static boolean primenumber(int input) {
			for(int i=2;i<(input/2+1);i++) {
				if(input%i==0) {
					return false;
				}
			}
			return true;
		}
		public static int prime(int input) {
			int sum=0,out=0;
			for (int i=2;i<=input;i++) {
				if(primenumber(i)) {
					System.out.print(i+" ");
					sum+=i;
				}	
				
			}
			System.out.println(sum);
			
			while (sum>9) {
				out=wsum(sum);
				sum=out;
			}
			
			return out;
		}

		
		public static int wsum(int i) {
			int out=0;
			while(i!=0) {
				int rem=i%10;
				out+=rem;
				i/=10;
		}
			return out;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner data= new Scanner(System.in);
        String sval=data.nextLine();
        
        char[] cval=sval.toCharArray();
        for (int i=0;i<cval.length;i++) {
        	if(cval[i]=='a'||cval[i]=='e'||cval[i]=='i'||cval[i]=='o'||cval[i]=='u') {
        		int multiplay=i*100;
        		int length= prime(multiplay);
        		sval=sval.substring(0,i)+length+sval.substring(i+1);
        	}
        }
        System.out.println(sval);
	}

}
