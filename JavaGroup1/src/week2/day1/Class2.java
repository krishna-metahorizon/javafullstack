package week2.day1;

public class Class2 {
	//Primitive data types
	//boolean, char, byte, short, int , long, float, double
	
	//Non-Primitive data types
	//String, Object, Array, Class & Object, Interface
	
	//Other types
	//enum
	
	//define enum
	public enum WeekDay{SUN, MON, TUE, WED, THU, FRI, SAT}; //options
	
	public static void main(String[] args) {
		 String str1 = new String("Hello how are you?");
		 Object obj = str1; //any type of value
		 
		 Class1 obj1; //Class and Object
		 obj1=new Class1();
		 obj1.num1=87;
		 System.out.println(obj1.num1);
		 
		 //Array
		 boolean []results; //declare
		 char chars[]; //declare
		 results = new boolean[5];
		 chars = new char[5];
		 
		 WeekDay wday = WeekDay.SUN; //SUN to SAT
		 System.out.println(wday);
		 
		 
	}
}
