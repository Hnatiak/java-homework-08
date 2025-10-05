package com.example.graphics;

public class Triangle extends Shape {
    private final double a, b, c;

    public Triangle(double a, double b, double c, double x, double y) {
        super("Triangle", x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.printf("Triangle(sides=%.2f, %.2f, %.2f) at (%.2f, %.2f)%n", a, b, c, x, y);
    }
}