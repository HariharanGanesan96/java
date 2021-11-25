package com.hariharan;

public class Projectdemo {
	
	public static int digits(int Giveninput) {
		int digitcount=0;
		while(Giveninput!=0) {
			Giveninput/=10;
			digitcount++;
	}
return digitcount;
}
	
	public static boolean Armstrong(int Giveninput,int count) {
		int sum=0,temp=Giveninput,reminder;
		while(Giveninput!=0) {
			int out=1;
	         	reminder=Giveninput%10;
	         	for(int i=0;i<count;i++) {
	         		out*=reminder;
	         	}
	         	sum+=out;
	         	Giveninput/=10;
		} 
		if(sum==temp) {
		return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Giveninput=1634;
		int count=digits(Giveninput);
	    String Result=(Armstrong(Giveninput,count))? "The given number is Arm strong":"The given number is not a arm strong number";
		 System.out.println(Result);

		 

	}

}
