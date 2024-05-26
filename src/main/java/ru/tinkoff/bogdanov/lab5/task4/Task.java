package ru.tinkoff.bogdanov.lab5.task4;

import java.util.ArrayList;

public class Task {

    public static void main(String[] args) {
        var employees = new ArrayList<Employee>();

        var e = new Engineer(
                "Bob",
                "Bobik",
                100.0,
                4
        );

        var m = new Manager(
                "Biba",
                "Bobik",
                100.0,
                "IT"
        );

        var s = new Secretary(
                "John",
                "Bobik",
                100.0,
                "12345678"
        );

        var d = new Director(
                "Mark",
                "Bobik",
                100.0,
                "admin"
        );
        employees.add(e);
        employees.add(m);
        employees.add(s);
        employees.add(d);

        for (Employee employee : employees) {
            System.out.println("employee.name = " + employee.name());
        }
    }

    abstract static class Employee {
        private final String name;
        private final String surname;
        private final Double salary;

        public Double salary() {
            return salary;
        }

        public String surname() {
            return surname;
        }

        public String name() {
            return name;
        }

        public Employee(String name, String surname, Double salary) {
            this.name = name;
            this.surname = surname;
            this.salary = salary;
        }
    }

    static class Engineer extends Employee {

        private final int grade;

        public Engineer(String name, String surname, Double salary, int grade) {
            super(name, surname, salary);
            this.grade = grade;
        }

        public int grade() {
            return grade;
        }
    }

    static class Manager extends Employee {

        private final String direction;

        public Manager(String name, String surname, Double salary, String direction) {
            super(name, surname, salary);
            this.direction = direction;
        }

        public String direction() {
            return direction;
        }
    }

    static class Secretary extends Employee {

        private final String phone;

        public Secretary(String name, String surname, Double salary, String phone) {
            super(name, surname, salary);
            this.phone = phone;
        }

        public String phone() {
            return phone;
        }
    }

    static class Director extends Employee {

        private final String password;

        public Director(String name, String surname, Double salary, String password) {
            super(name, surname, salary);
            this.password = password;
        }

        public String password() {
            return password;
        }
    }
}
