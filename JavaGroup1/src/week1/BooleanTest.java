package week1;

import java.lang.Boolean;

public class BooleanTest {

	public static void main(String[] args) {
		Boolean b1, b2;
		b1= new Boolean(true); //The constructor Boolean(boolean) has been deprecated and marked for removal
		b2 = new Boolean("true");
		System.out.println(b1);
		System.out.println(b2);
		boolean result = b1.booleanValue(); //none static
		System.out.println(result);
		int result2 = Boolean.compare(b1, b2);
		System.out.println(result2); //0-> equals | None Zero -> Not equals
	}

}
