package com.example.graphics;

/**
 * Інтерфейс для об'єктів, що мають ім'я та можуть вивести його.
 */
public interface Nameable {
    String getName();

    default void printName() {
        System.out.println(getName());
    }
}