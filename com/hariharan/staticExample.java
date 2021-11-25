package com.hariharan;

import java.io.DataInputStream;
import java.io.InputStream;

public class staticExample {   
	static int in=10;
	int ival=10;
	double dval=5.8;
	char cval='a';
	void Dispaly() {
		System.out.println("Instance");
	}
	public static String sum(){
		return ("hai");
	}
	public static void main(String[] args) {
     staticExample Obj=new staticExample();
     System.out.println(Obj.sum());
     Obj.Dispaly();
     System.out.println(sum());
     try {
	DataInputStream data=new DataInputStream(System.in);
	System.out.println("Enter input");
	int ival=data.readInt();
	}
     catch (Exception e) {
    	 System.out.println(" Enter input");
       }
	}

}
