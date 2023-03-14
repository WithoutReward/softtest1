package org.example;


public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 4, 6);
        System.out.println(type);
    }
}

