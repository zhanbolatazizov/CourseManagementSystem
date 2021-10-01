package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Run {

    Scanner in = new Scanner(System.in);
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    Method method = new Method();
    Student student;
    Course course;

    public void adminMethod() {
        System.out.print("Enter the username: ");
        String username = in.nextLine();
        System.out.print("Enter the password: ");
        String password = in.nextLine();
        System.out.print("Enter the name: ");
        String name = in.nextLine();
        System.out.print("Enter the surname: ");
        String surname = in.nextLine();
        Admin admin = new Admin(username, password, name, surname);
        if(username.contains("Admin") && password.contains("12345")) {
            System.out.println(admin);
            int chooce = -1;
            while(chooce != 0) {
                System.out.println("Select one of following the items: ");
                System.out.println("1: Add student");
                System.out.println("2: Delete student");
                System.out.println("3: Edit student");
                System.out.println("4: Add course");
                System.out.println("5: Delete course");
                System.out.println("6: Edit course");
                System.out.println("7: Assign course to student");
                System.out.println("8: Reassign course to student");
                System.out.println("9: Search courses by student ID");
                chooce = in.nextInt();

                String choose;
                switch(chooce) {
                    case 1:
                        System.out.print("Enter the username: ");
                        String studentUsername = in.nextLine();
                        System.out.print("Enter the password: ");
                        String studentPassword = in.nextLine();
                        if(studentPassword.length() == 5){
                            System.out.print("Enter the name: ");
                        } else {
                            System.out.println("Password must be equal to 5!");
                        }
                        String studentName = in.nextLine();
                        System.out.print("Enter the surname: ");
                        String studentSurname = in.nextLine();
                        System.out.print("Enter the student ID");
                        String studentId = in.nextLine();
                        students.add(new Student(studentUsername, studentPassword, studentName, studentSurname, studentId));
                        System.out.print("Username: " + studentUsername + ", password: " + studentPassword + ", name: " + studentName + ", surname: " + studentSurname + ", ID: " + studentId);
                        File file = new File("students.dat");
                        FileWriter fileWriter;
                        try{
                            fileWriter = new FileWriter(file);
                            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                            for(int i = 0; i < students.size(); i++){
                                bufferedWriter.write(students.size());
                            }
                            bufferedWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 2:
                        System.out.print("Enter the username: ");
                        String deleteStudent = in.nextLine();
                        int count = 0;
                        for(int i = 0; i < students.size(); i++) {
                            if (students.get(i).getUsername().equals(deleteStudent)) {
                                students.remove(deleteStudent);
                                i--;
                                count++;
                            }
                        }
                        break;
                    case 3:
//                        System.out.println("Enter the old username: ");
//                        String oldUsername = in.nextLine();
//                        System.out.println("Enter the new username: ");
//                        String newUsername = in.nextLine();
//                        int countTwo = 0;
//                        for(int i = 0; i < students.size(); i++) {
//                            if (students.get(i).getUsername().equals(oldUsername)) {
//                                //students.set(oldUsername, newUsername);
//                            }
//                        }
//                        break;
                    case 4:
                        System.out.print("Enter the name of course: ");
                        String courseName = in.nextLine();
                        System.out.print("Enter the description: ");
                        String description = in.nextLine();
                        System.out.print("Enter the semester: ");
                        int semester = in.nextInt();
                        student.getCourses(new Course(courseName, description, semester));

                        File secondFile = new File("courses.dat");
                        FileWriter secondFileWriter;
                        try{
                            fileWriter = new FileWriter(secondFile);
                            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                            for(int i = 0; i < courses.size(); i++){
                                bufferedWriter.write(courses.size());
                            }
                            bufferedWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        System.out.println("Enter the username");
                        String removeUsername = in.nextLine();
                        student.removeCourse(removeUsername);
                        break;
                    case 6:
                        break;
                    case 7:
                        System.out.print("Enter the student ID: ");
                        String studentAssign = in.nextLine();
                        student = method.getStudent(studentAssign);
                        while(student == null) {
                            System.out.println("Error! Enter the ID: ");
                            studentAssign = in.nextLine();
                            student = method.getStudent(studentAssign);
                        }
                        System.out.println("Enter the name of course: ");
                        String courseAssign = in.nextLine();
                        course = method.getCourse(courseAssign);
                        while(course == null) {
                            System.out.println("Error! Enter the name of course: ");
                            courseAssign = in.nextLine();
                            course = method.getCourse(courseAssign);
                        }

                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    default: choose = "You haven't chosen correctly!";
                        break;
                }

            }
        } else {
            System.out.println("Error!");
        }

    }
}
