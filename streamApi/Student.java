package entity;

public class Student {

	int rollNo;
	String name;
	String gender;
	int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, String gender, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	int getRollNo() {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
