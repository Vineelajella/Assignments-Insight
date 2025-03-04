package com.ig.dao;

import com.ig.model.Student;
import com.ig.util.DbUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public void addStudent(Student student) {
        String query = "INSERT INTO Student (Name, Age, Grade) VALUES (?, ?, ?)";
        
        try (Connection conn = DbUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getAge());
            stmt.setString(3, student.getGrade());

            stmt.executeUpdate();
            System.out.println("Student " + student.getName() + " added successfully!");

        } catch (SQLException e) {
            System.err.println("Error inserting student: " + e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM Student";
        
        try (Connection conn = DbUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Student student = new Student(
                        rs.getString("Name"),
                        rs.getInt("Age"),
                        rs.getString("Grade")
                );
                student.setRollNo(rs.getInt("RollNo"));
                students.add(student);
            }

        } catch (SQLException e) {
            System.err.println("Error fetching students: " + e.getMessage());
        }
        return students;
    }
}
