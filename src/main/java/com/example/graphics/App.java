package com.example.graphics;

public class App {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Shape[] shapes = new Shape[] {
            new Circle(5.0, 10.0, 10.0),
            new Rectangle(4.0, 6.0, 0.0, 0.0),
            new Square(3.0, 1.0, 1.0),
            new Triangle(3.0, 4.0, 5.0, 2.0, 2.0),
            new Ellipse(2.0, 1.0, 5.0, 5.0)
        };

        for (Shape s : shapes) {
            printer.printShapeName(s);   // працює однаково для всіх фігур
            s.draw();                   // демонструємо поліморфізм draw()
            System.out.println("---");
        }
    }
}