package com.info.has;

public class HasADemo2 {
	public static void main(String[] args) {
		
		Emp emp = new Emp(1001, "Kiran", "Lead");
		
		Project project = new Project("Hotstar", "2 years");
		
		emp.setProject(project);
		
		emp.printEmployee();

		
	} 
	
}
