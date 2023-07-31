package com.mycompany.mavenproject5;
public class Mavenproject5 {

    public static void main(String[] args) {
        // Creating two Employee objects
        Employee mrBogdan = new Employee();
        Employee msBird = new Employee();

        // Setting values using setters
        mrBogdan.setEmpID(1);
        mrBogdan.setEmpName("Mr. Bogdan");
        mrBogdan.setEmpDesignation("Software Engineer");

        msBird.setEmpID(2);
        msBird.setEmpName("Ms. Bird");
        msBird.setEmpDesignation("Product Manager");

        // Printing values using getters
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

        System.out.println();

        System.out.println("Employee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
    }
}

    

