package week3.day4;

public class ArrayBasics3 {
	public static void main(String[] args) {
		//declare and initialize
		int nums[]= {6,7,3,7,8};
		//increase elements by 1
		for(int i=0; i<nums.length; i++) {
			nums[i]++;
		}
		//print elements
		//processing and accessing
		for(int number:nums) { //for each next loop in java
			System.out.println(number);
		}
	}
}