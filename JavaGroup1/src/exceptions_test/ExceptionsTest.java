package exceptions_test;

import java.io.File;

import mylibrary.BasicIO;
public class ExceptionsTest {
	public static void main(String[] args) {
		//declare
		int x;
		int y;
		int z;
		try {
			//input
			System.out.print("Enter first no : ");
			x = BasicIO.readInt(); //read from user
			System.out.print("Enter second no : ");
			y = BasicIO.readInt(); //read from user
			
			//process
			z=x/y;
			
			//output
			System.out.println("Result : "+z);
		}
		catch(NumberFormatException nfe) {
			System.out.println("Error1 : "+nfe);
		}
		catch(ArithmeticException ae) {
			System.out.println("Error2 : "+ae);
		}
		catch(Exception e) {
			System.out.println("Error3 : "+e);
		}
		finally {
			System.out.println("End!");
		}
		
	}
}
//Reading references
//https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html