package pl.winiarczyk.lesson4.homework.RefactoringFile1;

import java.math.BigDecimal;

public class Employee {

    private final String name;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;
    public static final String whiteSpace = " ";

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + whiteSpace + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + whiteSpace + surname + " is " + age;
    }

    // Method is used to get total  salary
    public BigDecimal getSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public BigDecimal getSalaryWithBonus() {
        return baseSalary.add(bonus);
    }
}