package week3.day1;
import mylibrary.BasicIO;

public class IfStatement7 {

	public static void main(String[] args) {
		//if statement with multiple conditions
		int num1, num2, num3;
		num1 = 8;
		num2 = 3;
		num3 = 5;
		
		if(num1>=num2 && num1>=num3)
			BasicIO.printMessage("Largest Number :", num1);
		if(num2>=num1 && num2>=num3)
			BasicIO.printMessage("Largest Number :", num2);
		if(num3>=num1 && num3>=num2)
			BasicIO.printMessage("Largest Number :", num3);

	}

}
