package com.udemyex;

import com.javason.Card;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseDescription;
    private String instructorId;
    private List<Student>registeredStudents;
    public Course(String courseId, String courseDescription, String instructorId){
        this.courseId = courseId;
        this.courseDescription = courseDescription;
        this.instructorId = instructorId;
        registeredStudents = new ArrayList<>();
    }
    public void addStudent(Student student){
        System.out.println("kayıtlı öğrenciler");
        for (Student s: registeredStudents){
            s.displayInfo();
        }
    }
    public void listStudent(Student student){
        System.out.println("deneme");
        for (Student s: registeredStudents){
            s.displayInfo();
        }
    }
    public void displaycourse(){
        System.out.println("course name" +courseDescription);
    }
}
