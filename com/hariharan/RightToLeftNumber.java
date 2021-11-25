package com.hariharan;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RightToLeftNumber {

	public static void main(String[] args) {
		
		//using loop
		Scanner data=new Scanner(System.in);
		int Numberinput=data.nextInt();
		Integer [] array=new Integer[String.valueOf(Numberinput).length()];
			for (int i=0;i<array.length;i++) {
				int rem=Numberinput%10;
				array[i]=rem;
				Numberinput/=10;
			}
			Arrays.sort(array,Collections.reverseOrder());
			for(int i=0;i<array.length;i++) {
				System.out.print(array[i]);
			}
			
			// using String
			
			System.out.println();
			int input=data.nextInt();
			String sval=Integer.toString(input);
			char[] cval=sval.toCharArray();		
			Arrays.sort(cval);
			String out=String.valueOf(cval);
			StringBuilder output=new StringBuilder(out);
			System.out.println(output.reverse());
			
			
		
	}
}
