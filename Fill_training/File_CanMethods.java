package Fill_training;

import java.io.File;

public class File_CanMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  File newname=new File("C:\\Users\\hari2912\\Desktop\\filefolder\\newtext.txt");
		System.out.println(newname.getName());
		
		// to know we can perform operation or not	
		System.out.println("Can execute :"+newname.canExecute());
		System.out.println("Can Read :"+newname.canRead());
		System.out.println("Can Write :"+newname.canWrite());
	}

}
