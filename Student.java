package maping;

public class Student {
	public String name;
	public String id;
	public String department;
	public String email;
	public String getName() {
		return name;
	}
	
	public Student(String name, String id, String department, String email) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.email = email;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department=" + department + ", email=" + email + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
