package com.udemyex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("müge", 24, "muge.com", "10");
        student.displayInfo();

        Instructor instructor = new Instructor("irem", 30, "irem.com", "77", "ins");
        instructor.displayInfo();

        List<Student> students = new ArrayList<>();
        List<Instructor> instructors = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        Student student1 = new Student("damla", 23, "damla.com", "455");
        Student student2 = new Student("özlem", 23, "özlem.com", "445");

        students.add(student1);
        students.add(student2);


        Instructor instructor1 = new Instructor("irem", 30, "irem.com", "147", "ins");
        Instructor instructor2 = new Instructor("merve", 30, "merve.com", "258", "ins");

        instructors.add(instructor1);
        instructors.add(instructor2);

        Course course1 = new Course("1", "java", "45");
        course1.addStudent(student1);
        Course course2 = new Course("2", "c", "58");
        course2.addStudent(student2);

        courses.add(course1);
        courses.add(course2);

        for (Course c : courses) {
            c.displaycourse();
            c.listStudent(S);
        }
    }
}