package week3.day4;
import mylibrary.BasicIO;

public class ArrayBasics2 {

	public static void main(String[] args) {
		final int MAX = 5;
		int nums[]=new int[MAX];
		
		//Input
		for(int i=0; i<MAX; i++) {
			BasicIO.printMessage("Enter number"+(i+1)+" : ");
			nums[i]=BasicIO.readInt();
		}
		
		//Processing
		//Add, Sub, Prd, Div, Pow, Sqrt, and others
		for(int i=0; i<MAX; i++) {
			nums[i]=nums[i]+1;
		}
		
		//Output
		for(int i=0; i<nums.length; i++) {
			BasicIO.printMessage("Value "+(i+1)+" : "+nums[i]);
		}

	}

}
