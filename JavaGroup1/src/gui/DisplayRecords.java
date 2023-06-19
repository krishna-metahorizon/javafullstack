package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DisplayRecords extends JFrame implements ActionListener{	
	JTable table; //user interaction -> programming
	DefaultTableModel dtm; //set columns //set rows
	JScrollPane sc;
	JButton btnExport;
	
	public DisplayRecords() {
		setTitle("Display All Records");
		setSize(550, 300);
		setResizable(true);
		setLayout(null);
		
		table = new JTable();
		dtm = new DefaultTableModel();
		table.setModel(dtm);
		sc = new JScrollPane(table);
		
		dtm.addColumn("PID");
		dtm.addColumn("NAME");
		dtm.addColumn("ADDRESS");
		try {
			//Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connect with DB
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql12624803", "root", "Metahorizon@123");
			//Execute SQL Statement
			PreparedStatement pstat = conn.prepareStatement("SELECT * FROM tbl_person");
			ResultSet rs = pstat.executeQuery();
			//Loop Start
			while(rs.next()) {
				//dtm.addRow(new Object[]{1, "Raj","Lat"});
				dtm.addRow(new Object[]{rs.getInt("pid"), rs.getString("name"),rs.getString("address")});
			}
			//Loop End
			pstat.close();
			conn.close();
			//Close Connection
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		sc.setBounds(20, 20, 500, 175);
		btnExport = new JButton("Export");
		btnExport.addActionListener(this);
		
		btnExport.setBounds(20, 220, 75, 40);
		
		add(sc);
		add(btnExport);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DisplayRecords();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnExport) {
			int ROWS = table.getRowCount();
			for(int i=0; i<ROWS; i++) {
				String strRow = table.getValueAt(i, 0)+","+table.getValueAt(i, 1)+","+table.getValueAt(i, 2);
				System.out.println(strRow); //Write on file (i.e. data.csv)
				//Write String on file
			}
		}
		
	}
}