package com.example.graphics;

public abstract class Shape implements Nameable, Drawable {
    private final String typeName;
    protected double x;
    protected double y;

    protected Shape(String typeName, double x, double y) {
        this.typeName = typeName;
        this.x = x;
        this.y = y;
    }

    @Override
    public String getName() {
        return typeName;
    }

    // Згідно вимоги: метод у базовому класі для виведення назви
    public void printName() {
        System.out.println("Shape: " + getName());
    }

    @Override
    public void draw() {
        // Базова текстова реалізація (можна перевизначити)
        System.out.println("Drawing " + getName() + " at (" + x + ", " + y + ")");
    }
}