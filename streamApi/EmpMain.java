package entity;

import java.util.LinkedList;
import java.util.List;

public class EmpMain {



	public static void main(String[] args) {
		List<Employee> l1=new LinkedList<Employee>();
		l1.add(new Employee(23,"Ritik",20000,"M"));
		l1.add(new Employee(21,"Yogesh",25000,"M"));
		l1.add(new Employee(22,"Lalana",10000,"F"));
		l1.add(new Employee(23,"Ankita",15000,"F"));
		
	//	l1.stream().forEach(ref->System.out.println(ref.getName())); //y alg h 
		l1.stream().filter(ref -> ref.getName().equals("Yogesh")).forEach(ref -> System.out.println(ref.toString())); //y alag h
		
	
	}

}
