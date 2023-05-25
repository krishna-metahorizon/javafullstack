package week1;
import javax.swing.JFrame;

public class MyWindow2 extends JFrame{	
	public MyWindow2() {
		setTitle("My Second Window");
		setSize(250, 350);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String []args) {
		new MyWindow2();
	}
}