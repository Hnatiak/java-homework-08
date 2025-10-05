package com.example.graphics;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, double x, double y) {
        super("Rectangle", x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    @Override
    public void draw() {
        System.out.printf("Rectangle(%.2f x %.2f) at (%.2f, %.2f)%n", width, height, x, y);
    }
}