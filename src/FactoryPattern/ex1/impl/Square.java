package FactoryPattern.ex1.impl;

import FactoryPattern.ex1.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square - draw() Method.");
    }
}
