package com.maxn.patterns.composite;

public class CompositeMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();
        Composite composite = new Composite();
        composite.addComponent(triangle);
        composite.addComponent(square);
        composite.draw();
    }
}
