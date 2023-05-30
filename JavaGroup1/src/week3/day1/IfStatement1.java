package week3.day1;
import java.util.Scanner;

public class IfStatement1 {

	public static void main(String[] args) {
		int firstNumber; //store input from user
		boolean result;
		System.out.print("Enter any number : "); //prompt for user
		firstNumber = Integer.parseInt(new Scanner(System.in).nextLine()); //reading integer input from user 
		result = (firstNumber==0)?true:false;
		if(result==true) { //Condition
			System.out.println("Zero");		
		}
	}
}