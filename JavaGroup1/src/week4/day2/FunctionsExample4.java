package week4.day2;

public class FunctionsExample4 {
	
	//Exception in thread "main" java.lang.StackOverflowError
	public static void f1(int num1) {
		System.out.println(num1);
		f1(num1++);
	}
	
	//print from 1 to 10.
	public static void f2(int num1) {
		//code here?
		f2(num1++);
	}
	
	public static void main(String[] args) {
		f1(1);
	}
}
