package week2.day5;

import java.util.Scanner;

public class StudentDetails2 {
	
	final static int PASS_MARKS = 40;
	final static int SUBJECTS = 3;
	
	//Read String from User
	public static void printMessage(String message) {
		System.out.print(message);
	}
	
	public static void printMessage(String message, double value) {
		System.out.print(message+" : "+value);
	}
	
	public static void printMessage(String message, String value) {
		System.out.print(message+" : "+value);
	}
	
	public static void newLine() {
		System.out.println();
	}
	
	public static String readString() {
		return (new Scanner(System.in).nextLine());
	}
	
	public static int readInt() {
		return Integer.parseInt(readString());
	}
	
	public static int sum(int firstNumber, int secondNumber) {
		return (firstNumber+secondNumber);
	}
	public static float avg(int total, int count) {
		return total/count;
	}
	
	public static String result(int math, int science, int english) {
		String result = "";
		if (science >= PASS_MARKS && math >= PASS_MARKS && english >= PASS_MARKS) {
			result = "PASS";
		} else {
			result = "FAIL";
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		// declare
		int rollNo; // student roll no
		String fullName; // student full name
		int math, science, english; // obtain marks of math, science, english
		int totalMarks; // total of obtained marks
		float averageMarks; // average of obtained marks
		String result; // result of student
		
		// input
		printMessage("------- Enter Student Details -------- ");
		newLine();
		
		printMessage("ROLL NO : " );
		rollNo = readInt();
		
		printMessage("FULLNAME : " );
		fullName = readString();
		
		printMessage("MATHS : " );
		math = readInt();
		
		printMessage("SCIENCE : " );
		science = readInt();
		
		printMessage("ENGLISH : " );
		english = readInt();

		// process
		totalMarks = sum(sum(science, math),  english); //calculate total marks
		averageMarks = avg(totalMarks, SUBJECTS); // calculate average marks
		result = result(science, math, english);
		
		// output
		printMessage("Total Marks : ", totalMarks);
		newLine();
		printMessage("Average : ", averageMarks);
		newLine();
		printMessage("Result : ", result);
		newLine();
	}
}