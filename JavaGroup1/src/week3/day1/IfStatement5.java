package week3.day1;
import mylibrary.BasicIO;

public class IfStatement5 {

	public static void main(String[] args) {
		BasicIO.printMessage("Enter any number : ");
		int firstNumber=BasicIO.readInt(); //input from user
		
		if(firstNumber==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Non-Zero");
		}
	}
}
