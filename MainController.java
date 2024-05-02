package com.david.student;

import java.util.List;

// Main controller class
public class MainController {
    private StudentRepository studentRepo;

    // Constructor
    public MainController(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    // List all students
    public List<Student> getAllStudents() {
        return studentRepo.getAllStudents();
    }

    // Add new student
    public void addStudent(Student student) {
        studentRepo.addStudent(student);
    }

    // Edit student
    public