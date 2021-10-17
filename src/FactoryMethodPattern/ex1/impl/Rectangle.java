package FactoryMethodPattern.ex1.impl;

import FactoryMethodPattern.ex1.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle - draw() Method.");
    }
}
