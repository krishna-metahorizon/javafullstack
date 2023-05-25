package week2.day1;

public class Class1Test {

	public static void main(String[] args) {
		Class1 obj1, obj2;
		obj1 = new Class1();
		System.out.println(obj1.num1); //instance variable
		System.out.println(obj1.num3); //instance variable
		System.out.println(obj1.num2); //instance variable
		System.out.println(Class1.num2); //Class variable
		System.out.println(Class1.num4); //Class variable
		System.out.println(obj1.num4); //instance variable
		
		//obj1.num3 = 45; //Read only The final field Class1.num3 cannot be assigned
		//Class1.num4=56; //Read only The final field Class1.num3 cannot be assigned
	}
}
