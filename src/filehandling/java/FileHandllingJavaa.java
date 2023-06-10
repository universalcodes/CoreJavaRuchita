package filehandling.java;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandllingJavaa  {
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		
		String filepath_filename = "D:\\Testing Ducat\\DucatProjects\\Ducat\\Ruchita_Java\\Core Java Practice\\ruchita\\check2\\";
		String filepath_filetype= "D:\\Testing Ducat\\DucatProjects\\Ducat\\Ruchita_Java\\Core Java Practice\\ruchita\\check2\\test.html";

		String filewrite = "Yogesh";
		
		File createfile = new File(filepath_filename);
		
		/*
		 * boolean check_folder_status = createfile.mkdir();
		 * System.out.println("The status of my folder\t"+ check_folder_status);
		 * Thread.sleep(5000);
		 */
		  boolean check_delete_status = createfile.delete();
		  System.out.println("The status of check_delete_status\t"+ check_delete_status);
		  Thread.sleep(5000); 
		
		 
			File createfile1 = new File(filepath_filetype);

		
		 boolean check_file_status = createfile1.createNewFile();
		  System.out.println("The status of my file\t"+ check_file_status);
		 
		
			/*
			 * FileWriter filewrt = new FileWriter(filepath_filename);
			 * filewrt.write(filewrite); filewrt.flush();
			 * 
			 * 
			 * FileReader readfile= new FileReader(filepath_filename); int count=
			 * readfile.read(); System.out.println(count); char count1[] = new char [1];
			 * readfile.read(count1); System.out.println(count1);
			 */
	

	}

}
