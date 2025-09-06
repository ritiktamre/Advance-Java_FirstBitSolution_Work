package entity;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {

		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(12,"Ritik","Male",23));
		a1.add(new Student(1,"Raju","Male",26));
		a1.add(new Student(100,"Akshay","Male",22));
		a1.add(new Student(13,"Anisha","Female",24));
		a1.add(new Student(10,"Ankita","Female",23));
		a1.add(new Student(15,"yogesh","Male",24));
		a1.add(new Student(101,"Shweta","Female",23));
		
		System.out.println("--Print the All Person By Name--");
		a1.stream().forEach(rittu -> System.out.println(rittu.getName()));
		System.out.println();//next line ke use liye use kiya h
		
		System.out.println("-- print the All Person by RollNo--");
		a1.stream().forEach(rittu -> System.out.println(rittu.getRollNo()));
		System.out.println();//next line ke use liye use kiya h
		
		System.out.println("-- Print the All person By All Details --");
		a1.stream().forEach(rittu -> System.out.println(rittu.toString()));
		System.out.println();//next line ke use liye use kiya h
		
		System.out.println("-- Print the Search the rollNo is 12 by Student and Print the Details --");
		a1.stream().filter(rittu->rittu.getRollNo()==12).forEach(rittu->System.out.println(rittu.toString()));
		System.out.println();//next line ke use liye use kiya h
		
		System.out.println("-- Print the Search the gender is Female by student and print the details--");
		a1.stream().filter(rittu->rittu.getGender().equals("Female")).forEach(rittu->System.out.println(rittu.toString()));
		System.out.println();//next line ke liye use kiya
		
		System.out.println("-- print the age is greater than 23 --");
		a1.stream().filter(rittu->rittu.getAge()>23).forEach(rittu->System.out.println(rittu.toString()));
	}

	

}
