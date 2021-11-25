package com.hariharan;

import java.util.Scanner;

public class OutputToInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input=new Scanner(System.in);
   int inputdata1=input.nextInt();
   int inputdata2=input.nextInt();
    int output1=0,output2=0;
		System.out.print(inputdata1+" ");
		System.out.print(inputdata2+"\n");
		
		for(int i=1;i<inputdata1-1;i++) {
			for(int j=1;j<inputdata2-1;j++) {
				if((i+j)==inputdata1 && (i*j)==inputdata2) {
				output2=i;
				output1=j;
					
				}
				
			}
		}
		System.out.println(output1+" "+output2);

	}
		
	}


