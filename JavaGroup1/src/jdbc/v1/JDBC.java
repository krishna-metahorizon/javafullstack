package jdbc.v1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
	
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
			conn.close();
			System.out.println("Connect with database successfully");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}