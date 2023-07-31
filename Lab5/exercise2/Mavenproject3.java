package com.mycompany.mavenproject3;
public class Mavenproject3 {

    public static void main(String[] args) {
        Speaker politician = new Politician();
        Speaker priest = new Priest();
        Speaker lecturer = new Lecturer();

        System.out.println("Politician's Speech:");
        politician.speak();

        System.out.println("\nPriest's Sermon:");
        priest.speak();

        System.out.println("\nLecturer's Lecture:");
        lecturer.speak();
    }
}
