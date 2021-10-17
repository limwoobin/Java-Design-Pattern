package FactoryMethodPattern.ex1.impl;

import FactoryMethodPattern.ex1.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle - draw() Method.");
    }
}
