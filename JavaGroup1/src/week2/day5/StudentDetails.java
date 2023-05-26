package week2.day5;

import java.util.Scanner;

public class StudentDetails {
	// variable are declared as static because the function below are static
	static int[] marks = new int[3]; // declaring integer array
	static String[] subjects = { "Java", "Python", "Larabel" }; // initialization of string array of subject name
	static int totalMarks = 0; // initialization, assigning default value 0 to total marks
	static double averageMarks; // declaring avegragemarks as double variable
	static String result; // declaring result as string variable

	static void inputstudentdetails() {
		// Accept student information
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll No: ");
		int rollNo = sc.nextInt(); // taking input of roll number of student
		sc.nextLine();

		System.out.print("Enter Name: ");
		String name = sc.nextLine(); // taking input of name of student

		System.out.print("Enter Section: ");
		String section = sc.nextLine(); // taking input of section of student

	}

	static void inputmarks() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < marks.length; i++) {
			System.out.print("Enter marks for " + subjects[i] + " : "); // accessing subject array for displaying
			marks[i] = sc.nextInt(); // taking input of marks in array
		}
	}

	static void total() {
		for (int i = 0; i < marks.length; i++) {
			totalMarks += marks[i]; // accessing the marks array and updating the totalmarks in each iteration
		}
		System.out.println("Total marks = " + totalMarks); // displaying the output
	}

	static void average() {
		averageMarks = (double) totalMarks / marks.length; // calculating averagemarks by dividing totalmarks by
															// markslength
		System.out.println("Average marks = " + averageMarks); // displaying output
	}

	static String result() {
		result = averageMarks >= 40 ? "Pass" : "Fail"; // applying ternary operator if condition true
		return result; // return pass as result else return fail as result
	}

	public static void main(String[] args) {
		try {
			inputstudentdetails(); // calling inputstudentdetails function for roll,name and section
			inputmarks(); // takes input in integer array
			System.out.println("Marks:");
			for (int i = 0; i < marks.length; i++) {
				System.out.println(subjects[i] + ": " + marks[i]); // acessing and displaying marks
			}
			total(); // calling total function which adds the student marks
			average(); // calling average function which also display average marks
			System.out.println("Result = " + result()); // calling result function which returns result
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.gc(); // calling garbage collector
		}
	}
}
