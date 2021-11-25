package Fill_training;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.Arrays;

public class File_writeAndRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    File file=new File("C:\\Users\\hari2912\\Desktop\\newtext.txt");
    
    try {
    	// FileWriter class used to write a document
		FileWriter write=new FileWriter(file,true);
		//write method is used to write the data
		write.write(" its do append operation");
		//flush method is used to push data into file
		write.flush();
		write.close();
		// file reader class is used to read the data in file
		FileReader read=new FileReader(file);
		//length method return a long value but array don't have 
		//long value so we have to casting into integer
		char [] ch=new char[(int)file.length()];
		// read method is used to read the file and return hashcode 
		//value  and if we give char array to read method is get the 
		// value in character array
		read.read(ch);
		System.out.println(Arrays.toString(ch));

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
