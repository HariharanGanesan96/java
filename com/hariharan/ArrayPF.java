package com.hariharan;

public class ArrayPF {

	static double Pfpercentage=12.5d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Empsal=45000;
		double year=.5;
		pfmonth(Empsal);
		pfyear(Empsal,year);
		int ival =10;
	}
	

	private static void pfyear(int empsal, double year) {
		// TODO Auto-generated method stub
		double amount=(empsal*Pfpercentage)/100;
		double month=year*12;
		System.out.println("PF as per total months  : "+ amount*month);
	}

	private static void pfmonth(int empsal) {
		// TODO Auto-generated method stub
		double amount=(empsal*Pfpercentage)/100;
		System.out.println("PF per months: "+amount);
			}
	

}
