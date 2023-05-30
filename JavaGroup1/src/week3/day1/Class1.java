package week3.day1;

public class Class1 {
	//Application of static block?
	static
	{
		System.out.println("Hello");
	}
	
	static
	{
		System.out.println("Hello-2");
	}
	
	public static void main(String[] args) { //Block Start
		//Expression - Valid Java Term (code)
		int firstNumber, secondNumber, thirdNumber; //Statement
		firstNumber = 45;
		secondNumber = 32;
		thirdNumber = firstNumber+secondNumber;
		System.out.println(thirdNumber);
	} //Block Close
	
	static
	{
		System.out.println("Hello-3");
	}
}
