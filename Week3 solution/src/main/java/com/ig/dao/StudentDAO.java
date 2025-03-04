package com.ig.dao;

import com.ig.model.Student;
import java.util.List;

public interface StudentDAO {
    void addStudent(Student student);
    List<Student> getAllStudents();
}
