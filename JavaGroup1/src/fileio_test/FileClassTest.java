package fileio_test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileClassTest {

	public static void main(String[] args) {
		//File(String pathname)
		//pathname -> absolute path (drive\folder\file)
		//pathname -> relative path (Current folder\sub folder)
		//File(URI uri) ->uniform resource indicator (file in web/network)
		
		/*
		File file;
		boolean result;
		//file = new File("MyFile.txt"); //Relative path
		file = new File("C:/Users/Administrator/Documents/MyFile.txt"); //Absolute path
		System.out.println(".....");
		*/
		
		//boolean canExecute()
		/*
		result = file.canExecute();
		if(result) {
			System.out.println("File can executed");
		}
		else {
			System.out.println("File can't execute");
		}
		*/
		
		//boolean canRead()
		/*
		if(file.canRead()) {
			System.out.println("We can read file");
		}
		else {
			System.out.println("We can not read file");
		}
		*/
		
		//boolean canWrite()
		/*
		if(file.canWrite()) {
			System.out.println("We can write on file");
		}
		else {
			System.out.println("We can not write on file");
		}
		*/
		
		//long getTotalSpace()
		/*
		File file = new File("C:/Users/Administrator/Documents/MyFile.txt");
		long result = file.getTotalSpace();
		System.out.println(result/1024/1024/1024);
		*/
		
		//Getting the size of current file?
		//long length()
		/*
		File file = new File("C:/Users/Administrator/Documents/MyFile.txt");
		long result = file.length();
		System.out.println(result+" bytes");
		*/
		
		//Copy file?
		/*
		try {	
			File file1 = new File("C:/Users/Administrator/Documents/MyFile1.txt");
			File file2 = new File("C:/Users/Administrator/Documents/MyFile2.txt");
			Files.copy(file1.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File copy successfully");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		*/
		
		//Copy all the files from source folder to destination folder.
		String srcPath ="C:/Users/Administrator/Documents/MyFolder1";
		String destPath = "C:/Users/Administrator/Documents/MyFolder2";
		
		try {
			File files[] = new File("C:/Users/Administrator/Documents/MyFolder1").listFiles();
			for(File file: files) {
				System.out.println(file.getName()); //Copy file to destination folder?
				Files.copy(srcPath+"/"+file.getName(), 
						destPath+"/"+file.getName(), 
						StandardCopyOption.REPLACE_EXISTING);
				
			}
		}
		catch(Exception ex) {
			
		}
	}
}