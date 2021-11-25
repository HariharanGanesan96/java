package com.hariharan;

import java.io.File;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File MyObj=new File("newfile.txt");
	if(MyObj.createNewFile()) {
		System.out.println(" new file created :"+MyObj.getName());
	}
	else {
		System.out.println("file already exit");
	}
}
catch(IOException e){
	System.out.println("error occured");
    e.printStackTrace();
    
}
	}

}
