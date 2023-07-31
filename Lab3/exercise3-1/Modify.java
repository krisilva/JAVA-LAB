package com.mycompany.modify;
public class Modify {
    public static void main(String[] args) {
        Employee employee = new Employee("Anne", 30, 50000.0);
        
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    }
}



