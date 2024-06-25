package com.mugeakcaymext;

public class Main {
    public static void main(String[] args) {
        engineer employee1 = new engineer("Müge Akçay", 45000, 24);
        salesPerson employee2= new salesPerson("Emre Eren", 42000, 24, 25);
        employee1.getAnnualBonus();
        employee2.raiseSalary();
        employee2.getCommissionPercentage();

        System.out.println(employee1.salary);
        System.out.println(employee1.getAnnualBonus());
        System.out.println(employee2.salary);
        System.out.println(employee2.getCommissionPercentage());
    }
}
