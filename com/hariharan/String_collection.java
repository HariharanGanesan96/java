package com.hariharan;

public class String_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String contentstr="chennai"+","+"Bangalore";
		System.out.println("String :"+contentstr);
		
		StringBuffer content=new StringBuffer();
		content.append("chennai").append(",").append("babgalore");
		System.out.println("String buffer :"+content);
		
		StringBuilder content1=new StringBuilder();
		content1.append("chennai");
		content1.append(",");
		content1.append("bangalore");
		System.out.println("String bulider: "+content1);
	}

}
