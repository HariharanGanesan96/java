package com.hariharan;

public class Student1 {
    private int sno;
    private String name;
    private String number;
    private int amount;
    
    
    Student1(){
    	 sno=0;
    	 name=" ";
    	 number=" ";
    	 amount=0;
    }
    
    Student1(int sno,String name1,String number,int amount){
   	 this.sno=sno;
     this.name=name1;
   	 this.number=number;
   	this.amount=amount;
   }
   
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
    
    
	
	
}
