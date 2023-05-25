import java.util.Scanner;

public class Fifth{
	public static void main(String []args){
		//declare
		int num1, num2, num3;
		try{
			//input
			System.out.print("Enter first no : ");
			num1 = Integer.parseInt(new Scanner(System.in).nextLine());
			
			System.out.print("Enter second no : ");
			num2 = Integer.parseInt(new Scanner(System.in).nextLine());	
			
			//processing
			num3 = num1 + num2;
			
			//output
			System.out.println("Sum :"+num3);
		}
		catch(Exception ex){
			System.out.println("Error : "+ex.getMessage());
		}
	}
}