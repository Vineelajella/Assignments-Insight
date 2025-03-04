package com.ig.ui;

import com.ig.model.Student;
import com.ig.service.StudentService;
import com.ig.service.StudentServiceImpl;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Connected to Database Successfully!");

        // Adding students
        for (int i = 1; i <= 2; i++) {
            System.out.println("\nEnter details for Student " + i + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Grade: ");
            String grade = scanner.nextLine();

            Student student = new Student(name, age, grade);
            studentService.registerStudent(student);
        }

        // Fetching all students
        System.out.println("\nFetching all students from database...");
        List<Student> students = studentService.fetchAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }

        scanner.close();
    }
}
