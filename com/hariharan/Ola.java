package com.hariharan;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

public class Ola {
	static void getprice(int price, int km) {
		System.out.println("Total price"+" "+price * km);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Bike = 1, auto = 2, car = 3;
		int Bikeprice = 20, autoprice = 40, carprice = 80;
		int km = 10;
		switch (3) {
		case 1:
			getprice(Bikeprice, km);
			break;

		case 2:
			getprice(autoprice, km);
			break;

		case 3:
			getprice(carprice, km);
			break;
		}
		Runtime r=Runtime.getRuntime();
		try {
			r.exec("Notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
