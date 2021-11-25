package com.hariharan;
public class StringUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String firstname="hariharan",lastname=" ganesan";
    String fullname=firstname+lastname;
    System.out.println("Full Name :"+fullname);
    
    //boolean
    int num=10;
    if(num%2==0) {
    	System.out.println("even");
    }
    else {
    	System.out.println("add");
    }
    
    // condition 
    
   int mark =55;
   if (mark >50 ) {
	   System.out.println("Pass");
   }
   else
   {
	   System.out.println("fail");
   }
   
   
   for (int i=1;i<11;i++) {
	   int out=i*10;
	   System.out.println(i+"X10="+out);
   }
   //grade
   int marks=45;
   if (marks >=95) {
	   System.out.println("Grade : O");
   }
   else if(marks >=90 && marks <95) {
	   System.out.println("Grade : A+");
   }
   else if(marks >=80 && marks <90) {
	   System.out.println("Grade : A");
   }
   else if(marks >=70 && marks <80) {
	   System.out.println("Grade : B+");
   }
   else if(marks >=60 && marks <70) {
	   System.out.println("Grade : B");
   }
   else if(marks >=50 && marks <60) {
	   System.out.println("Grade : Pass");
   }
   else {
	   System.out.println("Grade :Fail");
   }
	int [] markslist= {79,93,68,92,67};
	double sum=0;
	  // Average
	for(int i=0;i<markslist.length;i++) {
		sum+=markslist[i];
	}
double avg=sum/markslist.length;
	System.out.println(avg);
	}
	
}