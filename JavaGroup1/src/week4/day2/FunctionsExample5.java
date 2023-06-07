package week4.day2;



public class FunctionsExample5 {
	public void f1() {
		System.out.println("f1");
	}
	public static void f2() {
		System.out.println("f2");
	}
	public final void f3() {
		System.out.println("f3");
	}
}

class FunctionsExample6 extends FunctionsExample5{
	@Override
	public void f1() {
		System.out.println("f11");
	}
	//cann't override static method
	//cann't override final method
}

//non-static method -> object.function() //can override
//static method -> class.function() //cannt override
//final method -> object.function() //cannt override