package week1;

public class DataTypes {
	public static void main(String []args) {
		//Basic Types | Primitive data types
		//1. boolean - true/false
		/*
		boolean result; //The local variable result may not have been initialized
		System.out.println(result);
		*/
		/*
		boolean result=false;
		System.out.println(result);
		result=true;
		System.out.println(result);
		*/
		
		//2. char - Character -> ''
		/*
		char कक='क';
		System.out.println(कक);
		
		char ch ='Z';
		System.out.println(ch);
		ch='9';
		System.out.println(ch);
		*/
		
		//3. byte
		byte bn = 123;
		System.out.println(bn);
		
		//byte bn = 1234;
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from int to byte
		//System.out.println(bn);
		
		//4. short
		short sn = 1234;
		System.out.println(sn);
		
		//5. int
		int in = 123456;
		System.out.println(in);
		
		//6. long
		long ln = 123456789;
		System.out.println(ln);
		
		//7. float
		float fn=123.456f;
		System.out.println(fn);
		
		//8. double
		double dn = 123.456789;
		System.out.println(dn);
		
		//9. String -> "character(s)"
		String str1 = "";
		System.out.println(str1);
		
		//10. Object
		Object obj1=true;
		System.out.println(obj1);
		obj1=false;
		System.out.println(obj1);
		obj1='A';
		System.out.println(obj1);
		obj1=123;
		System.out.println(obj1);
		obj1=45678;
		System.out.println(obj1);
		obj1=12345.6789f;
		System.out.println(obj1);
		obj1=2353.85475471;
		System.out.println(obj1);
		obj1="Kathmandu";
		System.out.println(obj1);
		Object obj2=obj1;
		System.out.println(obj2);
		
		//Memory Space?
		//Data Range?
		
		//How to store?
		//Image
		//File
		//Sound
		//Video
	}
}
