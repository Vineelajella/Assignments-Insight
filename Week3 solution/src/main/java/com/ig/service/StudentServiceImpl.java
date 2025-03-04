package com.ig.service;

import com.ig.dao.StudentDAO;
import com.ig.dao.StudentDAOImpl;
import com.ig.model.Student;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    public void registerStudent(Student student) {
        studentDAO.addStudent(student);
    }

    @Override
    public List<Student> fetchAllStudents() {
        return studentDAO.getAllStudents();
    }
}
