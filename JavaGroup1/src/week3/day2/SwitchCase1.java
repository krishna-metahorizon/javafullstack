package week3.day2;

public class SwitchCase1 {

	public static void main(String[] args) {
		int num1=0;
		
		if(num1==0)
			System.out.println("Zero");
		else if(num1==1)
			System.out.println("One");
		else if(num1==2)
			System.out.println("Two");
		else if(num1==3)
			System.out.println("Three");
		else if(num1==4)
			System.out.println("Four");
		else if(num1==5)
			System.out.println("Five");
		else if(num1==6)
			System.out.println("Six");
		else if(num1==7)
			System.out.println("Seven");
		else
			System.out.println("Others");

		switch(num1) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			default:
				System.out.println("Others");
		}
	}
}
