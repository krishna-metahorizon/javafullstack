package fileio_test;

import java.io.File;

public class FileClassTest {

	public static void main(String[] args) {
		//File(String pathname)
		//pathname -> absolute path (drive\folder\file)
		//pathname -> relative path (Current folder\sub folder)
		//File(URI uri) ->uniform resource indicator (file in web/network)
		
		File file;
		boolean result;
		//file = new File("MyFile.txt"); //Relative path
		file = new File("C:/Users/Administrator/Documents/MyFile.txt"); //Absolute path
		System.out.println(".....");
		
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
		if(file.canWrite()) {
			System.out.println("We can write on file");
		}
		else {
			System.out.println("We can not write on file");
		}
	}

}
