package com.ethanbradley.assignment4;

public class Student {
private String studentID;
private String studentName;
private String course;
private String grade;


Student(){
	
}
Student (String[] studentInfo){
	this.studentID = studentInfo[0];
	this.studentName = studentInfo[1];
	this.course = studentInfo[2];
	this.grade = studentInfo[3];
}
public void printProperties() {
	System.out.println(this.studentID);
	System.out.println(this.studentName);
	System.out.println(this.course);
	System.out.println(this.grade);
}

public String getStudentID() {
	return studentID;
}
public void setStudentID(String arrs) {
	this.studentID = arrs;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}

}
