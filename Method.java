package com.company;

import java.util.ArrayList;

public class Method {


    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Student getStudent(String id) {
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentId() == id)
                return students.get(i);
        }
        return null;
    }

    public Course getCourse(String courseName) {
        for(int i = 0; i < courses.size(); i++) {
            if(courses.get(i).getCourseName() == courseName)
                return courses.get(i);
        }
        return null;
    }

    public void assignCourseToStudent(Student student, Course course){
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == student.getStudentId()) {
                students.get(i).getCourses(course);
                for(int j = 0; j < courses.size(); j++){
                    if(courses.get(i).getCourseName().equals(course.getCourseName())){
                        courses.get(i);
                    }
                }
            }
        }
    }

}
