package jdbc.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CRUDV1 extends MySQLConnection{

	public boolean insert(int pid, String name, String address) {
		boolean result = false;
		String sql = "INSERT INTO tbl_person VALUES (?, ?, ?)";
		try {
			Connection conn=connect(); //Connect with db
			//Insert Record
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid); //Set PID
			pstat.setString(2, name); //Set Name
			pstat.setString(3, address); //Set Address
			pstat.executeUpdate(); //Run the SQL Statement
			pstat.close();//Statement close
			close(conn); //Close connection
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}

	public boolean search(int pid) {
		boolean result = false;

		return result;
	}

	public void selectAll() {

	}

	public boolean update(int pid, String name, String address) {
		boolean result = false;

		return result;
	}
	
	public boolean delete(int pid) {
		boolean result = false;

		return result;
	}
}