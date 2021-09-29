package com.ethanbradley.assignment4;

public class CompSciStudent extends Student {
		
CompSciStudent(Student student){
	this.setStudentID(student.getStudentID());
	this.setStudentName(student.getStudentName());
	this.setCourse(student.getCourse());
	this.setGrade(student.getGrade());
	
}


}



