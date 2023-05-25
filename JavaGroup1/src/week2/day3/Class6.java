package week2.day3;

public class Class6 {
	public static void main(String[] args) {
		Class5 obj51;
		obj51=new Class5();
		obj51.x=9;
		obj51.y=5;
		System.out.println(obj51); //toString()
		f2(obj51); //Pass by Reference?
		//f3(obj51); //Pass by Value? HW
		System.out.println(obj51);
	}
	public static void f2(Class5 obj51) {
		int tmp = obj51.x;
		obj51.x=obj51.y;
		obj51.y=tmp;
		System.out.println(obj51);
	}
}