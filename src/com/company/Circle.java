package com.company;


public class Circle {
    private static final double pi = Math.PI;

    public static void area(double radius) {
        System.out.println(pi * radius * radius);
    }

    public static void circumference(double circumference) {
        System.out.println((pi * 2) * circumference);
    }
}
