package com.mycompany.employeeobj;
public class EmployeeObj {

    public static void main(String[] args) {
       
        // Create an instance of the Employee class
        Employee employee = new Employee();

        // Set values using setters
        employee.setName("Anne");
        employee.setAge(30);
        employee.setSalary(50000.0);

        // Get and print values using getters
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    }
}

    

