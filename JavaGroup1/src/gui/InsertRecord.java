package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel; //Label
import javax.swing.JOptionPane;
import javax.swing.JTextField; //TextBox

import jdbc.v3.CRUDV1;

public class InsertRecord extends JFrame implements ActionListener {
	JLabel lblPID, lblName, lblAddress;
	JTextField txtPID, txtName, txtAddress;
	JButton btnSave, btnClose;
	
	public InsertRecord() {
		setTitle("CRUD-1");
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
		
		btnSave=new JButton("SAVE");
		btnSave.setBounds(20, 140, 100, 30);
		btnSave.addActionListener(this);
		
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
		add(btnSave);
		add(btnClose);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnClose) {
			System.exit(0);
		}
		else if(ae.getSource()==btnSave) {
			int pid = Integer.parseInt(txtPID.getText());
			String name = txtName.getText();
			String address=txtAddress.getText();
			boolean result = new CRUDV1().insert(pid, name, address);
			if(result) {
				JOptionPane.showMessageDialog(this, "Save record successfully");
			}
			else {
				JOptionPane.showMessageDialog(this, "Error to save record");
			}
		}
	}
	
	public static void main(String[] args) {
		new InsertRecord();
	}
}