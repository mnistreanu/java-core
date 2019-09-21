package com.maxn.patterns.composite;

import java.util.ArrayList;
import java.util.Collection;

public class Composite implements Shape {

    private Collection<Shape> components = new ArrayList<>();

    public void addComponent(Shape component) {
        components.add(component);
    }

    public void removeComponent(Shape component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        for (Shape component : components) {
            component.draw();
        }
    }
}
