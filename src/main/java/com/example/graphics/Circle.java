package com.example.graphics;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius, double x, double y) {
        super("Circle", x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.printf("Circle(radius=%.2f) at (%.2f, %.2f)%n", radius, x, y);
    }
}