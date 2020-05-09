package com.info.has;

public class Project {
	String pname;
	String duration;

	public Project(String pname, String duration) {
		System.out.println("Project created");
		this.pname = pname;
		this.duration = duration;
	}
	
	public void printProject() {
		System.out.println("pname = "+pname);
		System.out.println("Duration = "+duration);
		System.out.println("***************************");
	}
	
}
