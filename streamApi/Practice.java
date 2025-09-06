package entity;

public class Practice {
	
	int id;
	String name;
	double salary;
	String gender;
	int age;
	
	public Practice() {
		// TODO Auto-generated constructor stub
	}

	public Practice(int id, String name, double salary, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Practice [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + ", age=" + age
				+ "]";
	}
	
	
}