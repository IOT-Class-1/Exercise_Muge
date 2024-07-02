package com.udemyex;

public class Student extends  Person {
    public String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Student(String name, int age, String email, String studentIdId){
        super(name, age, email);
        this.studentId =studentIdId;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("StudentID:" +studentId);
    }
}
