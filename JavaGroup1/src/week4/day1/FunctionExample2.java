package week4.day1;

class Numbers{
	int x;
	int y;
}

public class FunctionExample2 {

	public static void swap(Numbers nums) {//Object as parameter
		int tmp = nums.x;
		nums.x=nums.y;
		nums.y=tmp;
		System.out.println(nums.x+",  "+nums.y);
	}
	
	public static void swap(int x, int y) { //x, y -> Parameter(s) -> Formal
		int tmp=x;
		x=y;
		y=tmp;
		System.out.println(x+",  "+y);
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
	
	public static void sub(int x, int y) {
		System.out.println(x-y);
	}
	
	public static void main(String[] args) {
		//Pass by value example
		int x, y, z;
		x=8;
		y=5;
		System.out.println(x+",  "+y);
		swap(x, y); ////Pass by value //x, y -> Argument(s) -> Actual
		System.out.println(x+",  "+y);
		
		//Pass by reference example
		Numbers nums=new Numbers();
		nums.x=9;
		nums.y=6;
		System.out.println(nums.x+",  "+nums.y);
		swap(nums); //Pass by Reference
		System.out.println(nums.x+",  "+nums.y);
		
		z = sum(8, 2);
		System.out.println(x+",  "+y+", "+z);
		sub(6, 7);
		
	}
}
