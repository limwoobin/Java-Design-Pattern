package FactoryPattern.ex6.impl;

import FactoryPattern.ex6.Factory;

public class Vulture implements Factory {
    @Override
    public void hi() {
        System.out.println("Im Vulture");
    }
}
