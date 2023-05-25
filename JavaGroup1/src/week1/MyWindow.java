package week1;

import javax.swing.JFrame; //System defined class

public class MyWindow {
	public static void main(String []args) {
		//how to use existing class?
		//by creating an object
		//by extending - inheritance
		
		//create an object
		JFrame frame;
		frame = new JFrame();
		frame.setSize(250, 175);//width, height
		frame.setTitle("My First Window");//title of the window
		frame.setResizable(false);
		frame.setVisible(true);//display
	}
}
