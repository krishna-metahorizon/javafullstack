package jdbc.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import global.Global;

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
		String sql = "SELECT * FROM tbl_person WHERE pid=?";
		Global.pid=-1;
		try {
			Connection conn=connect(); //Connect with db
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				result=true;
				Global.pid = rs.getInt("pid");
				Global.name = rs.getString("name");
				Global.address = rs.getString("address");
			}
			pstat.close();
			rs.close();
			close(conn);
		}
		catch(Exception ex) {
			Global.pid=-1;
			System.out.println("Error : "+ex.getMessage());
		}
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