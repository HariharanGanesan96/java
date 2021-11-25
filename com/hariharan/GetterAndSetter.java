package com.hariharan;

public class GetterAndSetter {

	   private String CusName;
	   private int CusID;
	   
	   public int setld(int CustmerId) {
		   return this.CusID=CustmerId;
	   }	
	   public int getid() {
		   return CusID;
	   }
	   //Alt+Shift+s
	   public String getCusName() {
			return CusName;
		}
		public void setCusName(String cusName) {
			CusName = cusName;
		}
	   
}
