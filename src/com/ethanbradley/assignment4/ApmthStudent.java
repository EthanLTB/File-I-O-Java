package com.ethanbradley.assignment4;

public class ApmthStudent extends Student {
	
	ApmthStudent(Student student) {
		this.setStudentID(student.getStudentID());
		this.setStudentName(student.getStudentName());
		this.setCourse(student.getCourse());
		this.setGrade(student.getGrade());

	}
}
