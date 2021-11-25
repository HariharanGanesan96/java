package Fill_training;

import java.io.File;
import java.util.Arrays;

public class File_ListAllFilesAndFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   File file=new File("C:\\Users\\hari2912\\Desktop");
   
   // To show Folder and file names
   String[] str=file.list();
   for(String s:str) {
  // System.out.println(s);
	}
   File file1=new File("C:\\Users\\hari2912\\Desktop");
   // listFiles() To show Folder and file names with path
   
   File[] filevalue=file1.listFiles();
   for(File f:filevalue) {  
	   // isFile(); method return true when the parameter denotes file
	   if(f.isFile()) {
		   
		   System.out.println(f);
	   }
   }
   for(File f:filevalue) {  
	   // isDirectory(); method return true when the parameter denotes folder
	   if(f.isDirectory()) {
		   System.out.println(f);
	   }
   }
   }

}
