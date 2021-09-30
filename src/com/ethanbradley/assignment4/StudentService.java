package com.ethanbradley.assignment4;

import java.util.Arrays;
import java.util.Comparator;

public class StudentService {

	public static Student createStudent(String[] arrs) {
		Student student = new Student();
		student.setStudentID(arrs[0]);
		student.setStudentName(arrs[1]);
		student.setCourse(arrs[2]);
		student.setGrade(arrs[3]);
		return student;
	}

	public static String studentproperties(Student student) {
		String studentString = (student.getStudentID() + "," + student.getStudentName() + "," + student.getCourse()
				+ "," + student.getGrade() + "\n");
		return studentString;
	}

	public static void sortStudentArray(Student[] arr) {
		Arrays.sort(arr, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				if (o1 == null && o2 == null) {
					return 0;
				}
				if (o1 == null) {
					return 1;
				}
				if (o2 == null) {
					return -1;
				}
				return o1.compareTo(o2);
			}
		});
	}

	public static Student[] loadStudentsFromFile(String fileName) {
		return FileService.loadStudentsFromFile(fileName);
	}

}
