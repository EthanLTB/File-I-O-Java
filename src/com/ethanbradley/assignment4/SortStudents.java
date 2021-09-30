package com.ethanbradley.assignment4;

public class SortStudents {

	public static void main(String[] args) {
		Student[] allStudents = StudentService.loadStudentsFromFile("student-master-list.csv");
		CompSciStudent[] compSciStudents = new CompSciStudent[50];
		ApmthStudent[] apmthStudents = new ApmthStudent[50];
		StatStudent[] statStudents = new StatStudent[50];
		int compSciCounter = 0;
		int apmthCounter = 0;
		int statCounter = 0;

		for (int i = 0; i < allStudents.length; i++) {
			if (allStudents[i].getCourse().matches("^COMPSCI\s[0-9]{0,3}")) {
				compSciStudents[compSciCounter] = new CompSciStudent(allStudents[i]);
				compSciCounter++;
			} else if (allStudents[i].getCourse().matches("^APMTH\s[0-9]{0,3}")) {
				apmthStudents[apmthCounter] = new ApmthStudent(allStudents[i]);
				apmthCounter++;
			} else if (allStudents[i].getCourse().matches("^STAT\s[0-9]{0,3}")) {
				statStudents[statCounter] = new StatStudent(allStudents[i]);
				statCounter++;
			}

		}

		StudentService.sortStudentArray(compSciStudents);
		StudentService.sortStudentArray(apmthStudents);
		StudentService.sortStudentArray(statStudents);

		FileService.writeArrayToFile(compSciStudents, "course1.csv");
		FileService.writeArrayToFile(apmthStudents, "course2.csv");
		FileService.writeArrayToFile(statStudents, "course3.csv");

	}
}
