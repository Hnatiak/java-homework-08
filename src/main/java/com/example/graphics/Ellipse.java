package com.example.graphics;

public class Ellipse extends Shape {
    private final double radiusX;
    private final double radiusY;

    public Ellipse(double radiusX, double radiusY, double x, double y) {
        super("Ellipse", x, y);
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    @Override
    public void draw() {
        System.out.printf("Ellipse(rx=%.2f, ry=%.2f) at (%.2f, %.2f)%n", radiusX, radiusY, x, y);
    }
}