package com.david.student;

import java.util.ArrayList;
import java.util.List;

// Student repository class
public class StudentRepository {
    private List<Student> students;

    // Constructor
    public StudentRepository() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return students;
    }

    // Update student
    public void updateStudent(Student student) {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                s.setFullName(student.getFullName());
                s.setSection(student.getSection());
                break;
            }
        }
    }

    // Delete student
    public void deleteStudent(int studentId) {
        students.removeIf(s -> s.getId() == studentId);
    }
}