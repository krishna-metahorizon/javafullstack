package week2.day5;

import java.util.Scanner;

public class StudentDetails2 {
	public static void main(String[] args) {
		// declare
		int rollNo; // student roll no
		String fullName; // student full name
		int math, sci, eng; // obtain marks of math, science, english
		int total; // total of obtained marks
		float average; // average of obtained marks
		String result; // result of student
		final int PM = 40;

		// input
		System.out.println("------- Enter Student Details -------- ");
		System.out.print("ROLL NO : ");
		rollNo = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("FULLNAME : ");
		fullName = new Scanner(System.in).nextLine();
		System.out.print("MATHS : ");
		math = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("SCIENCE : ");
		sci = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("ENGLISH : ");
		eng = Integer.parseInt(new Scanner(System.in).nextLine());

		// process
		total = sci + math + eng;
		average = total / 3;
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