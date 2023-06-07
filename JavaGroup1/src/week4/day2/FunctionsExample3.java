package week4.day2;
class Numbers{
	int x;
	int y;
	int z;
	
	@Override
	public String toString() {
		return (this.x+", "+this.y+", "+this.z);
	}
}

public class FunctionsExample3 {
	
	public static Numbers f4(Numbers numbers) {
		numbers.x++;
		numbers.y++;
		numbers.z=numbers.x+numbers.y;
		return numbers;
	}
	
	public static void f3(Numbers numbers) {
		numbers.x++;
		numbers.y++;
		numbers.z=numbers.x+numbers.y;
	}
	
	public static Numbers f2(int x, int y) {
		x++;
		y++;
		//Object
		Numbers nums = new Numbers();
		nums.x=x;
		nums.y=y;
		nums.z=x+y;
		return nums;
	}
	public static int[] f1(int x, int y) {
		x++;
		y++;
		//Array
		int nums[]= {x, y, x+y};
		return (nums);
	}
	public static void main(String[] args) {
		//Creating function - ok
		//Calling function - ok
		//Passing value(s) to function - ok
		//Returning value(s) from function - ok
		int nums[] = f1(4,5);
		for(int num:nums) {
			System.out.println(num);
		}
		
		Numbers numbers = f2(6,7);
		System.out.println(numbers);
		
		Numbers nums2 = new Numbers();
		nums2.x=9;
		nums2.y=4;
		System.out.println(nums2); //9, 4, 0
		f3(nums2); //function call and receive Numbers
		System.out.println(nums2); //9, 4, 0
		
		Numbers nums3 = new Numbers();
		Numbers nums4;
		nums3.x=9;
		nums3.y=4;
		
		nums4 = f4(nums3);
		
	}
}