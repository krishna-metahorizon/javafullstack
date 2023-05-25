package week2.day3;

public class Class4 {

	public static void main(String[] args) {
		//1. Declare two variables of int type
		int a, b;
		//2. Assign two different values
		a=8;
		b=7;
		//7.call f3() and pass value of a and b
		f3(a, b);
		//8. print value of a and b
		System.out.println(a+", "+b);
	}
	//3. create a function which accept two parameters of int type
	public static void f3(int a, int b) {
		int tmp;
		//4. print value of parameters
		System.out.println(a+", "+b);
		//5. Swap value of parameters (Exchange)
		tmp =a;
		a=b;
		b=tmp;
		//6. print value of parameters
		System.out.println(a+", "+b);
	}
}
