package week3.day2;
import mylibrary.BasicIO;
public class SwitchCase3 {

	public static void main(String[] args) {
		//Enter any character : _A | B
		//A is Vowel.
		
		//Enter any character : _B
		//B is Consonant.
		char ch;
		System.out.println("Enter any character : ");//prompt for user
		ch = BasicIO.readChar();//read character value
		switch(ch) {
			case 'A':
			case 'a':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
		}

	}

}
