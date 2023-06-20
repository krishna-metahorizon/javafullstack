package jdbcv4;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		return new Person();
	}
	
	@Override
	public boolean update(Person person) {
		return false;
	}
	
	@Override
	public boolean delete(int pid) {
		return false;
	}
	
	@Override
	public Vector persons() {
		Vector allPersons=new Vector();
		return allPersons;
	}
	
}
