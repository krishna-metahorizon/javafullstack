package week2.day5;

import java.util.Scanner;

public class StudentDetails3 {

	final static int PM = 40;
	final static int SUBJECTS = 3; 
	
	

	//read string from user
	public static String readString(){
		return (new Scanner(System.in).nextLine());
	}

	// type conversion of string to int
	public static int readInt(){
		return Integer.parseInt(readString());
	}

	public static int sum(int firstNumber,int secondNumber){
		return (firstNumber+secondNumber);
	}

	public static float avg(int total, int count){
		return total/count ;
	}
	
	public static void newLine(){
		System.out.println();
	}
	
	public static void printMessage(String message) {
		System.out.print(message);
	}
	public static void printMessage(String message, double value) {
		System.out.print(message+" : "+value);
	}
	public static void printMessage(String message, String value) {
		System.out.print(message+" : "+value);
	}

	public static void main(String[] args) {
		// declare
		int rollNo; // student roll no
		String fullName; // student full name
		int math, sci, eng; // obtain marks of math, science, english
		int total; // total of obtained marks
		float average; // average of obtained marks
		String result; // result of student

		// input


		printMessage("------- Enter Student Details -------- ");
		newLine();

		printMessage("ROLL NO : ");
		rollNo=readInt();

		printMessage("FULLNAME : ");
		fullName=readString();

		printMessage("MATHS : ");
		math=readInt();

		printMessage("SCIENCE : ");
		sci=readInt();

		printMessage("ENGLISH : ");
		eng=readInt();

		// process
		total = sum(sum(sci, math), eng);//calculate total marks
		average = avg(total,SUBJECTS);
		//result = result(sci,math,eng);

		if (sci >= PM && math >= PM && eng >= PM) {
			result = "PASS";
		} else {
			result = "FAIL";
		}

		// output
		System.out.println("Total Marks : " + total);
		System.out.println("Average  : " + average);
		System.out.println("Result : " + result);
	}
}