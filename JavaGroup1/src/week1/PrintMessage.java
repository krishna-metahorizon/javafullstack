package week1;
//step into/step over
public class PrintMessage {
	public static void main(String []args) {
		hello();
		hello("Metahorizon");
		hello();
		hello("Raj thapa");
	}
	public static void hello() {
		System.out.println("Hello from hello");
	}
	public static void hello(String message) {
		System.out.println("Message : "+message);
	}
}