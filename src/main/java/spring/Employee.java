package spring;

public class Employee {
	String name;
	int id;
	String course;
	
	Address address;
	
	public Employee() {

	}

	public Employee(String name, int id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}
	

	public Employee(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", course=" + course + ", address=" + address + "]";
	}
	
	
	
	
}
