package FactoryMethodPattern.ex6.impl;

import FactoryMethodPattern.ex6.Factory;

public class Vulture implements Factory {
    @Override
    public void hi() {
        System.out.println("Im Vulture");
    }
}
