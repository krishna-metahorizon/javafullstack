package jdbcv4;

import java.util.Vector;

public interface CRUD {
	public boolean insert(Person person); //insert record
	public Person search(int pid); //search record based on pid
	public boolean update(Person person); //update record based on pid
	public boolean delete(int pid); //delete record based on pid
	public Vector persons(); //get all
}
