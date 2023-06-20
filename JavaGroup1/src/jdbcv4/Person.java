package jdbcv4;

public class Person {
	//Instance variables
	int pid;
	String name;
	String address;
	
	public Person() {//Default Constructor
		this.pid=0;
		this.name="";
		this.address="";
	}
	
	public Person(int pid, String name, String address) {//Default Constructor
		this.pid=pid;
		this.name=name;
		this.address=address;
	}

	//Getters
	public int getPID() {
		return this.pid;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	
	//Setters
	public void setPID(int pid) {
		this.pid=pid;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	@Override
	public String toString() {
		return this.pid+", "+this.name+", "+this.address;
	}
}
