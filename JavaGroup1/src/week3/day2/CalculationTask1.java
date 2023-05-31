package week3.day2;
import mylibrary.BasicIO;
public class CalculationTask1 {
	static int firstnumber,secondnumber;
	public static void display()
	{
		BasicIO.printMessage("1. Addition ");
		BasicIO.newLine();
		BasicIO.printMessage("2. Subtraction ");
		BasicIO.newLine();
		BasicIO.printMessage("3. Multiplication ");
		BasicIO.newLine();
		BasicIO.printMessage("4. Division ");
		BasicIO.newLine();
		BasicIO.printMessage("5. Exit ");
		BasicIO.newLine();
	}
	public static int add()
	{
		BasicIO.printMessage("Enter first Number");
		firstnumber = BasicIO.readInt();
		BasicIO.printMessage("Enter second Number");
		secondnumber = BasicIO.readInt();
		return (firstnumber+secondnumber);
	}
	public static int sub()
	{
		BasicIO.printMessage("Enter first Number");
		firstnumber = BasicIO.readInt();
		BasicIO.printMessage("Enter second Number");
		secondnumber = BasicIO.readInt();
		return (firstnumber-secondnumber);
	}
	public static int mul()
	{
		BasicIO.printMessage("Enter first Number");
		firstnumber = BasicIO.readInt();
		BasicIO.printMessage("Enter second Number");
		secondnumber = BasicIO.readInt();
		return (firstnumber*secondnumber);
	}
	public static double div()
	{
		BasicIO.printMessage("Enter first Number");
		firstnumber = (int) BasicIO.readDouble();
		BasicIO.printMessage("Enter second Number");
		secondnumber = (int) BasicIO.readDouble();
		return (firstnumber/secondnumber);
	}
	public static void exit()
	{
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		int option;
		display();
		BasicIO.printMessage("Enter option");
		option = BasicIO.readInt();
		switch(option)
		{
		case 1:
			BasicIO.printMessage("Addition = ",add());
			break;
		case 2:
			BasicIO.printMessage("Addition = ",sub());
			break;
		case 3:
			BasicIO.printMessage("Addition = ",mul());
			break;
		case 4:
			BasicIO.printMessage("Addition = ",div());
			break;
		default:
			System.out.println("Insert Valid Input");
				
	}
	}

}
