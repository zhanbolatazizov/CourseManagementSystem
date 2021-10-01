package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User {

    private String studentId;
    private ArrayList<Course> courses = new ArrayList<>();

    Scanner in = new Scanner(System.in);

    public Student(String username, String password, String name, String surname, String studentId) {
        super(username, password, name, surname);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void getCourses(Course course) {
        courses.add(course);
    }

    public void removeCourse(String username) {
        System.out.print("Enter the course name for delete: ");
        String deleteCourse = in.nextLine();
        int deleteCount = 0;
        for(int i = 0; i < courses.size(); i++) {
            if(courses.get(i).getCourseName().equals(deleteCourse)) {
                courses.remove(deleteCount);
                i++;
                deleteCount++;
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "username: '" + getUsername() + '\'' +
                ", password: '" + getPassword() + '\'' +
                ", name: '" + getName() + '\'' +
                ", surname: '" + getSurname() + '\'' +
                ", studentId: '" + studentId + '\'' +
                ", courses: '" + courses + '\'' +
                "}";
    }
}
