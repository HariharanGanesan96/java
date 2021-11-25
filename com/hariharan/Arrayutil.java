package com.hariharan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Arrayutil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double a=Math.random();
   System.out.println(a);
	GregorianCalendar date=new GregorianCalendar();
	int day,month,year;
	int min,sec,hr;
	day=date.get(Calendar.DAY_OF_MONTH);
	month=date.get(Calendar.MONTH);
	year=date.get(Calendar.YEAR);
	System.out.println(day+"/"+month+"/"+year);
	LocalDate dat=LocalDate.now();
	System.out.println(dat);
	LocalDateTime tim=LocalDateTime.now();
	System.out.println(tim);
	}
}
