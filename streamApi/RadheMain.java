package entity;

import java.util.ArrayList;

public class RadheMain {
	
	public static void main(String[] args) {
		
		ArrayList<Radhe> a1 = new ArrayList<Radhe>();
		a1.add(new Radhe (12,"Ritik",30000,"Male",23));
		a1.add(new Radhe(13,"Ram",40000,"Male",25));
		a1.add(new Radhe(14,"Shweta",20000,"Female",22));
		a1.add(new Radhe(11,"Shifa",15000,"Female",21));
		
		System.out.println("--- Print all the Employee in the table ---");
		a1.stream().forEach(rittu->System.out.println(rittu.toString()));
		System.out.println();//next line used
		
		System.out.println("-- Print all the Name in the Table --");
		a1.stream().forEach(rittu->System.out.println(rittu.getName()));
		System.out.println();//next line used
		
		System.out.println("-- Print the Employee Name Ritik in the table --");
		a1.stream().filter(rittu->rittu.getName().equals("Ritik")).forEach(rittu->System.out.println(rittu.toString()));
        System.out.println();//next line used
        
        System.out.println("-- Print the All Employee Male in the Table --");
        a1.stream().filter(rittu->rittu.getGender().equals("Male")).forEach(rittu->System.out.println(rittu.toString()));
	    System.out.println();//next line used
	    
	    System.out.println("-- Print the Employee age >=23 in the table --");
	    a1.stream().filter(rittu->rittu.getAge()>=23).forEach(rittu->System.out.println(rittu.toString()));
	}
}