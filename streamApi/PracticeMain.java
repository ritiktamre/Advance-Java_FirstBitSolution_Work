package entity;

import java.util.ArrayList;

public class PracticeMain {
	
	public static void main(String[] args) {
		
		ArrayList<Practice> p1 = new  ArrayList<Practice>();
		p1.add(new Practice(12,"Radhe",30000,"Female",23));
		p1.add(new Practice(1,"Gori jii",35000,"Female",26));
		p1.add(new Practice(34,"Shiv jii",25000,"Male",28));
		p1.add(new Practice(67,"Shyam",30000,"Male",24));
		p1.add(new Practice(6,"Bappa",20000,"Male",22));
		p1.add(new Practice(84,"MahaMai",40000,"Female",24));
		
		System.out.println("-- print all details in the table --");
		p1.stream().forEach(rittu->System.out.println(rittu.toString()));
		System.out.println();//next line
		
		System.out.println("-- print the Name in the table --");
		p1.stream().forEach(rittu->System.out.println(rittu.getName()));
		System.out.println();//next line
		
		System.out.println("-- print the Radhe details in the table --");
		p1.stream().filter(rittu->rittu.getName().equals("Radhe")).forEach(rittu->System.out.println(rittu.toString()));
        System.out.println();//next line
        
        System.out.println("-- print the Salary > 25000 in the table --");
        p1.stream().filter(rittu->rittu.getSalary()>25000).forEach(rittu->System.out.println(rittu.toString()));
        System.out.println();//next line
        
        System.out.println("-- print the Gender Male in the table --");
        p1.stream().filter(rittu->rittu.getGender().equals("Male")).forEach(rittu->System.out.println(rittu.toString()));
        System.out.println();//next line
        
        System.out.println("-- print the age > 24 in the table --");
        p1.stream().filter(rittu->rittu.getAge()>24).forEach(rittu->System.out.println(rittu.getName()));
	}
}