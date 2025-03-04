package com.ig.service;

import com.ig.model.Student;
import java.util.List;

public interface StudentService {
    void registerStudent(Student student);
    List<Student> fetchAllStudents();
}
