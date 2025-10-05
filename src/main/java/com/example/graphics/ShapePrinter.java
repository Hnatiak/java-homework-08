package com.example.graphics;

public class ShapePrinter {
    public void printShapeName(Shape shape) {
        // Викликаємо метод базового класу (може бути перевизначений чи взятий із інтерфейсу)
        shape.printName();
    }
}