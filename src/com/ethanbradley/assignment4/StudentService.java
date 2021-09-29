package com.ethanbradley.assignment4;

public class StudentService {

	public static Student createStudent(String[] arrs) {
		Student student = new Student();
		student.setStudentID(arrs[0]);  
		student.setStudentName(arrs[1]);
		student.setCourse(arrs[2]); 
		student.setGrade(arrs[3]);
		return student;
	}
	
	public static Student[] loadStudentsFromFile(String fileName) {
		return FileService.loadStudentsFromFile(fileName);
	}
}
