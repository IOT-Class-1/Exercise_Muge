package com.mugeakcaymext;

public class engineer extends employee {
        public engineer(String name, double salary, int age) {
            super(name, salary, age);
        }

        public double getAnnualBonus() {
            return super.salary * 0.5;
        }

    }
