package entity;

public class Employee {

	int id;
	String name;
	double salary;
	String gender;
	
public Employee() {
	// TODO Auto-generated constructor stub
}


	public Employee(int id, String name, double salary,String gender) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.gender=gender;
}


	int getId() {
		return id;
	}


	void setId(int id) {
		this.id = id;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	double getSalary() {
		return salary;
	}


	void setSalary(double salary) {
		this.salary = salary;
	}


	String getGender() {
		return gender;
	}


	void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
	}




}
