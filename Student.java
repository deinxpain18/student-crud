package com.david.student;

// Student class
public class Student {
    private int id;
    private String fullName;
    private String section;

    // Constructor
    public Student(int id, String fullName, String section) {
        this.id = id;
        this.fullName = fullName;
        this.section = section;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}