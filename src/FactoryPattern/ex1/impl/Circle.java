package FactoryPattern.ex1.impl;

import FactoryPattern.ex1.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle - draw() Method.");
    }
}
