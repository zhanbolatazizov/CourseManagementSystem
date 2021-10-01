package com.company;

public class Course {

    private String courseName;
    private String description;
    private int semester;

    public Course(String courseName, String description, int semester) {
        this.courseName = courseName;
        this.description = description;
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}

