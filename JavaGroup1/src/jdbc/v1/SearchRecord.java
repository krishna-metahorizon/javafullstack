package jdbc.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchRecord {
	
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
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS); //Connect with DB
			
			//Select All Records
			Statement stat = conn.createStatement(); //Object which used to run SQL Statements
			String sql="SELECT * FROM tbl_person WHERE pid=1"; //SQL Query
			ResultSet rs = stat.executeQuery(sql); //Get all records from table
			System.out.println("PID\tNAME\t\tADDRESS");
			while(rs.next()) { //return true while record found
				System.out.println(rs.getInt("pid")+"\t"+rs.getString("name")+"\t\t"+rs.getString("address"));
			}
			rs.close();
			stat.close();
			conn.close();
			System.out.println("Search record successfully");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}