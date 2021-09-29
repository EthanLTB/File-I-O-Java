package com.ethanbradley.assignment4;

public class StatStudent extends Student {
	StatStudent(Student student){
		this.setStudentID(student.getStudentID());
		this.setStudentName(student.getStudentName());
		this.setCourse(student.getCourse());
		this.setGrade(student.getGrade());
		
	}
	

}