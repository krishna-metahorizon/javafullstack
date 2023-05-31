package week3.day2;
import mylibrary.BasicIO;
public class IfStatement8 {

	public static void main(String[] args) {
		//Difference between if and switch case statement?
		BasicIO.printMessage("Enter any number (1-7) : ");
		int day=BasicIO.readInt(); //Sun -> 1 to Sat -> 7 (-1, 9, 1, 3, 6, 7)
		if((day<1) || (day>7)) {
			System.out.println("out of range");
		}
		else if(day == 1) {
			System.out.println("SUN");
		}
		else if(day == 2) {
			System.out.println("MON");
		}
		else if(day == 3) {
			System.out.println("TUE");
		}
		else if(day == 4) {
			System.out.println("WED");
		}
		else if(day == 5) {
			System.out.println("THU");
		}
		else if(day == 6) {
			System.out.println("FRI");
		}
		else if(day == 7) {
			System.out.println("SAT");
		}
	}
}