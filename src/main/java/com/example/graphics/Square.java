package com.example.graphics;

public class Square extends Rectangle {
    public Square(double side, double x, double y) {
        super(side, side, x, y);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public void draw() {
        System.out.printf("Square(side=%.2f) at (%.2f, %.2f)%n", getWidth(), x, y);
    }
}