package com.hariharan;

public class Pattern {

	public static void main(String[] args) {
		// TODO auto-generated method stub
		int row=6;
		for (int i=1;i<row;i++) {
			int k=i;
			int l=3;
			for (int j=1;j<=i;j++) {
				if(j==1) {
				System.out.print(i+" ");
				
			}
				else {
					System.out.print((k+=l)+" ");
					l++;
				}
			
		}
			System.out.println();
		}
	for (int i=1;i<=3;) {
		for (int j=1;j<=3;) {
		System.out.println(i+" "+j);
		j++;
		}
		i++;
	}
		
		
	}
}
