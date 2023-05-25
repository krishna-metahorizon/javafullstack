package week2.day2;
public class Class1 {
	public static void main(String[] args) {
		//Core Java
		//1. Character Set
		//Valid Characters to write source code - 256
		
		//2. Keywords
		//Pre-defined words in java - 50
		
		//3. Data Types
		//Primitive data types
		//boolean, char, byte, short, int, long, float, double
		
		//Referenced types
		//String, Object, Class & Object, Interface
		
		//Object obj1 = 123;
		//System.out.println(obj1);
		//HW -> which type of value in obj1?
		//int x = (int) obj; //casting
		
		//Other
		//enum
		
		//4. Identifier
		//name of variable (general/constant), method/function, class, object, interface, enum
		//User defined keyword
		//HW -> Naming convention of identifiers?
		
		//5. Variable
		//Declare, Assign, Access, Update
		//Lifetime, and Visibility (scope)
		
		boolean result, result2; //declare -> memory allocation with types, and range
		result=false; //assign
		System.out.println(result);//access
		result=true; //update
		result2=result; //access and assign
		System.out.println(result2); //access
		
		//6. Operators
		//Character set (characters)
		//Value
		//Instructions -> Operator
		
		//Category -> Unary, Binary, Ternary
		// x = 20+30;
		// variable = operand operator operand
		// operand operator operand
		
		//Unary
		// One Operand (Value); One Operator (Instruction)
		
		//Binary
		//Operand Operator Operand
		
		//Ternary
		//Operand Operator Operand Operator .....
		
		//[] {} () . ; , 
		
		//Binary
		//Assignment Operator
		// Simple Assignment
		int x = 9; //Nine assign to x
		
		//Multiple assignment
		int a,b,c; //multiple declare
		a=b=c=9; //multiple assignment
		//9 assign to c; value of c assign to b; value of b assign to a
		
		//Short-hand assignment
		int d=9;//declare d and initialize by 9
		int e;//declare e
		d = 89; //update d by 89
		System.out.println(d); //access d
		e = d; //value of d assign to e
		System.out.println(e);
		e+=2; //e=e+2; //+=, -=, *=, /=, %=
		System.out.println(e);
		
		//Arithmetic operator
		//+, -, *, /, %
		//Math.pow(base, exponent)
		//Math.sqrt(value)
		//+ (number + number)
		// (String + number)
		// (number + String)
		
		// HW -> Explore Math class.
		
		//Relational Operators - Two Values
		//Condition -> boolean
		//Value1 RO Value2 (Condition) -> true/false
		// ==, !=, >, >=, <=
		
		//Logical Operator
		//More than two values
		//&&, ||
		//!
		
		// Condition1 && Condition2 -> boolean
		// Condition1 || Condition2 -> boolean
		// !boolean -> Reverse
		
		//Bitwise->Low level operator
		
		//Others
		//[] {} () . , ; ? :
		
		//Conditional operator
		//(Condition)?Result1:Result2
		
//Program Structure
		//Naming Conventions and Comments
		//declare //memory allocate
		try{
			//declare local variable(s)
			//input
			//process
			//output
		}
		catch(Exception ex) {
			//error message
		}
		finally {
			//memory clear
		}
		
		//HW -> 
		//Statement ?
		//Expression?
		//Block?
		//Block types?
		//Function?
		
	}
}