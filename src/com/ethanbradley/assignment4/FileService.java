package com.ethanbradley.assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {

	static BufferedWriter writer = null;

	public static void writeArrayToFile(Student[] studentArray, String fileName) {

		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			for (int i = 0; i < studentArray.length; i++) {
				if (studentArray[i] != null) {
					writer.write(StudentService.studentproperties(studentArray[i]));
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
	}

	public static Student[] loadStudentsFromFile(String fileName) {
		String[] studentStringArray = createStringArrayOfStudents(fileName);
		Student[] students = new Student[101];
		for (int i = 0; i < studentStringArray.length; i++) {
			students[i] = StudentService.createStudent(studentStringArray[i].split(","));
		}
		return students;
	}

	public static String[] createStringArrayOfStudents(String fileName) {
		BufferedReader fileReader = null;
		String[] students = new String[101];

		try {

			fileReader = new BufferedReader(new FileReader(fileName));

			for (int i = 0; i < students.length; i++) {
				students[i] = fileReader.readLine();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return students;
	}
}
