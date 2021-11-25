package Fill_training;

import java.io.File;

public class File_txtFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File filename=new File("C:\\Users\\hari2912\\Desktop");
		
		File [] str=filename.listFiles();
		//System.out.println(filename.getName());
		for(File s:str) {
			if(s.isFile()) {
			String str1=s.getName();
			int ival=str1.lastIndexOf(".");
			String str2=str1.substring(ival+1);
			if(str2.equals("txt"))
			System.out.println(str1+"  Size"+s.length());
			
		}
	}
	}

}
