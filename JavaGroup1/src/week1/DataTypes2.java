package week1;

public class DataTypes2 {
	public static void main(String []args) {
		//Basic types -> boolean, char, byte, short, int, long, float, double
		//Extended types - > String, Object
		
		//User Defined types -> Class	
		// Create new class
		
		// Use?
		Class1 obj1, obj2; //Object declare
		obj1 = new Class1();
		obj2 = new Class1();
		
		//obj1 -> store, retrieve
		//obj1 -> result -> store/retrieve
		
		obj1.result=false;
		obj1.ch='A';
		System.out.println(obj1.result);
		System.out.println(obj1.ch);
		
		obj1.result=true;
		obj1.ch='x';
		System.out.println(obj1.result);
		System.out.println(obj1.ch);
		
		//Reference -> Pointer
		Class2 obj21, obj22, obj23;
		obj21 = new Class2();
		obj22 = obj21;
		obj23 = obj22;
		//store value on obj21
		//retrieve value from obj22
		//update value on obj22
		//retrieve value from obj21
		
		System.out.println(obj21.hashCode());
		System.out.println(obj22.hashCode());
		System.out.println(obj23.hashCode());
		
		//Class3
		Class3 obj31, obj32;
		
		obj31=new Class3();
		obj31.num1=90; //none static
		obj31.num2=89; //static
		System.out.println(obj31.num1+", "+obj31.num2);
		
		obj32 = new Class3();
		System.out.println(obj32.num1+", "+obj32.num2);
		
		Class3.num2=100;
		System.out.println(obj31.num1+", "+obj31.num2);
		System.out.println(obj32.num1+", "+obj32.num2);
		System.out.println(Class3.num2);
		
	}
}
