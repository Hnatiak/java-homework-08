package com.example.graphics;

/**
 * Клас, що приймає Shape і виводить її назву.
 * Цей клас залежить лише від базового типу Shape — демонстрація поліморфізму.
 */
public class ShapePrinter {
    public void printShapeName(Shape shape) {
        // Викликаємо метод базового класу (може бути перевизначений чи взятий із інтерфейсу)
        shape.printName();
    }
}