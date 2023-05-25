package week1;

public class Class4Test {
	public static void main(String[] args) {
		Class4 obj41;
		Class4 obj42;
		obj41 = new Class4();
		obj41.f1();
		obj41.f2();
		//Class4.f1(); //Cannot make a static reference to the non-static method f1() from the type Class4
		Class4.f2();
		//obj42.f2(); //The local variable obj42 may not have been initialized
	}
}