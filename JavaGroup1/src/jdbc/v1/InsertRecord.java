package jdbc.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
	
	public static void main(String[] args) {
		//Declaration
		final String DRIVER = "com.mysql.cj.jdbc.Driver"; 
		final String HOST = "sql12.freemysqlhosting.net"; //localhost
		final String DBNAME="sql12624803";
		final int PORT =3306;
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		final String DBUSER="sql12624803";
		final String DBPASS="6p9k3h3bWq";
				
		try {
			//Connection
			Class.forName(DRIVER); //Loading driver
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS); //Connect with db
			
			//Insert Record
			Statement stat = conn.createStatement();
			String sql="INSERT INTO tbl_person VALUES(1, 'Raj Thapa', 'KTM')";
			stat.executeUpdate(sql);
			stat.close();
			
			conn.close();
			System.out.println("Insert record successfully");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}