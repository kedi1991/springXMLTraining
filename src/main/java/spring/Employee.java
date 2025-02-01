package spring;

public class Employee {
	String name;
	int id;
	String course;
	
	

	public Employee() {

	}
	public Employee(String name, int id, String course) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", course=" + course + "]";
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
	
	
}
