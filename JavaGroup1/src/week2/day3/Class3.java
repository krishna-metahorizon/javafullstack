package week2.day3;

public class Class3 {
	public static void main(String []args) {
		int x, y, z; //local variables
		x=8;
		y=7;
		f2(x, y); //call method and pass value(s)
	}
	public static void f1() {
		//need to access the value of x and y?
		//System.out.println(x+", "+y);
	}
	public static void f2(int x, int y) { //Define parameter
		x++;
		y++;
		System.out.println(x+", "+y);
	}
}
