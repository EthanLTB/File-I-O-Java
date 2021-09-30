package com.ethanbradley.assignment4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class SortStudents {

	public static void main(String[] args) {
		Student[] allStudents = StudentService.loadStudentsFromFile("student-master-list.csv");
		CompSciStudent[] compSciStudents = new CompSciStudent[50];
		ApmthStudent[] apmthStudents = new ApmthStudent[50];
		StatStudent[] statStudents = new StatStudent[50];
		int compSciCounter = 0;
		int apmthCounter = 0;
		int statCounter = 0;
		BufferedWriter writer = null;

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

		Arrays.sort(compSciStudents, new Comparator<Student>() {
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

		Arrays.sort(apmthStudents, new Comparator<Student>() {
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
		Arrays.sort(statStudents, new Comparator<Student>() {
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

		try {
			writer = new BufferedWriter(new FileWriter("course1.csv"));
			for (int i = 0; i < compSciStudents.length; i++) {
				if (compSciStudents[i] != null) {
					writer.write(StudentService.studentproperties(compSciStudents[i]));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			writer = new BufferedWriter(new FileWriter("course2.csv"));
			for (int i = 0; i < apmthStudents.length; i++) {
				if (apmthStudents[i] != null) {
					writer.write(StudentService.studentproperties(apmthStudents[i]));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			writer = new BufferedWriter(new FileWriter("course3.csv"));
			for (int i = 0; i < statStudents.length; i++) {
				if (statStudents[i] != null) {
					writer.write(StudentService.studentproperties(statStudents[i]));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

//		
	}
}
