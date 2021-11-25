package com.hariharan;

public class Twoclass {

	static String getname(final String firstname,final String lastname) {
		return firstname+" "+lastname;

	}

}
class stringname{
	public static void main(String[] args) {
		String firstname="hari";
		String lastname="haran";
		System.out.println(Twoclass.getname(firstname, lastname));
	}
}