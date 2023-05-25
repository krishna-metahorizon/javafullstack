package week2.day1;

public class Class3 implements Inf1{
	//The type Class3 must implement the inherited abstract method Inf1.f1()
	@Override 	//Re-write method -> New Version
	public void f1() {
		System.out.println("Hello from f1 of Class3");
	}
	@Override	//Re-write method -> New Version
	public void f2() {
		System.out.println("Hello from f2 of Class3");
	}
	public void f3() {
		System.out.println("Hello from f3 of Class3");
	}
}