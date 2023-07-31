package com.mycompany.mavenproject4;
public class Mavenproject4 {

    public static void main(String[] args) {
          Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 3.0);

        System.out.println("Circle Area:");
        circle.display();

        System.out.println("\nRectangle Area:");
        rectangle.display();
    }
    
}
