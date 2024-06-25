package com.mugeakcaymext;

public class employee {
private String name;
protected double salary;
private int age;

    public void setName(String name) {
        this.name = name;
    }

    public employee(String name, double salary, int age){
    this.name = name;
    this.salary = salary;
    this.age = age;
}
public String getName(){
    return this.name;
}
public double getSalary(){
    return this.salary;
}

    public int getAge() {
        return age;
    }
    public void raiseSalary(){
    this.salary = this.salary*1.2;
    }
}
