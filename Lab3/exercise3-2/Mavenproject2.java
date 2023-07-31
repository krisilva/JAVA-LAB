package com.mycompany.mavenproject2;
public class Mavenproject2 {

    public static void main(String[] args) { 
        Employee employee = new Employee("Amal", 50000, 10000);

        // Get and print Employee information using getters
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Bonus: " + employee.getBonus());
        System.out.println("Bonus Amount: " + employee.calculateBonusAmount());
    }
}

    

