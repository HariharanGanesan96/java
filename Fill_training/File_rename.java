package Fill_training;

import java.io.File;
import java.io.IOException;

public class File_rename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    File name=new File("C:\\Users\\hari2912\\Desktop\\filefolder\\text1.txt");
    try {
		name.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    File newname=new File("C:\\Users\\hari2912\\Desktop\\filefolder\\newtext.txt");
	// To rename a file
    name.renameTo(newname);
	}
   
}
