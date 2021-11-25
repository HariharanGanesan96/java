package Fill_training;

import java.io.File;
import java.io.IOException;

public class File_creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      File file=new File("C:\\Users\\hari2912\\Desktop\\filefolder\\text.txt");
	    try {
	    	// Its used to create file and use try and catch 
	    	// If any exception throws 
			file.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}

}
