package jdbcv4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MySQLCRUD extends MySQLConnection implements CRUD{
	//connect():Connection
	//close(Connection)
	
	@Override
	public boolean insert(Person person){
		boolean result=false;
		String sql = "INSERT INTO tbl_person VALUES(?, ?, ?)";
		try {
			Connection conn = connect();
			PreparedStatement pstat=conn.prepareStatement(sql);
			pstat.setInt(1, person.getPID());
			pstat.setString(2, person.getName());
			pstat.setString(3, person.getAddress());
			pstat.executeUpdate();
			pstat.close();
			close(conn);
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
		}
		return result;
	}
	
	@Override
	public Person search(int pid) {
		String sql = "SELECT * FROM tbl_person WHERE pid=?";
		Person person=null;
		try {
			Connection conn = connect();
			PreparedStatement pstat=conn.prepareStatement(sql);
			pstat.setInt(1, pid);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				person=new Person();
				person.setPID(rs.getInt("pid"));
				person.setName(rs.getString("name"));
				person.setAddress(rs.getString("address"));
			}
			pstat.close();
			close(conn);
		}
		catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
		}
		return person;
	}
	
	@Override
	public boolean update(Person person) {
		boolean result=false;
		String sql = "UPDATE tbl_person SET name=?, address=? WHERE pid=?";
		try {
			Connection conn = connect();
			PreparedStatement pstat=conn.prepareStatement(sql);
			pstat.setString(1, person.getName());
			pstat.setString(2, person.getAddress());
			pstat.setInt(3, person.getPID());
			pstat.executeUpdate();
			pstat.close();
			close(conn);
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
		}
		return result;
	}
	
	@Override
	public boolean delete(int pid) {
		boolean result=false;
		String sql = "DELETE FROM tbl_person WHERE pid=?";
		try {
			Connection conn = connect();
			PreparedStatement pstat=conn.prepareStatement(sql);
			pstat.setInt(1, pid);
			pstat.executeUpdate();
			pstat.close();
			close(conn);
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
		}
		return result;
	}
	
	@Override
	public Vector persons() {
		Vector allPersons=new Vector();
		String sql = "SELECT * FROM tbl_person";
		try {
			Connection conn = connect();
			PreparedStatement pstat=conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				Person person=new Person();
				person.setPID(rs.getInt("pid"));
				person.setName(rs.getString("name"));
				person.setAddress(rs.getString("address"));
				allPersons.add(person);
			}
			pstat.close();
			close(conn);
		}
		catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
		}
		return allPersons;
	}
	
}
