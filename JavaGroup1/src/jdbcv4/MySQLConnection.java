package jdbcv4;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
	Connection conn=null;
	public Connection connect() {
		try {
			Class.forName(DBINFO.DRIVER);
			conn = DriverManager.getConnection(DBINFO.URL, DBINFO.DBUSER, DBINFO.USERPASS);
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return conn;
	}
	public void close(Connection conn) {
		try {
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}
