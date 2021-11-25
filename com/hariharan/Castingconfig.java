package com.hariharan;

public class Castingconfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    byte bval=12;
    double dval=(double) bval;
    System.out.println(dval);
    
    double dval1=34.56;
    float bval1=(float) dval1;
    System.out.println(bval1);
    
    long lval=(long)dval1;
    System.out.println(lval);
	}
  
}
