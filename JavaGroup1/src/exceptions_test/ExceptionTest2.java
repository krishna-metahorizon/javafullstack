package exceptions_test;

import mylibrary.BasicIO;

class LowRange extends Exception{ //sub class of Exception class
	public LowRange(String message) {
		super(message);
	}
}

class HighRange extends Exception{//sub class of Exception class
	public HighRange(String message) {
		super(message);
	}
}

public class ExceptionTest2 {
	public static void main(String[] args) {
		//declare
		int age;
		BasicIO.printMessage("Enter your age : ");// age between 18 to 30.
		age = BasicIO.readInt();
		if(age<18) {
			BasicIO.printMessage("Age Status", "Low range");
		}
		else if(age>30) {
			BasicIO.printMessage("Age Status", "High range");
		}
		else {
			BasicIO.printMessage("Age Status", "Within range");
		}
	}
}
