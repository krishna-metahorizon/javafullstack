package week2.day1;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyWindow {
	JFrame frame;
	JTextField txt1, txt2, txt3;
	JButton btnAdd;
	
	public MyWindow() {
		frame = new JFrame();
		frame.setSize(350, 250); //height and width
		frame.setLayout(null);
		
		txt1 = new JTextField(); //object initialize
		txt1.setBounds(20, 20, 120, 25); //set values
		
		txt2 = new JTextField();
		txt2.setBounds(20, 50, 120, 25);
		
		txt3 = new JTextField();
		txt3.setBounds(20, 80, 120, 25);
		
		btnAdd = new JButton();
		btnAdd.setText("ADD");
		btnAdd.setBounds(20, 110, 75, 25);
		
		frame.add(txt1);
		frame.add(txt2);
		frame.add(txt3);
		frame.add(btnAdd);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWindow();
	}
}