package com.example.graphics;

public interface Nameable {
    String getName();

    default void printName() {
        System.out.println(getName());
    }
}