package com.ig.model;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter & Setter methods
    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }

    @Override
    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
