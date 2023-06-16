package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel; //Label
import javax.swing.JOptionPane;
import javax.swing.JTextField; //TextBox

import global.Global;
import jdbc.v3.CRUDV1;

public class CRUD2 extends JFrame implements ActionListener {
	JLabel lblPID, lblName, lblAddress;
	JTextField txtPID, txtName, txtAddress;
	JButton btnSearch, btnClose;
	
	public CRUD2() {
		setTitle("Search Record");
		setSize(350, 300);
		setResizable(false);
		
		lblPID=new JLabel("PID : ");
		lblPID.setBounds(20, 20, 70, 30);
		
		txtPID=new JTextField();
		txtPID.setBounds(100, 20, 140, 30);
		
		lblName=new JLabel("NAME : ");
		lblName.setBounds(20, 60, 70, 30);
		
		txtName=new JTextField();
		txtName.setBounds(100, 60, 140, 30);
		
		lblAddress=new JLabel("ADDRESS : ");
		lblAddress.setBounds(20, 100, 70, 30);
		
		txtAddress=new JTextField();
		txtAddress.setBounds(100, 100, 140, 30);
		
		btnSearch=new JButton("SEARCH");
		btnSearch.setBounds(20, 140, 100, 30);
		btnSearch.addActionListener(this);
		
		btnClose=new JButton("CLOSE");
		btnClose.setBounds(150, 140, 100, 30);
		btnClose.addActionListener(this);
		
		setLayout(null);
		
		add(lblPID);
		add(txtPID);
		add(lblName);
		add(txtName);
		add(lblAddress);
		add(txtAddress);
		add(btnSearch);
		add(btnClose);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnClose) {
			System.exit(0);
		}
		else if(ae.getSource()==btnSearch) {
			int pid = Integer.parseInt(txtPID.getText());
			boolean result = new CRUDV1().search(pid);
			if(result) {
				txtName.setText(Global.name);
				txtAddress.setText(Global.address);
				JOptionPane.showMessageDialog(this, "Search record successfully");
			}
			else {
				txtName.setText("");
				txtAddress.setText("");
				JOptionPane.showMessageDialog(this, "Error to search record");
			}
		}
	}
	
	public static void main(String[] args) {
		new CRUD2();
	}
}