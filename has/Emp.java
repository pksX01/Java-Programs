package com.info.has;

public class Emp {
	int eno;
	String name;
	String designation;
	Project project;

	public Emp(int eno, String name, String designation) {
		this.eno = eno;
		this.name = name;
		this.designation = designation;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	public void printEmployee() {
		System.out.println("Number = "+eno);
		System.out.println("Name = "+name);
		System.out.println("Desingation = "+designation);
		
		if(project != null)
			project.printProject();
		else
			System.out.println("No prject is assigned");
	}

	
}
