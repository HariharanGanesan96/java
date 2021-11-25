package Fill_training;

import java.io.File;

public class Folder_Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  // File class is used for file write and read operations	
	  // We need give path of folder in File class constructor 
      File file=new File("C:\\Users\\hari2912\\Desktop\\filefolder");
      // Used to know folder or file present or Not 
      file.exists();
      System.out.println(file.exists());
      if(file.exists()==false) {
    	  
    	  // To create folder
    	  file.mkdir();
      }
      System.out.println(file.exists());
      
      File file1=new File("C:\\Users\\hari2912\\Desktop\\filefolder\\folder1\\folder2");
	  // To create multiple folder in continuous path
      file1.mkdirs();
	
	}

}
