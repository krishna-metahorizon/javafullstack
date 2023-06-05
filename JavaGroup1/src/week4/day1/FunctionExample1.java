package week4.day1;

public class FunctionExample1 {
	//add two numbers
	public static int sum(int num1, int num2) {
		return num1+num2; //return sum of num1 and num2
	}
	
	//print label and value
	public static void printMessage(String label, int num1 ) {
		System.out.println(label+" : "+num1);
	}
	
	public static void main(String[] args) {
		int num1, num2, num3;
		num1=56;
		num2=32;
		/*
		num3=num1+num2; //Task1 -> num3 = sum (num1, num2)
		System.out.println(num3);
		num1=32;
		num2=45;
		num3=num1+num2; //Task2 -> num3 = sum(num1, num2)
		System.out.println(num3);
		*/
		
		//num3=num1+num2; //Task1 -> num3 = sum (num1, num2)
		num3 = sum (num1, num2);
		printMessage("SUM", num3);
		num1=32;
		num2=45;
		num3 = sum (num1, num2);
		printMessage("SUM", num3);
		
	}
	/*
		Why function?
		- Code - Reuse
		- Code - Read/Maintenance
	 */
	
	
}
