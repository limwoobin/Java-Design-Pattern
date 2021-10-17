package FactoryMethodPattern.ex1.impl;

import FactoryMethodPattern.ex1.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square - draw() Method.");
    }
}
